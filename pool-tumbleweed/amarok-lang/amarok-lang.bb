SUMMARY = "Translations for package amarok"
DESCRIPTION = "Provides translations for the 'amarok' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.75git.20230408T114133~7098c192a6"

RPM_NAME = "amarok-lang-2.9.75git.20230408T114133~7098c192a6-1.4.noarch.rpm"
RPM_HASH = "99e784798c654ce0d5e3ac3038da7a77ffb33ce0ce22682d585fb06b9a453161a1a9092d7d0e425dbff057dfb68c13fc108a62d42b15f8d69512523e51013844"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "amarok-lang \
amarok-lang-all \
locale-amarok-af \
locale-amarok-ar \
locale-amarok-be \
locale-amarok-bg \
locale-amarok-bs \
locale-amarok-ca \
locale-amarok-ca@valencia \
locale-amarok-cs \
locale-amarok-da \
locale-amarok-de \
locale-amarok-el \
locale-amarok-en-GB \
locale-amarok-eo \
locale-amarok-es \
locale-amarok-et \
locale-amarok-eu \
locale-amarok-fa \
locale-amarok-fi \
locale-amarok-fr \
locale-amarok-ga \
locale-amarok-gl \
locale-amarok-he \
locale-amarok-hr \
locale-amarok-hu \
locale-amarok-ia \
locale-amarok-id \
locale-amarok-is \
locale-amarok-it \
locale-amarok-ja \
locale-amarok-ka \
locale-amarok-km \
locale-amarok-ko \
locale-amarok-lt \
locale-amarok-lv \
locale-amarok-mai \
locale-amarok-ml \
locale-amarok-mr \
locale-amarok-ms \
locale-amarok-nb \
locale-amarok-nds \
locale-amarok-ne \
locale-amarok-nl \
locale-amarok-nn \
locale-amarok-oc \
locale-amarok-pa \
locale-amarok-pl \
locale-amarok-pt \
locale-amarok-pt-BR \
locale-amarok-ro \
locale-amarok-ru \
locale-amarok-si \
locale-amarok-sk \
locale-amarok-sl \
locale-amarok-sq \
locale-amarok-sr \
locale-amarok-sr@ijekavian \
locale-amarok-sr@ijekavianlatin \
locale-amarok-sr@latin \
locale-amarok-sv \
locale-amarok-th \
locale-amarok-tr \
locale-amarok-ug \
locale-amarok-uk \
locale-amarok-wa \
locale-amarok-zh-CN \
locale-amarok-zh-TW"

RDEPENDS:${PN} += "amarok"

inherit rpm
