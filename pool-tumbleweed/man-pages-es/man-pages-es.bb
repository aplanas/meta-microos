SUMMARY = "Translation of man pages in Spanish"
DESCRIPTION = "This package provides translations of man pages in Spanish."
LICENSE = "GPL-3.0-or-later"

PV = "4.20.0"

RPM_NAME = "man-pages-es-4.20.0-1.1.noarch.rpm"
RPM_HASH = "266384a98f9a0f389dfaaa18f446a2c00faf98ba01289419113b02c55ae98d97335e932e13270865ba05705aa364f947923f86e074fab3f86ea0b95b7bce52e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-es \
man-pages-es"

RDEPENDS:${PN} += "man-pages"

inherit rpm
