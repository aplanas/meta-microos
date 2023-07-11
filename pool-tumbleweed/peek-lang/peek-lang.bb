SUMMARY = "Translations for package peek"
DESCRIPTION = "Provides translations for the 'peek' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.5.1"

RPM_NAME = "peek-lang-1.5.1-2.19.noarch.rpm"
RPM_HASH = "9b0ac7f34fef67a151945f2e17cc1a6a930ac708f2300cc5414d693f4091a8e607fc0239ae709ccf1ba86e0db0f0c91c10a9e0c4ada5e150acbb33d707d5c226"
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
