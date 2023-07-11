SUMMARY = "A serial utility to communicate & flash code to Espressif ESP8266 & ESP32 chips"
DESCRIPTION = "A command line utility to communicate with the ROM bootloader in Espressif ESP8266 & ESP32 microcontrollers. \
 \
Allows flashing firmware, reading back firmware, querying chip parameters, etc."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.2"

RPM_NAME = "python311-esptool-4.6.2-1.1.noarch.rpm"
RPM_HASH = "f12d53a5ce56b60f028e548cfb655eb0797ba3cf59fd58783c866ff800711814bd2ba71ed467243f09ae6d20ff186a626b76331b30f5bb9e8d8ff5506421a70f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-esptool \
python3.11dist-esptool \
python311-esptool \
python3dist-esptool"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-ecdsa \
python311-pyaes \
python311-pyserial \
update-alternatives"

inherit rpm
