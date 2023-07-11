SUMMARY = "Translations for package kdesignerplugin"
DESCRIPTION = "Provides translations for the 'kdesignerplugin' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kdesignerplugin-lang-5.107.0-1.1.noarch.rpm"
RPM_HASH = "68946c2ab79e3543ce08fb330088a5b9b6f38678cda002a1f6e3d735cc6dee32ae10489aad5f58bae88643dd7eecd9b8435849ac9b985fc29676a0dc07d986ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdesignerplugin-lang \
kdesignerplugin-lang-all \
locale-kdesignerplugin-af \
locale-kdesignerplugin-ar \
locale-kdesignerplugin-as \
locale-kdesignerplugin-az \
locale-kdesignerplugin-be \
locale-kdesignerplugin-be@latin \
locale-kdesignerplugin-bg \
locale-kdesignerplugin-bn \
locale-kdesignerplugin-bn-IN \
locale-kdesignerplugin-br \
locale-kdesignerplugin-bs \
locale-kdesignerplugin-ca \
locale-kdesignerplugin-ca@valencia \
locale-kdesignerplugin-cs \
locale-kdesignerplugin-cy \
locale-kdesignerplugin-da \
locale-kdesignerplugin-de \
locale-kdesignerplugin-el \
locale-kdesignerplugin-en-GB \
locale-kdesignerplugin-eo \
locale-kdesignerplugin-es \
locale-kdesignerplugin-et \
locale-kdesignerplugin-eu \
locale-kdesignerplugin-fa \
locale-kdesignerplugin-fi \
locale-kdesignerplugin-fr \
locale-kdesignerplugin-ga \
locale-kdesignerplugin-gd \
locale-kdesignerplugin-gl \
locale-kdesignerplugin-gu \
locale-kdesignerplugin-he \
locale-kdesignerplugin-hi \
locale-kdesignerplugin-hr \
locale-kdesignerplugin-hu \
locale-kdesignerplugin-ia \
locale-kdesignerplugin-id \
locale-kdesignerplugin-is \
locale-kdesignerplugin-it \
locale-kdesignerplugin-ja \
locale-kdesignerplugin-ka \
locale-kdesignerplugin-kk \
locale-kdesignerplugin-km \
locale-kdesignerplugin-kn \
locale-kdesignerplugin-ko \
locale-kdesignerplugin-lt \
locale-kdesignerplugin-lv \
locale-kdesignerplugin-mai \
locale-kdesignerplugin-mk \
locale-kdesignerplugin-ml \
locale-kdesignerplugin-mr \
locale-kdesignerplugin-ms \
locale-kdesignerplugin-nb \
locale-kdesignerplugin-nds \
locale-kdesignerplugin-ne \
locale-kdesignerplugin-nl \
locale-kdesignerplugin-nn \
locale-kdesignerplugin-oc \
locale-kdesignerplugin-or \
locale-kdesignerplugin-pa \
locale-kdesignerplugin-pl \
locale-kdesignerplugin-pt \
locale-kdesignerplugin-pt-BR \
locale-kdesignerplugin-ro \
locale-kdesignerplugin-ru \
locale-kdesignerplugin-si \
locale-kdesignerplugin-sk \
locale-kdesignerplugin-sl \
locale-kdesignerplugin-sq \
locale-kdesignerplugin-sr \
locale-kdesignerplugin-sr@ijekavian \
locale-kdesignerplugin-sr@ijekavianlatin \
locale-kdesignerplugin-sr@latin \
locale-kdesignerplugin-sv \
locale-kdesignerplugin-ta \
locale-kdesignerplugin-te \
locale-kdesignerplugin-th \
locale-kdesignerplugin-tr \
locale-kdesignerplugin-ug \
locale-kdesignerplugin-uk \
locale-kdesignerplugin-vi \
locale-kdesignerplugin-wa \
locale-kdesignerplugin-zh-CN \
locale-kdesignerplugin-zh-HK \
locale-kdesignerplugin-zh-TW"

RDEPENDS:${PN} += "kdesignerplugin"

inherit rpm
