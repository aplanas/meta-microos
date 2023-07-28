SUMMARY = "Translations for package qpdfview"
DESCRIPTION = "Provides translations for the 'qpdfview' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "qpdfview-lang-0.5.0-2.1.noarch.rpm"
RPM_HASH = "24e2f7fa8b2c1d8e727580b8f178aa9a426f6e05114e289e2d6d42752e3f06a8f7aacc2d6f86163e70f30f493da0d2b0af0a309d1d395e7211c395f77d6c224f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qpdfview-lang \
qpdfview-lang-all"

RDEPENDS:${PN} += "qpdfview"

inherit rpm
