SUMMARY = "Kismet Linux Bluetooth capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains Kismet Linux Bluetooth capture helper."
LICENSE = "GPL-2.0-or-later"

PV = "2022_08_R1"

RPM_NAME = "kismet-capture-linux-bluetooth-2022_08_R1-2.3.aarch64.rpm"
RPM_HASH = "27d5eb9b5bb4c6fb7b202762cfe4a71696dd2a53e076105b8792afbf8e26a8068146c47410640251f9c7bbd19b76e9a5cb6dd0f505172b0cf289f057abbf9a20"

RPROVIDES:${PN} += "kismet-capture-linux-bluetooth"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libprotobuf-c.so.1 \
libwebsockets.so.19"

inherit rpm
