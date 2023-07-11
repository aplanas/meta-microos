SUMMARY = "Kismet Freaklabs Zigbee capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains the Freaklabs Zigbee capture helper."
LICENSE = "GPL-2.0-or-later"

PV = "2022_08_R1"

RPM_NAME = "kismet-capture-freaklabs-zigbee-2022_08_R1-2.5.aarch64.rpm"
RPM_HASH = "470b0da5e24f5f3f7c53bbc9699b051c46884b64d37b390a791b9884e12d176187a00fa05826202e594ba20ef69df160d3065be5cf86463f6c39c42c942bd5ef"

RPROVIDES:${PN} += "kismet-capture-freaklabs-zigbee \
python3.11dist-kismetcapturefreaklabszigbee \
python3dist-kismetcapturefreaklabszigbee"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-protobuf \
python3-pyserial"

inherit rpm
