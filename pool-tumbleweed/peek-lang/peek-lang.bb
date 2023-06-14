SUMMARY = "Translations for package peek"
DESCRIPTION = "Provides translations for the 'peek' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.5.1"

RPM_NAME = "peek-lang-1.5.1-2.18.noarch.rpm"
RPM_HASH = "6c3395d90f4860dca1a6474c301260d5e558a435751f3eb356e63ea8fde8491b5c87ba9ca81664ded09dea1fb178ffa118ed25453aed4ccba709028ebc7fcb66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-peek-ar \
locale-peek-ca \
locale-peek-cs \
locale-peek-de \
locale-peek-el \
locale-peek-eo \
locale-peek-es \
locale-peek-eu \
locale-peek-fi \
locale-peek-fr \
locale-peek-he \
locale-peek-hr \
locale-peek-id \
locale-peek-it \
locale-peek-ja \
locale-peek-kn \
locale-peek-ko \
locale-peek-lt \
locale-peek-nb \
locale-peek-nl \
locale-peek-pl \
locale-peek-pt-BR \
locale-peek-pt-PT \
locale-peek-ru \
locale-peek-sr \
locale-peek-sv \
locale-peek-tr \
locale-peek-uk-UA \
locale-peek-zh-CN \
locale-peek-zh-TW \
peek-lang \
peek-lang-all"

RDEPENDS:${PN} += "peek"

inherit rpm
