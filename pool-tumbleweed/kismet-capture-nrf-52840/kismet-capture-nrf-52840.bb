SUMMARY = "Kismet nRF 52840 (BTLE) capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains the nRF 52840 BTLE capture helper."
LICENSE = "GPL-2.0-or-later"

PV = "2023_07_R1"

RPM_NAME = "kismet-capture-nrf-52840-2023_07_R1-1.1.aarch64.rpm"
RPM_HASH = "941432db6708b7ad503f05d61c3a7048d5ab43dc6e34500077b60f71743f229f69e27d35b10a73061e8d742472e11a8b1dec1ff8f4b21ed6b026c597e5bab62e"

RPROVIDES:${PN} += "kismet-capture-nrf-52840"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libprotobuf-c.so.1 \
libwebsockets.so.19"

inherit rpm
