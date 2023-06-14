SUMMARY = "Translations for package procps"
DESCRIPTION = "Provides translations for the 'procps' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.3.17"

RPM_NAME = "procps-lang-3.3.17-12.3.noarch.rpm"
RPM_HASH = "81304bf2a70ffb07b29d5c1f33dc41ca60aed35f0f4534f995ecbbbde4bf8e0c25695d23384517f7ee65c0fafc0216af52534ac38f977eacf6c8588fcbbf8bb6"
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
