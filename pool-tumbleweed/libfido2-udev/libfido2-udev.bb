SUMMARY = "Udev rules for libfido2"
DESCRIPTION = "This package contains the udev rules for FIDO2 compatible devices."
LICENSE = "BSD-2-Clause"

PV = "1.13.0"

RPM_NAME = "libfido2-udev-1.13.0-1.2.noarch.rpm"
RPM_HASH = "ba9bb1d2d9d1a5f01b5a50f4eb411413079752651353752d724d8a22577e348bf84566a3041666a1df14124cfa9ec0cdec6dc4381df80821e0c8d8fcf3a77392"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libfido2-udev"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
