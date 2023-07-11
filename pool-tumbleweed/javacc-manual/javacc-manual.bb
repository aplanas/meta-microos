SUMMARY = "Manual for javacc"
DESCRIPTION = "Manual for javacc."
LICENSE = "BSD-3-Clause"

PV = "7.0.11"

RPM_NAME = "javacc-manual-7.0.11-1.6.noarch.rpm"
RPM_HASH = "507a989fd3a9da8c9a10fbfa1580bbc1666c9da4ce7ba53ff067d0b721e3189bc530dcba52f83dcdf08ffdc88fb005536cbcd63fd9aa3026204a214c336756c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javacc-manual"

RDEPENDS:${PN} += ""

inherit rpm
