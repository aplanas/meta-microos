SUMMARY = "Translations for package lollypop"
DESCRIPTION = "Provides translations for the 'lollypop' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.37"

RPM_NAME = "lollypop-lang-1.4.37-1.3.noarch.rpm"
RPM_HASH = "11d86327a7f81de1b05538f2332ac03d231ad480850de1cde7b10f755ae448607d7ccd36cdc39596be3afda0e0dcef347de0c6c2df78b3761f4324f2b7381a30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-lollypop-ar \
locale-lollypop-bg \
locale-lollypop-bn \
locale-lollypop-ca \
locale-lollypop-cs \
locale-lollypop-da \
locale-lollypop-de \
locale-lollypop-el \
locale-lollypop-en-GB \
locale-lollypop-eo \
locale-lollypop-es \
locale-lollypop-es-EC \
locale-lollypop-eu \
locale-lollypop-fa \
locale-lollypop-fi \
locale-lollypop-fr \
locale-lollypop-ga \
locale-lollypop-gl \
locale-lollypop-he \
locale-lollypop-hr \
locale-lollypop-hu \
locale-lollypop-id \
locale-lollypop-it \
locale-lollypop-ja \
locale-lollypop-ka \
locale-lollypop-ko \
locale-lollypop-lt \
locale-lollypop-nb-NO \
locale-lollypop-nl \
locale-lollypop-nl-BE \
locale-lollypop-pl \
locale-lollypop-pt \
locale-lollypop-pt-BR \
locale-lollypop-pt-PT \
locale-lollypop-ro \
locale-lollypop-ru \
locale-lollypop-sk \
locale-lollypop-sr \
locale-lollypop-sr@latin \
locale-lollypop-sv \
locale-lollypop-tr \
locale-lollypop-uk \
locale-lollypop-zh-CN \
locale-lollypop-zh-Hant \
lollypop-lang \
lollypop-lang-all"

RDEPENDS:${PN} += "lollypop"

inherit rpm
