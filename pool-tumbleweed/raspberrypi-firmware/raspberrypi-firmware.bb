SUMMARY = "Binary bootloader and firmware files for Raspberry Pi"
DESCRIPTION = "Binary bootloader and firmware files for Raspberry Pi"
LICENSE = "SUSE-Firmware"

PV = "2023.04.25"

RPM_NAME = "raspberrypi-firmware-2023.04.25-2.1.noarch.rpm"
RPM_HASH = "bba2ac501c641a23b9bbf03d706b5aad4576aa30cf2b0cfa4567107a4151eb6673f574ae4409844777f1eada1253fe1b978dc8b39ba0a59eb13d0c9fde3cb674"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "raspberrypi-firmware"

RDEPENDS:${PN} += "/usr/bin/sh \
util-linux"

inherit rpm
