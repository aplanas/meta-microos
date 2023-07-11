SUMMARY = "A serial utility to communicate & flash code to Espressif ESP8266 & ESP32 chips"
DESCRIPTION = "A command line utility to communicate with the ROM bootloader in Espressif ESP8266 & ESP32 microcontrollers. \
 \
Allows flashing firmware, reading back firmware, querying chip parameters, etc."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.2"

RPM_NAME = "python310-esptool-4.6.2-1.1.noarch.rpm"
RPM_HASH = "cfa22ab82ec87cb248c90e2972af34ca916f5a2ed73ec5e8e3b4ce4e01eb9272d4192e92a3d9ea89a523de798229926de66ae5cd3a462cb73952993877bba02b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-esptool \
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
