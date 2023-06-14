SUMMARY = "Translation of man pages in French"
DESCRIPTION = "This package provides translations of man pages in French."
LICENSE = "GPL-3.0-or-later"

PV = "4.19.0"

RPM_NAME = "man-pages-fr-4.19.0-1.1.noarch.rpm"
RPM_HASH = "6190539436e02630ffd01e3b7ec7b70509ba49bf0bef4c9a44717c79e37271d80f4acf8fe234d248ef625c93270fbfe582b09f09bad3404580c4c83b00693090"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-fr \
man-pages-fr"

RDEPENDS:${PN} += "man-pages"

inherit rpm
