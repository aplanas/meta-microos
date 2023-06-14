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

PV = "2022_08_R1"

RPM_NAME = "kismet-logtools-2022_08_R1-2.3.aarch64.rpm"
RPM_HASH = "8fb4a2057e9b3c3c75d25cd4e2aa41f0c9a77ad03b2aea6c671502a54a44a2e89320483052cadfa8c9dab1db6fe766cda349e25850f8a7d6498e4f3e2375b4ce"

RPROVIDES:${PN} += "kismet-logtools"

RDEPENDS:${PN} += "kismet \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpcap.so.1 \
libpcre.so.1 \
libsqlite3.so.0 \
libstdc++.so.6"

inherit rpm
