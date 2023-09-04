SUMMARY = "Kismet SDR rtlamr capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains Kismet SDR rtlamr capture helper. \
https://kismetwireless.net/docs/readme/datasources_sdr_rtlamr/"
LICENSE = "GPL-2.0-or-later"

PV = "2023_07_R1"

RPM_NAME = "kismet-capture-sdr-rtlamr-2023_07_R1-1.1.noarch.rpm"
RPM_HASH = "790f1c4e0abf6c3845c691299229192e43f732ad81caeb9342f5000f110c4425e2a55beeec434b2082d66f150a2915ce20deba34565ed152aeaa81a0e0c122cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kismet-capture-sdr-rtlamr \
python3.11dist-kismetcapturertlamr \
python3dist-kismetcapturertlamr"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-numpy \
python3-protobuf \
python3-websockets"

inherit rpm
