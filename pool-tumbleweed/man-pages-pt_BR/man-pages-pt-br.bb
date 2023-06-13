SUMMARY = "Translation of man pages in Brazilian Portuguese"
DESCRIPTION = "This package provides translations of man pages in Brazilian Portuguese."
LICENSE = "GPL-3.0-or-later"

PV = "4.19.0"

RPM_NAME = "man-pages-pt_BR-4.19.0-1.1.noarch.rpm"
RPM_HASH = "6f73f108aa65e6250f00baa3d1e04c1381f545f491def86f8aa3e4ddb3fb6e26eccc5e24601be413e5ba65e41c66df8c98dc170798106df9c782889e4fa9f124"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(man-pages:pt_BR) \
man-pages-pt_BR"

RDEPENDS:${PN} += "man-pages"

inherit rpm
