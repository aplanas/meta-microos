SUMMARY = "Helper bridge between NodeJS projects and their dependencies"
DESCRIPTION = "Zero-runtime-dependency package acting as bridge between Node projects \
and their package managers."
LICENSE = "MIT"

PV = "20.5.1"

RPM_NAME = "corepack20-20.5.1-1.1.aarch64.rpm"
RPM_HASH = "e1b7ddc285ec21113e95196ff0853643ef9d7480d329c37ab83a27bb6664f33d21d6db3873b8134597aa3be19b5a5c34146f16467cb73c835e7a78c674040e29"

RPROVIDES:${PN} += "corepack20"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
nodejs-common"

inherit rpm
