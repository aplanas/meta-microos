SUMMARY = "Translations for package peek"
DESCRIPTION = "Provides translations for the 'peek' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.5.1"

RPM_NAME = "peek-lang-1.5.1-2.20.noarch.rpm"
RPM_HASH = "c1532f0e55f2446ac7cc28bdcbe5e344f742158e58a61d930df15ee641cc08045d8df041d532d96c543343e541f270e50c96a927329523a6f49a7f106684b8db"
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
