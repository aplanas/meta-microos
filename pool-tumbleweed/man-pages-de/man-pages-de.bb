SUMMARY = "Translation of man pages in German"
DESCRIPTION = "This package provides translations of man pages in German."
LICENSE = "GPL-3.0-or-later"

PV = "4.19.0"

RPM_NAME = "man-pages-de-4.19.0-1.1.noarch.rpm"
RPM_HASH = "8d7cd9059ac8c914bc60deec17a34d43aa2c9b34ebf7756084d313cdd3e4140ad61cb8cfa71d2a7b12b9d80b49b45dc1f3444f8fd2ba2d5db805871814e5ba62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(man-pages:de) \
man-pages-de"

RDEPENDS:${PN} += "man-pages"

inherit rpm
