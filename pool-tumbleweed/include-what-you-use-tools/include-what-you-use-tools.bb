SUMMARY = "Additional tools to use include-what-you-use effectively"
DESCRIPTION = "This package contains additional scripts for using include-what-you-use as automated \
refactoring tool."
LICENSE = "NCSA"

PV = "0.20"

RPM_NAME = "include-what-you-use-tools-0.20-1.2.noarch.rpm"
RPM_HASH = "ba73a3f685cd24f00c18f47deb60058fbe0f658a1c56f7bf4fe80b7093998b543df980da2e6e7b1b3322b04343772c6e1560d958594706d535f918a6a54e79f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "include-what-you-use-tools"

RDEPENDS:${PN} += "/usr/bin/python3 \
include-what-you-use"

inherit rpm
