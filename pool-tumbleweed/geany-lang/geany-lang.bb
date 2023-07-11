SUMMARY = "Translations for package geany"
DESCRIPTION = "Provides translations for the 'geany' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.38"

RPM_NAME = "geany-lang-1.38-3.8.noarch.rpm"
RPM_HASH = "c152176a157f2412ecf95f727b4a4d5481812c5428b6a70f86f541d135ee45a8f2b3ac3c974e6583be5f6d58679e98a39c1e008ed9f476bb7ba35a6cf4f185de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geany-lang \
geany-lang-all \
locale-geany-ar \
locale-geany-ast \
locale-geany-be \
locale-geany-bg \
locale-geany-ca \
locale-geany-cs \
locale-geany-da \
locale-geany-de \
locale-geany-el \
locale-geany-en-GB \
locale-geany-es \
locale-geany-et \
locale-geany-eu \
locale-geany-fa \
locale-geany-fi \
locale-geany-fr \
locale-geany-gl \
locale-geany-he \
locale-geany-hi \
locale-geany-hu \
locale-geany-id \
locale-geany-it \
locale-geany-ja \
locale-geany-kk \
locale-geany-ko \
locale-geany-lt \
locale-geany-lv \
locale-geany-nl \
locale-geany-nn \
locale-geany-pl \
locale-geany-pt \
locale-geany-pt-BR \
locale-geany-ro \
locale-geany-ru \
locale-geany-sk \
locale-geany-sl \
locale-geany-sr \
locale-geany-sv \
locale-geany-tr \
locale-geany-uk \
locale-geany-vi \
locale-geany-zh-CN \
locale-geany-zh-TW"

RDEPENDS:${PN} += "geany"

inherit rpm
