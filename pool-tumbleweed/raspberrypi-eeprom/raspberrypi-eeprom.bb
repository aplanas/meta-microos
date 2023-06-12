SUMMARY = "Raspberry Pi 4 EEPROM firmware"
DESCRIPTION = "First stage bootloader packages for Raspberry Pi 4"
LICENSE = "SUSE-Firmware"

PV = "2023.01.11"

RPM_NAME = "raspberrypi-eeprom-2023.01.11-2.1.noarch.rpm"
RPM_HASH = "36b3d09ddf4c387abe3f3667f4aabf820074920085d117b991931194f5f9f051e0c2b664391d994d1054dd225e25007384dd62e5f91545277c9d003f02ee5155"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(raspberrypi-eeprom) \
raspberrypi-eeprom \
rpi-eeprom \
rpi-eeprom-config"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
pciutils \
raspberrypi-eeprom-firmware \
raspberrypi-firmware \
raspberrypi-firmware-dt"

inherit rpm
