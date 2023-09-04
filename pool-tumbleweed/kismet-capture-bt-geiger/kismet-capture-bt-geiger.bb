SUMMARY = "Kismet BTLE geiger counter capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains the BTLE geiger counter capture helper."
LICENSE = "GPL-2.0-or-later"

PV = "2023_07_R1"

RPM_NAME = "kismet-capture-bt-geiger-2023_07_R1-1.1.noarch.rpm"
RPM_HASH = "d92538e4058a6116c2f20be4171d2b380a48c55c19e79545ce90910a18f05615e66a3ca5fc60edf4f30a74d89236884e7803ec8e0de83fe87832c498b662c4eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kismet-capture-bt-geiger \
python3.11dist-kismetcapturebtgeiger \
python3dist-kismetcapturebtgeiger"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi"

inherit rpm
