SUMMARY = "Helper bridge between NodeJS projects and their dependencies"
DESCRIPTION = "Zero-runtime-dependency package acting as bridge between Node projects \
and their package managers."
LICENSE = "MIT"

PV = "18.16.0"

RPM_NAME = "corepack18-18.16.0-1.2.aarch64.rpm"
RPM_HASH = "643a36513279dcf830d9489ff97a97653acfa47894692e0c980ea696ae5dea88cf2a685fe6c3f3205159c6e8565d57f06f6fc5e580432f5156cdf9dd41887760"

RPROVIDES:${PN} += "corepack18 \
corepack18(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
nodejs-common"

inherit rpm
