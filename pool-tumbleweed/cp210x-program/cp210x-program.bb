SUMMARY = "EEPROM tool for Silabs CP210x USB-Serial adapters"
DESCRIPTION = "The CP210x is an USB-to-serial chip used in a lot of USB devices (similar to \
FTDIs and PL2303). The CP210x has a EEPROM on the chip which can be programmed \
with this tool via USB."
LICENSE = "LGPL-2.1-only"

PV = "0.4"

RPM_NAME = "cp210x-program-0.4-1.9.noarch.rpm"
RPM_HASH = "9737f0234e50f49860dcfa55adc272fdd8034d7d61f74718864628459876f870a98c8b7e1cff1ee0eb5476bdaae655e00631060855b78082a43f94638c7ebc39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cp210x-program \
python3.11dist-cp210x-program \
python3dist-cp210x-program"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-pyusb"

inherit rpm
