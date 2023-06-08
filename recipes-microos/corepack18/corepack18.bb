SUMMARY = "Helper bridge between NodeJS projects and their dependencies"
DESCRIPTION = "Zero-runtime-dependency package acting as bridge between Node projects \
and their package managers."
LICENSE = "MIT"

PV = "18.16.0"

RPM_NAME = "corepack18-18.16.0-1.1.aarch64.rpm"
RPM_HASH = "9be59e3c55fc20bd2d94acbdca70aa77baf9ef1f8739becbb51879e77f7959bebce044f366b2f5bc9d4d205b411dc57c512f5d1c7983f636f8efd873cc492bac"

RPROVIDES:${PN} += "corepack18 corepack18(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/env nodejs-common"

inherit rpm
