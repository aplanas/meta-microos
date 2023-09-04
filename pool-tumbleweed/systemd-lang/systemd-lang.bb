SUMMARY = "Translations for package systemd"
DESCRIPTION = "Provides translations for the 'systemd' package."
LICENSE = "LGPL-2.1-or-later"

PV = "253.8"

RPM_NAME = "systemd-lang-253.8-1.2.noarch.rpm"
RPM_HASH = "d30f9a7a62e7af0eee0b3320c1355e1c87dfd5c5843be6316c1de58a8fd6578f0e94fc808844d965e5f176a415d3856bbad1724c72e4ea80b689e1faa56022d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-systemd-be \
locale-systemd-be@latin \
locale-systemd-bg \
locale-systemd-ca \
locale-systemd-cs \
locale-systemd-da \
locale-systemd-de \
locale-systemd-el \
locale-systemd-es \
locale-systemd-et \
locale-systemd-fi \
locale-systemd-fr \
locale-systemd-gl \
locale-systemd-hr \
locale-systemd-hu \
locale-systemd-id \
locale-systemd-it \
locale-systemd-ja \
locale-systemd-ka \
locale-systemd-ko \
locale-systemd-lt \
locale-systemd-nl \
locale-systemd-pa \
locale-systemd-pl \
locale-systemd-pt \
locale-systemd-pt-BR \
locale-systemd-ro \
locale-systemd-ru \
locale-systemd-si \
locale-systemd-sk \
locale-systemd-sr \
locale-systemd-sv \
locale-systemd-tr \
locale-systemd-uk \
locale-systemd-zh-CN \
locale-systemd-zh-TW \
systemd-lang \
systemd-lang-all"

RDEPENDS:${PN} += "systemd"

inherit rpm
