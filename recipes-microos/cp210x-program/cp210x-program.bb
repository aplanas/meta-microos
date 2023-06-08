SUMMARY = "EEPROM tool for Silabs CP210x USB-Serial adapters"
DESCRIPTION = "The CP210x is an USB-to-serial chip used in a lot of USB devices (similar to \
FTDIs and PL2303). The CP210x has a EEPROM on the chip which can be programmed \
with this tool via USB."
LICENSE = "LGPL-2.1-only"

PV = "0.4"

RPM_NAME = "cp210x-program-0.4-1.8.noarch.rpm"
RPM_HASH = "46c226463434da530a809961c96260f9a27df89b6716301e950c0db594f06cf25c5848a7b9a5a46cbcbe42bd0fae3ee731e32e2782e4f1d2ea340374ff8c180f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cp210x-program python3.10dist(cp210x-program) python3dist(cp210x-program)"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3-pyusb"

inherit rpm
