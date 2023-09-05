SUMMARY = "Translations for package libktorrent"
DESCRIPTION = "Provides translations for the 'libktorrent' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "libktorrent-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "544a64948830f74ccb8d23da4541edc540bed0818c653eb710152fd9ed11ca3d3f9ec9b65f5e8d2584a628d8f7c9f440d6f88ab170f2e479eeb4c4d939edcb9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libktorrent-lang \
libktorrent-lang-all \
locale-libktorrent-ar \
locale-libktorrent-be \
locale-libktorrent-bg \
locale-libktorrent-bs \
locale-libktorrent-ca \
locale-libktorrent-ca@valencia \
locale-libktorrent-cs \
locale-libktorrent-da \
locale-libktorrent-de \
locale-libktorrent-el \
locale-libktorrent-en-GB \
locale-libktorrent-eo \
locale-libktorrent-es \
locale-libktorrent-et \
locale-libktorrent-eu \
locale-libktorrent-fi \
locale-libktorrent-fr \
locale-libktorrent-ga \
locale-libktorrent-gl \
locale-libktorrent-hi \
locale-libktorrent-hr \
locale-libktorrent-hu \
locale-libktorrent-ia \
locale-libktorrent-is \
locale-libktorrent-it \
locale-libktorrent-ja \
locale-libktorrent-ka \
locale-libktorrent-kk \
locale-libktorrent-km \
locale-libktorrent-ko \
locale-libktorrent-lt \
locale-libktorrent-lv \
locale-libktorrent-mr \
locale-libktorrent-ms \
locale-libktorrent-nb \
locale-libktorrent-nds \
locale-libktorrent-nl \
locale-libktorrent-nn \
locale-libktorrent-oc \
locale-libktorrent-pl \
locale-libktorrent-pt \
locale-libktorrent-pt-BR \
locale-libktorrent-ro \
locale-libktorrent-ru \
locale-libktorrent-si \
locale-libktorrent-sk \
locale-libktorrent-sl \
locale-libktorrent-sr \
locale-libktorrent-sr@ijekavian \
locale-libktorrent-sr@ijekavianlatin \
locale-libktorrent-sr@latin \
locale-libktorrent-sv \
locale-libktorrent-tr \
locale-libktorrent-ug \
locale-libktorrent-uk \
locale-libktorrent-zh-CN \
locale-libktorrent-zh-TW"

RDEPENDS:${PN} += "libktorrent"

inherit rpm
