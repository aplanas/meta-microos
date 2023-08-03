SUMMARY = "Device trees for the Raspberry Pi firmware loader"
DESCRIPTION = "This package provides additional device tree base files as well as overlays \
for the Raspberry Pi boot process."
LICENSE = "GPL-2.0-only"

PV = "2023.05.02"

RPM_NAME = "raspberrypi-firmware-dt-2023.05.02-3.1.noarch.rpm"
RPM_HASH = "bb5a3218825f74da60db5261d4d75920a9a2d8ae9422b890a29f5846aa8a19d7714aba08e188122ede012d9bff0c1938edc1a92f5154bf9df3b827396e388e19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "raspberrypi-firmware-dt"

RDEPENDS:${PN} += "/usr/bin/sh \
raspberrypi-firmware"

inherit rpm
