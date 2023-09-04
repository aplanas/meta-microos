SUMMARY = "Kismet Linux WiFi capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains Kismet Linux WiFi capture helper."
LICENSE = "GPL-2.0-or-later"

PV = "2023_07_R1"

RPM_NAME = "kismet-capture-linux-wifi-2023_07_R1-1.1.aarch64.rpm"
RPM_HASH = "3313a54251c5886a3bd1dcdb02e755744b8ef51de57079d610ab0a1a3c02cb758c7276c46395dde966ce643f148fc4c221dfeef6408febab58504dc6ad3c3abb"

RPROVIDES:${PN} += "kismet-capture-linux-wifi"

RDEPENDS:${PN} += "/usr/bin/sh \
group-kismet \
kismet-common \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libgobject-2.0.so.0 \
libm.so.6 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
libnm.so.0 \
libpcap.so.1 \
libprotobuf-c.so.1 \
libwebsockets.so.19 \
permissions"

inherit rpm
