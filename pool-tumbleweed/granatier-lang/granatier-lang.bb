SUMMARY = "Translations for package granatier"
DESCRIPTION = "Provides translations for the 'granatier' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "granatier-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "fafdc00ae4c249beee21f34c588a06c88001b891063ddd9bfd24cb7f2f05606dde1a7315bb3e7f1e708255ce20f5e810287d3c3775d2958a66488780d57bdd34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "granatier-lang \
granatier-lang-all \
locale-granatier-ar \
locale-granatier-bg \
locale-granatier-bs \
locale-granatier-ca \
locale-granatier-ca@valencia \
locale-granatier-cs \
locale-granatier-da \
locale-granatier-de \
locale-granatier-el \
locale-granatier-en-GB \
locale-granatier-eo \
locale-granatier-es \
locale-granatier-et \
locale-granatier-eu \
locale-granatier-fi \
locale-granatier-fr \
locale-granatier-ga \
locale-granatier-gl \
locale-granatier-hr \
locale-granatier-hu \
locale-granatier-id \
locale-granatier-is \
locale-granatier-it \
locale-granatier-ja \
locale-granatier-ka \
locale-granatier-kk \
locale-granatier-km \
locale-granatier-ko \
locale-granatier-lt \
locale-granatier-lv \
locale-granatier-mai \
locale-granatier-ml \
locale-granatier-mr \
locale-granatier-ms \
locale-granatier-nb \
locale-granatier-nds \
locale-granatier-nl \
locale-granatier-nn \
locale-granatier-pl \
locale-granatier-pt \
locale-granatier-pt-BR \
locale-granatier-ro \
locale-granatier-ru \
locale-granatier-sk \
locale-granatier-sl \
locale-granatier-sr \
locale-granatier-sr@ijekavian \
locale-granatier-sr@ijekavianlatin \
locale-granatier-sr@latin \
locale-granatier-sv \
locale-granatier-th \
locale-granatier-tr \
locale-granatier-ug \
locale-granatier-uk \
locale-granatier-zh-CN \
locale-granatier-zh-TW"

RDEPENDS:${PN} += "granatier"

inherit rpm
