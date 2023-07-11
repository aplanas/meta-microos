SUMMARY = "Translations for package diffutils"
DESCRIPTION = "Provides translations for the 'diffutils' package."
LICENSE = "GFDL-1.2-only & GPL-3.0-or-later"

PV = "3.10"

RPM_NAME = "diffutils-lang-3.10-1.2.noarch.rpm"
RPM_HASH = "26f4e12882b239a76b7125b3bfbbf6b9ce8fcb5f9c568278f0f983b3542d236d96d2a63ec12fa73eeebb50f5d8e4e597f5f75274a4aaccfac7981e7ff9777533"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "diffutils-lang \
diffutils-lang-all \
locale-diffutils-bg \
locale-diffutils-ca \
locale-diffutils-cs \
locale-diffutils-da \
locale-diffutils-de \
locale-diffutils-el \
locale-diffutils-eo \
locale-diffutils-es \
locale-diffutils-fi \
locale-diffutils-fr \
locale-diffutils-ga \
locale-diffutils-gl \
locale-diffutils-he \
locale-diffutils-hr \
locale-diffutils-hu \
locale-diffutils-id \
locale-diffutils-it \
locale-diffutils-ja \
locale-diffutils-ka \
locale-diffutils-ko \
locale-diffutils-lv \
locale-diffutils-ms \
locale-diffutils-nb \
locale-diffutils-nl \
locale-diffutils-pl \
locale-diffutils-pt \
locale-diffutils-pt-BR \
locale-diffutils-ro \
locale-diffutils-ru \
locale-diffutils-sr \
locale-diffutils-sv \
locale-diffutils-tr \
locale-diffutils-uk \
locale-diffutils-vi \
locale-diffutils-zh-CN \
locale-diffutils-zh-TW"

RDEPENDS:${PN} += "diffutils"

inherit rpm
