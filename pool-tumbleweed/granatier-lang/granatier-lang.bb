SUMMARY = "Translations for package granatier"
DESCRIPTION = "Provides translations for the 'granatier' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "granatier-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "8a6c0919b19a3b92003849d1d89917158c75bcb3642260b6f469a0c3309c7b2e030c89fb9530a26274e302a2654663530a9e1519ebe8aa838da253d63fe89e94"
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
