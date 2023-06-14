SUMMARY = "Translations for package systemd"
DESCRIPTION = "Provides translations for the 'systemd' package."
LICENSE = "LGPL-2.1-or-later"

PV = "253.4"

RPM_NAME = "systemd-lang-253.4-2.1.noarch.rpm"
RPM_HASH = "a7793906fbe28b8c6116ccab40d89972fc592249a658409713f8df5f1ffc868c507e083c1396c6a4a252faf44908efec3574ed7d2304730e57e71ad52685ff7d"
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
