SUMMARY = "Kismet SDR rtladsb capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains the SDR rtladsb capture helper. \
https://kismetwireless.net/docs/readme/datasources_sdr_rtladsb/"
LICENSE = "GPL-2.0-or-later"

PV = "2022_08_R1"

RPM_NAME = "kismet-capture-sdr-rtladsb-2022_08_R1-2.3.aarch64.rpm"
RPM_HASH = "8bc21ccd3d7bbfeeca6f7db1f22b33113ec0e8287ed3b867b0ea4d2d85b99c0fe150a7867ad0e0d9c37951d323a46d4c0c4c858a71d62a90a957e63c427344d6"

RPROVIDES:${PN} += "kismet-capture-sdr-rtladsb \
kismet-capture-sdr-rtladsb(aarch-64) \
python3.10dist(kismetcapturertladsb) \
python3dist(kismetcapturertladsb)"

RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3-numpy \
python3-protobuf \
python3-websockets \
rtl-sdr"

inherit rpm
