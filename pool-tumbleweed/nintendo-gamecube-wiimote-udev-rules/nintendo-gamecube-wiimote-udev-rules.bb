SUMMARY = "Udev rules for Nintendo GameCube and Wiimote game controllers"
DESCRIPTION = "This package contains udev rules for Nintendo GameCube and Wiimote game controllers."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.17995"

RPM_NAME = "nintendo-gamecube-wiimote-udev-rules-5.0.17995-3.1.noarch.rpm"
RPM_HASH = "542b4aca395409bca57bf4392fa1233e5fa6e89d36b4d599b7549d667dfc0406b5261df1c721c81493d3d8a78365f6c8964580051e7fc3c415a814c8ac331222"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nintendo-gamecube-wiimote-udev-rules"

RDEPENDS:${PN} += "udev"

inherit rpm
