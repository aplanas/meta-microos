SUMMARY = "Translations for package musique"
DESCRIPTION = "Provides translations for the 'musique' package."
LICENSE = "GPL-3.0-only & LGPL-2.1-only"

PV = "1.10.1"

RPM_NAME = "musique-lang-1.10.1-1.18.noarch.rpm"
RPM_HASH = "c43a7e8051cb0c9e4800e9eaae02f5164e59c76a3f04a60208ab1da134852ced7855da97c277610b9de8d0a79cc1971d038998988058dbae5406e38409f3877e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "musique-lang \
musique-lang-all"

RDEPENDS:${PN} += "musique"

inherit rpm
