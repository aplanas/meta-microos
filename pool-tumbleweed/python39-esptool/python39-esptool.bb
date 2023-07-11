SUMMARY = "A serial utility to communicate & flash code to Espressif ESP8266 & ESP32 chips"
DESCRIPTION = "A command line utility to communicate with the ROM bootloader in Espressif ESP8266 & ESP32 microcontrollers. \
 \
Allows flashing firmware, reading back firmware, querying chip parameters, etc."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.2"

RPM_NAME = "python39-esptool-4.6.2-1.1.noarch.rpm"
RPM_HASH = "ac4c887c14430aa61d3a5bfa5c36ae30d5c0e2ad2e20dbc13873c5b82aaae3ec014442cb2aab28469397b4e6b7af352b2b36ff12c9471392fd40eef04179e4f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-esptool \
python39-esptool \
python3dist-esptool"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-ecdsa \
python39-pyaes \
python39-pyserial \
update-alternatives"

inherit rpm
