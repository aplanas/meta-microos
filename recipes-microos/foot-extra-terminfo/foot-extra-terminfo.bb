SUMMARY = "Extra terminfo files for the foot terminal emulator"
DESCRIPTION = "This package contains extra terminfo files for the foot terminal emulator \
that provide more features than the files in the terminfo-base package. \
Set term=foot-extra or term=foot-extra-direct in foot.ini to \
take advantage of the files in this package."
LICENSE = "MIT"

PV = "1.14.0"

RPM_NAME = "foot-extra-terminfo-1.14.0-2.1.noarch.rpm"
RPM_HASH = "f7fe509cf26d2b868a23d1250221bff8976106b4107778f6108842f3d4233c0fb6123b6e0c5373831cb98a6604c292d2d1d2d3412d83c310eca6a3de3208ad08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "foot-extra-terminfo"
RDEPENDS:${PN} += ""

inherit rpm
