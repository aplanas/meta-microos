SUMMARY = "The Build Enviroment from Calligra"
DESCRIPTION = "This package contains the build environment needed to compile Calligra \
applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-devel-3.2.1-7.16.aarch64.rpm"
RPM_HASH = "b3855878875c5b232d72c4970a1b6c0fc85c783734d2f2ec1ee13ee47267b0f828aae60b05a58302e7a2b64a798f17da24d87cb95e1a883122b62d497105221d"

RPROVIDES:${PN} += "calligra-devel calligra-devel(aarch-64)"
RDEPENDS:${PN} += "calligra"

inherit rpm
