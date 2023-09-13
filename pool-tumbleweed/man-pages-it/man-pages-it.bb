SUMMARY = "Translation of man pages in Italian"
DESCRIPTION = "This package provides translations of man pages in Italian."
LICENSE = "GPL-3.0-or-later"

PV = "4.20.0"

RPM_NAME = "man-pages-it-4.20.0-1.1.noarch.rpm"
RPM_HASH = "272867a44ccb08acc6b02a54178b0d54047f51d8e1ea00d0955e8c4994154d706df52b0813d0e2e530c0b3fedf23604c66d57586ee99e8e2e75be5f541b04bcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-it \
man-pages-it"

RDEPENDS:${PN} += "man-pages"

inherit rpm
