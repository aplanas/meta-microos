SUMMARY = "Translations for package poxml"
DESCRIPTION = "Provides translations for the 'poxml' package."
LICENSE = "GPL-2.0-only & GFDL-1.2-only"

PV = "23.08.0"

RPM_NAME = "poxml-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "f45afa062c4d10645261ae0587873836d8a61fe2dcef99842ccdb2af39cd24b0da3828a51a07616f2f00221058d8172c8808a489baaafe04108482dde67fcd57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "poxml-lang \
poxml-lang-all"

RDEPENDS:${PN} += "poxml"

inherit rpm
