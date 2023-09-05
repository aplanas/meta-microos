SUMMARY = "Helper bridge between NodeJS projects and their dependencies"
DESCRIPTION = "Zero-runtime-dependency package acting as bridge between Node projects \
and their package managers."
LICENSE = "MIT"

PV = "20.5.1"

RPM_NAME = "corepack20-20.5.1-2.1.aarch64.rpm"
RPM_HASH = "52990ec66aff940eb74e877380b45fc8780be0ef727f494029129317966836c0d98ecbd6dfb0d73a8d519c08cbe705595cbf3fbc917f8bdfaebbf989da04abdf"

RPROVIDES:${PN} += "corepack20"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
nodejs-common"

inherit rpm
