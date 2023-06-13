SUMMARY = "Kismet SDR rtl433 capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains Kismet SDR rtl433 capture helper. \
https://kismetwireless.net/docs/readme/datasources_sdr_rtl433/"
LICENSE = "GPL-2.0-or-later"

PV = "2022_08_R1"

RPM_NAME = "kismet-capture-sdr-rtl433-2022_08_R1-2.3.aarch64.rpm"
RPM_HASH = "3cd30d72496bc2eb76ce914953a6835e9691c6e0d72d09372e455aa5910f8618a4f1d512c9980368b8721991f48e875d100563e11a87ed08c4a1944af7f5c936"

RPROVIDES:${PN} += "kismet-capture-sdr-rtl433 \
kismet-capture-sdr-rtl433(aarch-64) \
python3.10dist(kismetcapturertl433) \
python3dist(kismetcapturertl433)"

RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3-protobuf \
python3-websockets \
rtl_433"

inherit rpm
