SUMMARY = "Translations for package tcsh"
DESCRIPTION = "Provides translations for the 'tcsh' package."
LICENSE = "BSD-3-Clause"

PV = "6.24.10"

RPM_NAME = "tcsh-lang-6.24.10-1.1.noarch.rpm"
RPM_HASH = "7c1151ce51753d7c9d4dd3e5d62e2c10cba9a6325ebfe60f9033f1368c8c22a5f9a310d480370e89dde04cccd762b699b4576e5875b6ce756e668cc9e6cde1fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(tcsh:de) \
locale(tcsh:el) \
locale(tcsh:el_GR) \
locale(tcsh:es) \
locale(tcsh:et) \
locale(tcsh:fi) \
locale(tcsh:fr) \
locale(tcsh:it) \
locale(tcsh:ja) \
locale(tcsh:pl) \
locale(tcsh:ru_RU) \
locale(tcsh:ru_UA.koi8u) \
locale(tcsh:uk_UA) \
tcsh-lang \
tcsh-lang-all"

RDEPENDS:${PN} += "tcsh"

inherit rpm
