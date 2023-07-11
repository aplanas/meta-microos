SUMMARY = "Chinese Lunar calendar library Documents"
DESCRIPTION = "Documents for Chinese Lunar calendar library"
LICENSE = "GPL-2.0-or-later"

PV = "2.9.3"

RPM_NAME = "lunar-date-doc-2.9.3-2.15.noarch.rpm"
RPM_HASH = "1a6f5c0cbde982e5893c1b7146ce575c6d1d8fbb82c4ec12ad528f2abcbe15fc3540baa76533e37fa9f750875646038f54c507a33a98d952d57e189898e14751"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lunar-date-doc"

RDEPENDS:${PN} += ""

inherit rpm
