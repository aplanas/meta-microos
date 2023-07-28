SUMMARY = "Simple font tester"
DESCRIPTION = "Simple font tester \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.1"

RPM_NAME = "ftlint-2.13.1-1.1.aarch64.rpm"
RPM_HASH = "7934ddaea18438262e31987eb95413a9c44663e63834a40a2ec0f6ee9f678fda763a1050a5e0de3dbb04640ef8662ae99520b192d3e5d4be938c27cb0c68ef73"

RPROVIDES:${PN} += "ftlint"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6"

inherit rpm
