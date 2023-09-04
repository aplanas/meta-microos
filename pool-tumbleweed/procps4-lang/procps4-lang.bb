SUMMARY = "Translations for package procps4"
DESCRIPTION = "Provides translations for the 'procps4' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.0.3"

RPM_NAME = "procps4-lang-4.0.3-3.1.noarch.rpm"
RPM_HASH = "6a23a7f305dede131ab71634ebb73c6df9b4b2349a70057b84da807d46910652e70eb67df81b3ed4f13ac7eb5f2726113a082e2813373980f5deb35f0504a89d"
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
