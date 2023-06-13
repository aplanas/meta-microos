SUMMARY = "Device trees for the Raspberry Pi firmware loader"
DESCRIPTION = "This package provides additional device tree base files as well as overlays \
for the Raspberry Pi boot process."
LICENSE = "GPL-2.0-only"

PV = "2023.05.02"

RPM_NAME = "raspberrypi-firmware-dt-2023.05.02-2.1.noarch.rpm"
RPM_HASH = "9b7412bd1fdc608a684a2c16bd24eb1005c25449282696b43e2df0455c844262e3be94c0017732eaa869d6eeb130d60a26e9890abf323485ef3a7c1508b59e2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "raspberrypi-firmware-dt"

RDEPENDS:${PN} += "/bin/sh \
raspberrypi-firmware"

inherit rpm
