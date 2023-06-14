SUMMARY = "A modern style for qt applications"
DESCRIPTION = "Lightly is a fork of breeze theme style that aims to be visually modern and minimalistic."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.1"

RPM_NAME = "lightly-0.4.1-2.7.aarch64.rpm"
RPM_HASH = "956d96862fdcc49b464eacb9d022501195d4410b3e2b9153cd8ad3d891b6b0eee2c8a02d1efc3947262ddeb7d45e1cb431abece5ce0ad208585b8bdafd112563"

RPROVIDES:${PN} += "lightly"

RDEPENDS:${PN} += "breeze5-cursors \
breeze5-icons \
lightly-decoration \
lightly-style"

inherit rpm
