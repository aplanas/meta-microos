SUMMARY = "A modern style for qt applications"
DESCRIPTION = "Lightly is a fork of breeze theme style that aims to be visually modern and minimalistic."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.1"

RPM_NAME = "lightly-0.4.1-2.8.aarch64.rpm"
RPM_HASH = "d6c9124ed344adb9819991854d55401ff6ef10123bf18a6a0d3ec130be7256b6cd4486c79334fd4c3069cc9b992b089378d6ad220d18a10ce8bdff0782ea5605"

RPROVIDES:${PN} += "lightly"

RDEPENDS:${PN} += "breeze5-cursors \
breeze5-icons \
lightly-decoration \
lightly-style"

inherit rpm
