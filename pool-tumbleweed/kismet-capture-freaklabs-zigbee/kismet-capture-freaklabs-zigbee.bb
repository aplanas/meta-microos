SUMMARY = "Kismet Freaklabs Zigbee capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains the Freaklabs Zigbee capture helper."
LICENSE = "GPL-2.0-or-later"

PV = "2022_08_R1"

RPM_NAME = "kismet-capture-freaklabs-zigbee-2022_08_R1-2.3.aarch64.rpm"
RPM_HASH = "ef6c6c85a1c31b52b07ed3ad233e50245bba5e3ef4d5414d53b7bda011dd66ec38229a9c50eb9270e0eb6001ad40b392e887bd29590bf628c7e8ed625488c285"

RPROVIDES:${PN} += "kismet-capture-freaklabs-zigbee \
kismet-capture-freaklabs-zigbee(aarch-64) \
python3.10dist(kismetcapturefreaklabszigbee) \
python3dist(kismetcapturefreaklabszigbee)"

RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3-protobuf \
python3-pyserial"

inherit rpm
