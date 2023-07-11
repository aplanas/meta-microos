SUMMARY = "Kismet Linux Bluetooth capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains Kismet Linux Bluetooth capture helper."
LICENSE = "GPL-2.0-or-later"

PV = "2022_08_R1"

RPM_NAME = "kismet-capture-linux-bluetooth-2022_08_R1-2.5.aarch64.rpm"
RPM_HASH = "625e873aa75f8c837fec393c8a6d486cd29555cdab2a8501bf566fb88433f04e860ea26ab0ee5274ec40569915ae5b7d29af6af20c4b44ac7b8f0b185725ec3d"

RPROVIDES:${PN} += "kismet-capture-linux-bluetooth"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libprotobuf-c.so.1 \
libwebsockets.so.19"

inherit rpm
