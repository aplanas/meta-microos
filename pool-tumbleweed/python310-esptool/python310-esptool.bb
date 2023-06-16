SUMMARY = "A serial utility to communicate & flash code to Espressif ESP8266 & ESP32 chips"
DESCRIPTION = "A command line utility to communicate with the ROM bootloader in Espressif ESP8266 & ESP32 microcontrollers. \
 \
Allows flashing firmware, reading back firmware, querying chip parameters, etc."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.1"

RPM_NAME = "python310-esptool-4.5.1-1.1.noarch.rpm"
RPM_HASH = "fba42f15a408e7b3b1a4651956d4b429131bae21527af3de11c6687495f5e980be3d682f1d28c89d5537e773556a761cd7a0a7d7dcb0201be6c46b7a001e56ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-esptool \
python3.10dist-esptool \
python310-esptool \
python3dist-esptool"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-ecdsa \
python310-pyaes \
python310-pyserial \
update-alternatives"

inherit rpm
