SUMMARY = "Translations for package latte-dock"
DESCRIPTION = "Provides translations for the 'latte-dock' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.11.0~20220619T183501"

RPM_NAME = "latte-dock-lang-0.11.0~20220619T183501-1.4.noarch.rpm"
RPM_HASH = "d3092b08267a9180ea8a3c3b1d489782fbf34de519b0ff227a353a7768c6e82d9c8ceed0f4c25d83905158135601afdd54cdb80b16458fd174a9456305de4d33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "latte-dock-lang \
latte-dock-lang-all \
locale-latte-dock-ar \
locale-latte-dock-ast \
locale-latte-dock-az \
locale-latte-dock-ca \
locale-latte-dock-ca@valencia \
locale-latte-dock-cs \
locale-latte-dock-da \
locale-latte-dock-de \
locale-latte-dock-el \
locale-latte-dock-en-GB \
locale-latte-dock-es \
locale-latte-dock-et \
locale-latte-dock-eu \
locale-latte-dock-fi \
locale-latte-dock-fr \
locale-latte-dock-gl \
locale-latte-dock-ia \
locale-latte-dock-id \
locale-latte-dock-it \
locale-latte-dock-ja \
locale-latte-dock-ko \
locale-latte-dock-lt \
locale-latte-dock-nl \
locale-latte-dock-nn \
locale-latte-dock-pl \
locale-latte-dock-pt \
locale-latte-dock-pt-BR \
locale-latte-dock-ro \
locale-latte-dock-ru \
locale-latte-dock-sk \
locale-latte-dock-sl \
locale-latte-dock-sv \
locale-latte-dock-tr \
locale-latte-dock-uk \
locale-latte-dock-zh-CN \
locale-latte-dock-zh-TW"

RDEPENDS:${PN} += "latte-dock"

inherit rpm
