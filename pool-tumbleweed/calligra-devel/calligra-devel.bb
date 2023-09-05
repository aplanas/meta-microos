SUMMARY = "The Build Enviroment from Calligra"
DESCRIPTION = "This package contains the build environment needed to compile Calligra \
applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-devel-3.2.1-7.22.aarch64.rpm"
RPM_HASH = "8e91f2b804996b1d199fed9b3253e116296bbb80817a89c8942336c185c3cd84a32b4fff6fa7ba87e4d62da73bdeb3e2c2bf04894fefee403d1057a67fbe01bd"

RPROVIDES:${PN} += "calligra-devel"

RDEPENDS:${PN} += "calligra"

inherit rpm
