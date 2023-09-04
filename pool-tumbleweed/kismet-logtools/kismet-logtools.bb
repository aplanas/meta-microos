SUMMARY = "Kismet logtools"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains several kismetdb log tools \
 - kismetdb_dump_devices \
 - kismetdb_statistics \
 - kismetdb_strip_packets \
 - kismetdb_to_kml \
 - kismetdb_to_wiglecsv"
LICENSE = "GPL-2.0-or-later"

PV = "2023_07_R1"

RPM_NAME = "kismet-logtools-2023_07_R1-1.1.aarch64.rpm"
RPM_HASH = "12a27aa31cd65e270f65f077ea9d1c6ad7d90e6d0d872342dcd20e953e44b3f8a871010a6c1b78a849fe411d9d0acb401474bcd223e055552e0f6576118d9920"

RPROVIDES:${PN} += "kismet-logtools"

RDEPENDS:${PN} += "kismet \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpcap.so.1 \
libpcre2-8.so.0 \
libsqlite3.so.0 \
libstdc++.so.6"

inherit rpm
