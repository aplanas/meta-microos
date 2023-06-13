SUMMARY = "Manual for junit"
DESCRIPTION = "Documentation for junit."
LICENSE = "EPL-1.0"

PV = "4.13.2"

RPM_NAME = "junit-manual-4.13.2-4.1.noarch.rpm"
RPM_HASH = "9c57d9b617aeab00a0a6641b85e0a78bfaf3b4786e4bea119c0d8b97c2d2cc9559aee516eab819170a28437d4be8be70a3f5ab3aa5b0dd26a69cfa4b690c5356"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "junit-manual \
junit4-manual"

RDEPENDS:${PN} += ""

inherit rpm
