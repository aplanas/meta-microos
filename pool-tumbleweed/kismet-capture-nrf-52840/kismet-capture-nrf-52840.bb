SUMMARY = "Kismet nRF 52840 (BTLE) capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains the nRF 52840 BTLE capture helper."
LICENSE = "GPL-2.0-or-later"

PV = "2022_08_R1"

RPM_NAME = "kismet-capture-nrf-52840-2022_08_R1-2.5.aarch64.rpm"
RPM_HASH = "745993f95b13d73b79673f377dd955447feabe2a223b4dd70f1ce9e831e644db15eaa161cde961b37ce5b0b26980b15e946f4a13e026d7c775b59473815f905f"

RPROVIDES:${PN} += "kismet-capture-nrf-52840"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libprotobuf-c.so.1 \
libwebsockets.so.19"

inherit rpm
