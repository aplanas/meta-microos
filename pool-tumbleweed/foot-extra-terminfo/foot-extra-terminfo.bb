SUMMARY = "Extra terminfo files for the foot terminal emulator"
DESCRIPTION = "This package contains extra terminfo files for the foot terminal emulator \
that provide more features than the files in the terminfo-base package. \
Set term=foot-extra or term=foot-extra-direct in foot.ini to \
take advantage of the files in this package."
LICENSE = "MIT"

PV = "1.15.0"

RPM_NAME = "foot-extra-terminfo-1.15.0-1.1.noarch.rpm"
RPM_HASH = "96112da51a9112f89e582c757c32286e5613c8cd30cbdafae1e3b4c7255eec0be90e2d465c58dc18319489451bc0be89c32d7a012a8ca0f88e1bc635035653e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "foot-extra-terminfo"

RDEPENDS:${PN} += ""

inherit rpm
