SUMMARY = "Translations for package utsushi"
DESCRIPTION = "Provides translations for the 'utsushi' package."
LICENSE = "GPL-3.0-or-later"

PV = "1684035837.b296671"

RPM_NAME = "utsushi-lang-1684035837.b296671-4.1.noarch.rpm"
RPM_HASH = "b4c323c4f631b30478a4f7d61c4ebd4288ced3cb242c478c2a92698b5b3aa09a4130693dfe01b6bd664cc89f98f49b997fa11eb583a9ed316b97a1cc4a694050"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-utsushi-de \
locale-utsushi-en \
locale-utsushi-es \
locale-utsushi-es-MX \
locale-utsushi-fr \
locale-utsushi-it \
locale-utsushi-ja \
locale-utsushi-ko \
locale-utsushi-nl \
locale-utsushi-pt \
locale-utsushi-pt-BR \
locale-utsushi-ru \
locale-utsushi-uk \
locale-utsushi-zh-CN \
locale-utsushi-zh-TW \
utsushi-lang \
utsushi-lang-all"

RDEPENDS:${PN} += "utsushi"

inherit rpm
