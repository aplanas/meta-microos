SUMMARY = "Kismet nRF 51822 (BTLE) capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains the nRF 51822 BTLE capture helper."
LICENSE = "GPL-2.0-or-later"

PV = "2023_07_R1"

RPM_NAME = "kismet-capture-nrf-51822-2023_07_R1-1.1.aarch64.rpm"
RPM_HASH = "53e39f7630ed704510771c43679c6f5f8a653d2bba37e5a195cef80ef96cb147c8afb7775a09a4e2b48aa1cc1180ce4deb1c63bf57fb590a586f24e13310afd2"

RPROVIDES:${PN} += "kismet-capture-nrf-51822"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libprotobuf-c.so.1 \
libwebsockets.so.19"

inherit rpm
