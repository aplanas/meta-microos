SUMMARY = "Translations for package kscreen5"
DESCRIPTION = "Provides translations for the 'kscreen5' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "kscreen5-lang-5.27.7-1.1.noarch.rpm"
RPM_HASH = "8080ec5baaf1ac19b981bee1dab9c733fc4d421bb50cd80c8e4abd418fe7d64fa600b7aba049a7490f63e8f0d0fde0a1fa7a1dd174be3653996978d0c7a4f159"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kscreen5-lang \
kscreen5-lang-all \
locale-kscreen5-ar \
locale-kscreen5-az \
locale-kscreen5-bg \
locale-kscreen5-bs \
locale-kscreen5-ca \
locale-kscreen5-ca@valencia \
locale-kscreen5-cs \
locale-kscreen5-da \
locale-kscreen5-de \
locale-kscreen5-el \
locale-kscreen5-en-GB \
locale-kscreen5-es \
locale-kscreen5-et \
locale-kscreen5-eu \
locale-kscreen5-fi \
locale-kscreen5-fr \
locale-kscreen5-gl \
locale-kscreen5-he \
locale-kscreen5-hu \
locale-kscreen5-ia \
locale-kscreen5-id \
locale-kscreen5-it \
locale-kscreen5-ja \
locale-kscreen5-ka \
locale-kscreen5-ko \
locale-kscreen5-lt \
locale-kscreen5-lv \
locale-kscreen5-ml \
locale-kscreen5-nb \
locale-kscreen5-nl \
locale-kscreen5-nn \
locale-kscreen5-pa \
locale-kscreen5-pl \
locale-kscreen5-pt \
locale-kscreen5-pt-BR \
locale-kscreen5-ro \
locale-kscreen5-ru \
locale-kscreen5-sk \
locale-kscreen5-sl \
locale-kscreen5-sr \
locale-kscreen5-sr@ijekavian \
locale-kscreen5-sr@ijekavianlatin \
locale-kscreen5-sr@latin \
locale-kscreen5-sv \
locale-kscreen5-ta \
locale-kscreen5-tr \
locale-kscreen5-uk \
locale-kscreen5-zh-CN \
locale-kscreen5-zh-TW"

RDEPENDS:${PN} += "kscreen5"

inherit rpm
