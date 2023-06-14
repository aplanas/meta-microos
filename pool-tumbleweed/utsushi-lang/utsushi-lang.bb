SUMMARY = "Translations for package utsushi"
DESCRIPTION = "Provides translations for the 'utsushi' package."
LICENSE = "GPL-3.0-or-later"

PV = "1638580181.839d06a"

RPM_NAME = "utsushi-lang-1638580181.839d06a-2.9.noarch.rpm"
RPM_HASH = "d044d0f4c107ab352804d14a14bb1398f1dcfd2cc9ed7aa5b2ce37f9e29e405b0d324efe0f4697890ea67850d68bc27953ebbc0148cc8552d5e12fa34c1824a3"
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
