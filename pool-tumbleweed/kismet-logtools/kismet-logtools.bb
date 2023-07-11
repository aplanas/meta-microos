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

RPM_NAME = "kismet-logtools-2022_08_R1-2.5.aarch64.rpm"
RPM_HASH = "f1a903614a67c4002858b33ccad021b8072d6d4bb1dd9e06365b1291323b057d13159e63f69f1c220bdc56e1b585e6ce5297da80c84464655e87ebb13325f625"

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
