SUMMARY = "Fonts for the MathGL library"
DESCRIPTION = "This package contains command fonts for MathGL library."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "mathgl-fonts-8.0.1-3.3.noarch.rpm"
RPM_HASH = "a69c62e356675f07a65fb0abc05fb9998b172da8461a3bfe5d5e6cbf95bca77237791ac57c20eaa3424d76d59a05d9c55a14cf10bcb0ed712c13acb1b16e2d96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathgl-fonts"
RDEPENDS:${PN} += ""

inherit rpm
