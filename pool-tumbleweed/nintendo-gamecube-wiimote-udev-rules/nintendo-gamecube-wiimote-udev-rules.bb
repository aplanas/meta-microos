SUMMARY = "Udev rules for Nintendo GameCube and Wiimote game controllers"
DESCRIPTION = "This package contains udev rules for Nintendo GameCube and Wiimote game controllers."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.17995"

RPM_NAME = "nintendo-gamecube-wiimote-udev-rules-5.0.17995-3.3.noarch.rpm"
RPM_HASH = "8a4f2c3d206f2ae57302b2a0d5889a431531d94effcfaaaa4abf4ea2f5c98525e83482dd8a759676c1246c5940bf767396b6fb3bd04149293f83efc357ea3dd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nintendo-gamecube-wiimote-udev-rules"

RDEPENDS:${PN} += "udev"

inherit rpm
