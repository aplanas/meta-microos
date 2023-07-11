SUMMARY = "Translations for package procps4"
DESCRIPTION = "Provides translations for the 'procps4' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.0.3"

RPM_NAME = "procps4-lang-4.0.3-1.4.noarch.rpm"
RPM_HASH = "80878d8e102f29747077547f8b0df9e42575fb0cab008c0799e7004b47f2eff6154e241251c8062cd3c10ad4ff588605d4b543ed9755b19490da518eca4ab147"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-procps4-de \
locale-procps4-es \
locale-procps4-fr \
locale-procps4-ka \
locale-procps4-ko \
locale-procps4-pl \
locale-procps4-pt-BR \
locale-procps4-ro \
locale-procps4-sv \
locale-procps4-uk \
locale-procps4-vi \
locale-procps4-zh-CN \
procps-lang \
procps4-lang \
procps4-lang-all"

RDEPENDS:${PN} += "procps4"

inherit rpm
