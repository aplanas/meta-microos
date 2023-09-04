SUMMARY = "Kismet SDR rtl433 capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains Kismet SDR rtl433 capture helper. \
https://kismetwireless.net/docs/readme/datasources_sdr_rtl433/"
LICENSE = "GPL-2.0-or-later"

PV = "2023_07_R1"

RPM_NAME = "kismet-capture-sdr-rtl433-2023_07_R1-1.1.noarch.rpm"
RPM_HASH = "a8f4d3680c599a16f97ee32f8b8d127309be033e5ef09461bab079450b5f8095d7d56b47615b3d6bc24f537f0497e95e93ece11d8ae868fa529b0ff0659839af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kismet-capture-sdr-rtl433 \
python3.11dist-kismetcapturertl433 \
python3dist-kismetcapturertl433"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-protobuf \
python3-websockets \
rtl-433"

inherit rpm
