SUMMARY = "Translations for package mate-user-guide"
DESCRIPTION = "Provides translations for the 'mate-user-guide' package."
LICENSE = "GFDL-1.1-or-later"

PV = "1.26.1"

RPM_NAME = "mate-user-guide-lang-1.26.1-1.1.noarch.rpm"
RPM_HASH = "4e3f7f018f33f3cdfbb2b23bbc8d42e6799e85a1adb50c6b0adc25ae7f5ce5a8bcaa65a34caebf3c76dfedb8b5dc22a0bf6efa00f59af66023e6bb80ffda3d40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mate-user-guide-af \
locale-mate-user-guide-ar \
locale-mate-user-guide-as \
locale-mate-user-guide-ast \
locale-mate-user-guide-az \
locale-mate-user-guide-be \
locale-mate-user-guide-bg \
locale-mate-user-guide-bn \
locale-mate-user-guide-bn-IN \
locale-mate-user-guide-br \
locale-mate-user-guide-bs \
locale-mate-user-guide-ca \
locale-mate-user-guide-ca@valencia \
locale-mate-user-guide-cs \
locale-mate-user-guide-cy \
locale-mate-user-guide-da \
locale-mate-user-guide-de \
locale-mate-user-guide-dz \
locale-mate-user-guide-el \
locale-mate-user-guide-en-AU \
locale-mate-user-guide-en-CA \
locale-mate-user-guide-en-GB \
locale-mate-user-guide-eo \
locale-mate-user-guide-es \
locale-mate-user-guide-es-AR \
locale-mate-user-guide-es-CL \
locale-mate-user-guide-es-CO \
locale-mate-user-guide-es-ES \
locale-mate-user-guide-es-MX \
locale-mate-user-guide-es-PR \
locale-mate-user-guide-et \
locale-mate-user-guide-eu \
locale-mate-user-guide-fa \
locale-mate-user-guide-fi \
locale-mate-user-guide-fr \
locale-mate-user-guide-fr-CA \
locale-mate-user-guide-fur \
locale-mate-user-guide-ga \
locale-mate-user-guide-gl \
locale-mate-user-guide-gu \
locale-mate-user-guide-he \
locale-mate-user-guide-hi \
locale-mate-user-guide-hr \
locale-mate-user-guide-hu \
locale-mate-user-guide-ia \
locale-mate-user-guide-id \
locale-mate-user-guide-is \
locale-mate-user-guide-it \
locale-mate-user-guide-ja \
locale-mate-user-guide-ka \
locale-mate-user-guide-kk \
locale-mate-user-guide-kn \
locale-mate-user-guide-ko \
locale-mate-user-guide-lt \
locale-mate-user-guide-lv \
locale-mate-user-guide-mai \
locale-mate-user-guide-mk \
locale-mate-user-guide-ml \
locale-mate-user-guide-mr \
locale-mate-user-guide-ms \
locale-mate-user-guide-nb \
locale-mate-user-guide-nds \
locale-mate-user-guide-ne \
locale-mate-user-guide-nl \
locale-mate-user-guide-nn \
locale-mate-user-guide-oc \
locale-mate-user-guide-or \
locale-mate-user-guide-pa \
locale-mate-user-guide-pl \
locale-mate-user-guide-pt \
locale-mate-user-guide-pt-BR \
locale-mate-user-guide-ro \
locale-mate-user-guide-ru \
locale-mate-user-guide-si \
locale-mate-user-guide-sk \
locale-mate-user-guide-sl \
locale-mate-user-guide-sq \
locale-mate-user-guide-sr \
locale-mate-user-guide-sr@latin \
locale-mate-user-guide-sv \
locale-mate-user-guide-ta \
locale-mate-user-guide-te \
locale-mate-user-guide-th \
locale-mate-user-guide-tr \
locale-mate-user-guide-ug \
locale-mate-user-guide-uk \
locale-mate-user-guide-vi \
locale-mate-user-guide-wa \
locale-mate-user-guide-zh-CN \
locale-mate-user-guide-zh-HK \
locale-mate-user-guide-zh-TW \
mate-user-guide-lang \
mate-user-guide-lang-all"

RDEPENDS:${PN} += "mate-user-guide"

inherit rpm
