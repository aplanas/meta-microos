SUMMARY = "Translations for package systemd"
DESCRIPTION = "Provides translations for the 'systemd' package."
LICENSE = "LGPL-2.1-or-later"

PV = "253.5"

RPM_NAME = "systemd-lang-253.5-5.1.noarch.rpm"
RPM_HASH = "91b923fd9de785f5f509c1d0d70e69536ade729e59f9dabbb4cb8c878c3f5cf6efa2369bfcc20936d8d56c9d135227d40371a322de998e2bc26e9edf255214c7"
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
