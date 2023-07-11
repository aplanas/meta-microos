SUMMARY = "Translations for package wxMaxima"
DESCRIPTION = "Provides translations for the 'wxMaxima' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.05.1"

RPM_NAME = "wxMaxima-lang-23.05.1-1.1.noarch.rpm"
RPM_HASH = "c0dc1dbdffa1c7a9d73e869b437c83fba2346e406ffac2626aa00a45d2ac83f2dd20ce0a50f13e0db3dca9d80247877c6a578e99feb51d403dddca44ba008590"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-wxMaxima-ca \
locale-wxMaxima-cs \
locale-wxMaxima-da \
locale-wxMaxima-de \
locale-wxMaxima-el \
locale-wxMaxima-en \
locale-wxMaxima-es \
locale-wxMaxima-fi \
locale-wxMaxima-fr \
locale-wxMaxima-gl \
locale-wxMaxima-hu \
locale-wxMaxima-it \
locale-wxMaxima-ja \
locale-wxMaxima-nb \
locale-wxMaxima-pl \
locale-wxMaxima-pt-BR \
locale-wxMaxima-ru \
locale-wxMaxima-tr \
locale-wxMaxima-uk \
locale-wxMaxima-zh-CN \
locale-wxMaxima-zh-TW \
wxMaxima-lang \
wxMaxima-lang-all"

RDEPENDS:${PN} += "wxMaxima"

inherit rpm
