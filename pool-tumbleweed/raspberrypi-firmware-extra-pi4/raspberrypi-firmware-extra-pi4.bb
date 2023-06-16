SUMMARY = "Extra bootloaders for Raspberry Pi"
DESCRIPTION = "This package provides the console, experimental and debug \
firmware files for Raspberry Pi 4"
LICENSE = "SUSE-Firmware"

PV = "2023.04.25"

RPM_NAME = "raspberrypi-firmware-extra-pi4-2023.04.25-2.1.noarch.rpm"
RPM_HASH = "47b28b3c84ab5d52f122ccd9ceaf94e8c5e2181d97bc5257a5bd7528814eeb2ba2e0af1e8710ef55bd9dd39428fde59811358d97d8af6961886a01ac721f56b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "raspberrypi-firmware-extra-pi4"

RDEPENDS:${PN} += "/usr/bin/sh \
raspberrypi-firmware \
util-linux"

inherit rpm
