SUMMARY = "Kismet Linux Bluetooth capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains Kismet Linux Bluetooth capture helper."
LICENSE = "GPL-2.0-or-later"

PV = "2023_07_R1"

RPM_NAME = "kismet-capture-linux-bluetooth-2023_07_R1-1.1.aarch64.rpm"
RPM_HASH = "07b9eacbf3d8bbb7da9522ca2b47fe92240b5b5569e10495bcb65c95b7b8436fcb4d1dc598ba54eb70e6711ca95008bc54b839517017772f85c1f112c43465fc"

RPROVIDES:${PN} += "kismet-capture-linux-bluetooth"

RDEPENDS:${PN} += "/usr/bin/sh \
group-kismet \
kismet-common \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libprotobuf-c.so.1 \
libwebsockets.so.19 \
permissions"

inherit rpm
