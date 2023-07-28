SUMMARY = "Translations for package systemd"
DESCRIPTION = "Provides translations for the 'systemd' package."
LICENSE = "LGPL-2.1-or-later"

PV = "253.7"

RPM_NAME = "systemd-lang-253.7-1.2.noarch.rpm"
RPM_HASH = "0d6f84ffe6e6ef4eb19f252fbd123f0359cc9db8e0a8c823445faeb84a6d82447a9b5321d8cfe5e4eb58bd40f7f275a195c59f9325cc9d4e1221a91dad535e67"
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
