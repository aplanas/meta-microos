SUMMARY = "Translations for package systemd"
DESCRIPTION = "Provides translations for the 'systemd' package."
LICENSE = "LGPL-2.1-or-later"

PV = "253.7"

RPM_NAME = "systemd-lang-253.7-2.1.noarch.rpm"
RPM_HASH = "9c80080db4e4542073b23c879631d6b394b5afe194c984117af018e4479b9bc1b42dc518021a6bbad18a90d3cfd9a7dd890fe270bdefb80182d37cef730378f8"
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
