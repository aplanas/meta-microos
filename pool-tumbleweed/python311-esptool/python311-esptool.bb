SUMMARY = "A serial utility to communicate & flash code to Espressif ESP8266 & ESP32 chips"
DESCRIPTION = "A command line utility to communicate with the ROM bootloader in Espressif ESP8266 & ESP32 microcontrollers. \
 \
Allows flashing firmware, reading back firmware, querying chip parameters, etc."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.1"

RPM_NAME = "python311-esptool-4.5.1-1.1.noarch.rpm"
RPM_HASH = "510a9b48d48769026c7a381594dcdd3f8023b6839be0a78ea84c004248c1684551e528a6b84c39a7f83337f673a45492b64c16f4431fed04d3a30427aaf56526"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-esptool \
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
