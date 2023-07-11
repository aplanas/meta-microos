SUMMARY = "Translations for package kasts"
DESCRIPTION = "Provides translations for the 'kasts' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kasts-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "d46963beaaefed6e5deb38a0dd8dfec7523580015bb1b1d319777238e06ee4377c8ab3a27e07c3d8c0be28b488e3597be3f738046b0a0f5b56f3d066566d7685"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kasts-lang \
kasts-lang-all \
locale-kasts-ca \
locale-kasts-ca@valencia \
locale-kasts-cs \
locale-kasts-de \
locale-kasts-en-GB \
locale-kasts-es \
locale-kasts-fi \
locale-kasts-fr \
locale-kasts-it \
locale-kasts-ja \
locale-kasts-ka \
locale-kasts-ko \
locale-kasts-lt \
locale-kasts-nl \
locale-kasts-pa \
locale-kasts-pl \
locale-kasts-pt \
locale-kasts-pt-BR \
locale-kasts-ru \
locale-kasts-sk \
locale-kasts-sl \
locale-kasts-sv \
locale-kasts-tr \
locale-kasts-uk \
locale-kasts-zh-CN \
locale-kasts-zh-TW"

RDEPENDS:${PN} += "kasts"

inherit rpm
