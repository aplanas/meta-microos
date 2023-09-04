SUMMARY = "Kismet Freaklabs Zigbee capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains the Freaklabs Zigbee capture helper."
LICENSE = "GPL-2.0-or-later"

PV = "2023_07_R1"

RPM_NAME = "kismet-capture-freaklabs-zigbee-2023_07_R1-1.1.noarch.rpm"
RPM_HASH = "213221e4a9b23937156c9d7c14c1f6c417e5bc827cf7e84d16108eb0eaf0bcedf39dd8446fefb0c3764c5ae5b35f3a04bacf4a1c5f3aff71aba9a3caf787b4e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kismet-capture-freaklabs-zigbee \
python3.11dist-kismetcapturefreaklabszigbee \
python3dist-kismetcapturefreaklabszigbee"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-protobuf \
python3-pyserial"

inherit rpm
