SUMMARY = "Translations for package Setzer"
DESCRIPTION = "Provides translations for the 'Setzer' package."
LICENSE = "GPL-3.0-or-later"

PV = "57"

RPM_NAME = "Setzer-lang-57-1.2.noarch.rpm"
RPM_HASH = "0ed86039d80da885fcb368b829dcd01039b748408aaa3de1e331b9f854b652c2673983270f95426b19366ac31cb64bc0ce1caebc2ce6700e9b86cdda8b0edaf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Setzer-lang \
Setzer-lang-all \
locale-Setzer-de \
locale-Setzer-es \
locale-Setzer-it \
locale-Setzer-pt-BR \
locale-Setzer-zh-CN"

RDEPENDS:${PN} += "Setzer"

inherit rpm
