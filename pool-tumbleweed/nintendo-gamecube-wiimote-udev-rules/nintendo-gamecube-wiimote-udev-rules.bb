SUMMARY = "Udev rules for Nintendo GameCube and Wiimote game controllers"
DESCRIPTION = "This package contains udev rules for Nintendo GameCube and Wiimote game controllers."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.17995"

RPM_NAME = "nintendo-gamecube-wiimote-udev-rules-5.0.17995-4.1.noarch.rpm"
RPM_HASH = "7a6eba761f83b31b1322d052d75e51b95f4792e8361e049bf25faa1921f73328ee8f8843db5c8047323c4aed791219a13ce664e199f9a55bc3b7f3952282d9e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nintendo-gamecube-wiimote-udev-rules"

RDEPENDS:${PN} += "udev"

inherit rpm
