SUMMARY = "Translations for package go-for-it"
DESCRIPTION = "Provides translations for the 'go-for-it' package."
LICENSE = "GPL-3.0"

PV = "1.6.3"

RPM_NAME = "go-for-it-lang-1.6.3-1.27.noarch.rpm"
RPM_HASH = "6c39a2d202d1374295265951be0bc70f61cf96b637ed3b630e1544d71edb3d10021adfe045e6f578cce1ab605327ead84064bc5bb8ace71b7e735cf1d6df735d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "go-for-it-lang \
go-for-it-lang-all \
locale-go-for-it-af \
locale-go-for-it-ar \
locale-go-for-it-as \
locale-go-for-it-ast \
locale-go-for-it-az \
locale-go-for-it-be \
locale-go-for-it-bg \
locale-go-for-it-bn \
locale-go-for-it-br \
locale-go-for-it-bs \
locale-go-for-it-ca \
locale-go-for-it-cs \
locale-go-for-it-cy \
locale-go-for-it-da \
locale-go-for-it-de \
locale-go-for-it-dz \
locale-go-for-it-el \
locale-go-for-it-en-AU \
locale-go-for-it-en-CA \
locale-go-for-it-en-GB \
locale-go-for-it-eo \
locale-go-for-it-es \
locale-go-for-it-et \
locale-go-for-it-eu \
locale-go-for-it-fa \
locale-go-for-it-fi \
locale-go-for-it-fr \
locale-go-for-it-fr-CA \
locale-go-for-it-fr-FR \
locale-go-for-it-ga \
locale-go-for-it-gd \
locale-go-for-it-gl \
locale-go-for-it-gu \
locale-go-for-it-he \
locale-go-for-it-hi \
locale-go-for-it-hr \
locale-go-for-it-hu \
locale-go-for-it-ia \
locale-go-for-it-id \
locale-go-for-it-is \
locale-go-for-it-it \
locale-go-for-it-ja \
locale-go-for-it-ka \
locale-go-for-it-kk \
locale-go-for-it-km \
locale-go-for-it-kn \
locale-go-for-it-ko \
locale-go-for-it-lt \
locale-go-for-it-lv \
locale-go-for-it-mk \
locale-go-for-it-ml \
locale-go-for-it-mr \
locale-go-for-it-ms \
locale-go-for-it-nb \
locale-go-for-it-ne \
locale-go-for-it-nl \
locale-go-for-it-nn \
locale-go-for-it-oc \
locale-go-for-it-or \
locale-go-for-it-pa \
locale-go-for-it-pl \
locale-go-for-it-pt \
locale-go-for-it-pt-BR \
locale-go-for-it-ro \
locale-go-for-it-ru \
locale-go-for-it-si \
locale-go-for-it-sk \
locale-go-for-it-sl \
locale-go-for-it-sq \
locale-go-for-it-sr \
locale-go-for-it-sv \
locale-go-for-it-ta \
locale-go-for-it-te \
locale-go-for-it-th \
locale-go-for-it-tr \
locale-go-for-it-ug \
locale-go-for-it-uk \
locale-go-for-it-vi \
locale-go-for-it-wa \
locale-go-for-it-zh \
locale-go-for-it-zh-CN \
locale-go-for-it-zh-HK \
locale-go-for-it-zh-TW"

RDEPENDS:${PN} += "go-for-it"

inherit rpm
