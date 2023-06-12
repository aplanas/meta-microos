SUMMARY = "Helper bridge between NodeJS projects and their dependencies"
DESCRIPTION = "Zero-runtime-dependency package acting as bridge between Node projects \
and their package managers."
LICENSE = "MIT"

PV = "20.2.0"

RPM_NAME = "corepack20-20.2.0-2.1.aarch64.rpm"
RPM_HASH = "dabb076477bc153de50114d7c545123cdffe19bf19861823c67d72d9b57f61c425ba8bfe2f505d9ba788169b8749aa166abcc67560d63fb65a0f411cc4c6e829"

RPROVIDES:${PN} += "corepack20 \
corepack20(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
nodejs-common"

inherit rpm
