SUMMARY = "Kismet SDR rtladsb capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains the SDR rtladsb capture helper. \
https://kismetwireless.net/docs/readme/datasources_sdr_rtladsb/"
LICENSE = "GPL-2.0-or-later"

PV = "2022_08_R1"

RPM_NAME = "kismet-capture-sdr-rtladsb-2022_08_R1-2.5.aarch64.rpm"
RPM_HASH = "9c9ac932eb7a4d5b2fd2cc4ca89027df7da34a93048e0c2202770530bbcb420073e0cbd596c38ebcd2eff4831dc736e2c4c9840ec3ddad3333759ba6b9247229"

RPROVIDES:${PN} += "kismet-capture-sdr-rtladsb \
python3.11dist-kismetcapturertladsb \
python3dist-kismetcapturertladsb"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-numpy \
python3-protobuf \
python3-websockets \
rtl-sdr"

inherit rpm
