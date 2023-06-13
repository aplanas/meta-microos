SUMMARY = "Raspberry Pi 4 eeprom firmware configuration tool"
DESCRIPTION = "rpi-eeprom-config allows generating/extracting eeprom firmware configurations."
LICENSE = "BSD-3-Clause"

PV = "0.0.20200625~9342fdb"

RPM_NAME = "rpi-eeprom-config-0.0.20200625~9342fdb-1.8.noarch.rpm"
RPM_HASH = "d875a00560097af3017a3f490c93898789361703dfce4f54a718f428ac20c624be82bff423ea0a67e9085b4767e8e2a3204a0c3d9da65ab9cd88063c9a904341"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpi-eeprom-config"

RDEPENDS:${PN} += "/usr/bin/python \
raspberrypi-firmware-eeprom"

inherit rpm
