SUMMARY = "Translations for package lxqt-policykit"
DESCRIPTION = "Provides translations for the 'lxqt-policykit' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.0"

RPM_NAME = "lxqt-policykit-lang-1.2.0-1.3.noarch.rpm"
RPM_HASH = "1686f1b0626d45a990fe1644c858676af24ae523002f39234d5a3a97e1560cc570cc3f9f47ad57a6e2af1986a0b9bff24b6d68a3ee62fc6e289e2f4d20969f6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-policykit-lang \
lxqt-policykit-lang-all"

RDEPENDS:${PN} += "lxqt-policykit"

inherit rpm
