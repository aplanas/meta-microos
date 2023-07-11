SUMMARY = "Translations for package procps"
DESCRIPTION = "Provides translations for the 'procps' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.3.17"

RPM_NAME = "procps-lang-3.3.17-12.4.noarch.rpm"
RPM_HASH = "3a65083b8c411ebcf4bf07c12f3958e40f2d1a1de35abed393546eadd5ad851f4e68ba40d0407442bbdc81f237aa9a1a0797206f90bdffeda2ce6b77f21b3289"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-procps-de \
locale-procps-fr \
locale-procps-pl \
locale-procps-pt-BR \
locale-procps-sv \
locale-procps-uk \
locale-procps-vi \
locale-procps-zh-CN \
procps-lang \
procps-lang-all"

RDEPENDS:${PN} += "procps"

inherit rpm
