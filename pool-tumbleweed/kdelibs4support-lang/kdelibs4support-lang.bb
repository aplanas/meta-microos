SUMMARY = "Translations for package kdelibs4support"
DESCRIPTION = "Provides translations for the 'kdelibs4support' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kdelibs4support-lang-5.109.0-1.1.noarch.rpm"
RPM_HASH = "be7e1bd421f815e1726dd5a6ccced2311dc726de7f860884cf68414020a0fbe6ecd65874de02539066116d05c30150a4874a6eeca0e99f8be8cbd915a4124c33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdelibs4support-lang \
kdelibs4support-lang-all \
locale-kdelibs4support-af \
locale-kdelibs4support-ar \
locale-kdelibs4support-as \
locale-kdelibs4support-az \
locale-kdelibs4support-be \
locale-kdelibs4support-be@latin \
locale-kdelibs4support-bg \
locale-kdelibs4support-bn \
locale-kdelibs4support-bn-IN \
locale-kdelibs4support-br \
locale-kdelibs4support-bs \
locale-kdelibs4support-ca \
locale-kdelibs4support-ca@valencia \
locale-kdelibs4support-cs \
locale-kdelibs4support-cy \
locale-kdelibs4support-da \
locale-kdelibs4support-de \
locale-kdelibs4support-el \
locale-kdelibs4support-en-GB \
locale-kdelibs4support-eo \
locale-kdelibs4support-es \
locale-kdelibs4support-et \
locale-kdelibs4support-eu \
locale-kdelibs4support-fa \
locale-kdelibs4support-fi \
locale-kdelibs4support-fr \
locale-kdelibs4support-ga \
locale-kdelibs4support-gd \
locale-kdelibs4support-gl \
locale-kdelibs4support-gu \
locale-kdelibs4support-he \
locale-kdelibs4support-hi \
locale-kdelibs4support-hr \
locale-kdelibs4support-hu \
locale-kdelibs4support-ia \
locale-kdelibs4support-id \
locale-kdelibs4support-is \
locale-kdelibs4support-it \
locale-kdelibs4support-ja \
locale-kdelibs4support-ka \
locale-kdelibs4support-kk \
locale-kdelibs4support-km \
locale-kdelibs4support-kn \
locale-kdelibs4support-ko \
locale-kdelibs4support-lt \
locale-kdelibs4support-lv \
locale-kdelibs4support-mai \
locale-kdelibs4support-mk \
locale-kdelibs4support-ml \
locale-kdelibs4support-mr \
locale-kdelibs4support-ms \
locale-kdelibs4support-nb \
locale-kdelibs4support-nds \
locale-kdelibs4support-ne \
locale-kdelibs4support-nl \
locale-kdelibs4support-nn \
locale-kdelibs4support-oc \
locale-kdelibs4support-or \
locale-kdelibs4support-pa \
locale-kdelibs4support-pl \
locale-kdelibs4support-pt \
locale-kdelibs4support-pt-BR \
locale-kdelibs4support-ro \
locale-kdelibs4support-ru \
locale-kdelibs4support-si \
locale-kdelibs4support-sk \
locale-kdelibs4support-sl \
locale-kdelibs4support-sq \
locale-kdelibs4support-sr \
locale-kdelibs4support-sr@ijekavian \
locale-kdelibs4support-sr@ijekavianlatin \
locale-kdelibs4support-sr@latin \
locale-kdelibs4support-sv \
locale-kdelibs4support-ta \
locale-kdelibs4support-te \
locale-kdelibs4support-th \
locale-kdelibs4support-tr \
locale-kdelibs4support-ug \
locale-kdelibs4support-uk \
locale-kdelibs4support-vi \
locale-kdelibs4support-wa \
locale-kdelibs4support-zh-CN \
locale-kdelibs4support-zh-HK \
locale-kdelibs4support-zh-TW"

RDEPENDS:${PN} += "kdelibs4support"

inherit rpm
