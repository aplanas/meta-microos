SUMMARY = "Translations for package q4wine"
DESCRIPTION = "Provides translations for the 'q4wine' package."
LICENSE = "GPL-3.0-only"

PV = "1.3.13"

RPM_NAME = "q4wine-lang-1.3.13-1.18.noarch.rpm"
RPM_HASH = "d08121c589575546fa4d082a81a355fb9ecaa3e2076840d74c068b00e4260227638cf770745a31eb24e079f6bc102f2d07444c46ef7a41af7e923af6f5856ca7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "q4wine-lang \
q4wine-lang-all"

RDEPENDS:${PN} += "q4wine"

inherit rpm
