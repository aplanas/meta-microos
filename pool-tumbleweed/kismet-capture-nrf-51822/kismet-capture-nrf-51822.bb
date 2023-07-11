SUMMARY = "Kismet nRF 51822 (BTLE) capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains the nRF 51822 BTLE capture helper."
LICENSE = "GPL-2.0-or-later"

PV = "2022_08_R1"

RPM_NAME = "kismet-capture-nrf-51822-2022_08_R1-2.5.aarch64.rpm"
RPM_HASH = "b86211a9f9a16e778315c98438c9142157327884474cc6e6b97e458838bcd6054262a368f4a8da95f612fc498b13a0d40dc7b3e98f65bec4ca976e11c096cd6b"

RPROVIDES:${PN} += "kismet-capture-nrf-51822"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libprotobuf-c.so.1 \
libwebsockets.so.19"

inherit rpm
