SUMMARY = "Translations for package procps"
DESCRIPTION = "Provides translations for the 'procps' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.3.17"

RPM_NAME = "procps-lang-3.3.17-14.1.noarch.rpm"
RPM_HASH = "6d2e4d665ae07adb302c58e307d5f6c228db87038c226530a1ff38e8d32964cbc828940ea570869f75e44866db9a2983c161fc23982013deac3994966bde32ee"
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
