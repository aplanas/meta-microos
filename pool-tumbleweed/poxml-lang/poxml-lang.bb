SUMMARY = "Translations for package poxml"
DESCRIPTION = "Provides translations for the 'poxml' package."
LICENSE = "GPL-2.0-only & GFDL-1.2-only"

PV = "23.04.3"

RPM_NAME = "poxml-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "1efcd795bfa5c9800a1ca5f68bdee2e4e960a4c1aa7416a5c5ffcd34515a8094ee014f1fe7d84f8a343a18891b9b74d6ce076387e7db33b365421c8dd67421f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "poxml-lang \
poxml-lang-all"

RDEPENDS:${PN} += "poxml"

inherit rpm
