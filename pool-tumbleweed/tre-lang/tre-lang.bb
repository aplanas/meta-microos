SUMMARY = "Translations for package tre"
DESCRIPTION = "Provides translations for the 'tre' package."
LICENSE = "BSD-3-Clause"

PV = "0.8.0_git201402282055"

RPM_NAME = "tre-lang-0.8.0_git201402282055-7.2.noarch.rpm"
RPM_HASH = "7f90cc34fdce61bac6fab5bc8cf06038fae3cb10006c78444a77df9b7b836ad5aa3e3550f1add962906e33e63f5e452c3ecac0f784d773250b3f4df9319411ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(tre:fi) \
locale(tre:sv) \
tre-lang \
tre-lang-all"
RDEPENDS:${PN} += "tre"

inherit rpm
