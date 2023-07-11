SUMMARY = "Helper bridge between NodeJS projects and their dependencies"
DESCRIPTION = "Zero-runtime-dependency package acting as bridge between Node projects \
and their package managers."
LICENSE = "MIT"

PV = "20.3.1"

RPM_NAME = "corepack20-20.3.1-1.1.aarch64.rpm"
RPM_HASH = "4a0333ff02fd2162a2fdc42c15e58c4f685069b5ccfc519d89fa10ddb7d922676bb08d1a207c3e736fc6543a7e919ea4abb6fa8b4f3b4382b319bad7bb3c5d21"

RPROVIDES:${PN} += "corepack20"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
nodejs-common"

inherit rpm
