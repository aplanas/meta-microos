SUMMARY = "Translations for package mate-desktop"
DESCRIPTION = "Provides translations for the 'mate-desktop' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "1.26.1"

RPM_NAME = "mate-desktop-lang-1.26.1-1.2.noarch.rpm"
RPM_HASH = "be3c4a83a7ecac5f82c164cce210551daa9ad28d801ba4435034f0824eaa823700a3eca5f1a83d6859374864b1b6f2511ddb0cb8bb6792a286567a3bb8246536"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mate-desktop-af \
locale-mate-desktop-ar \
locale-mate-desktop-as \
locale-mate-desktop-ast \
locale-mate-desktop-az \
locale-mate-desktop-be \
locale-mate-desktop-bg \
locale-mate-desktop-bn \
locale-mate-desktop-bn-IN \
locale-mate-desktop-br \
locale-mate-desktop-bs \
locale-mate-desktop-ca \
locale-mate-desktop-ca@valencia \
locale-mate-desktop-cs \
locale-mate-desktop-cy \
locale-mate-desktop-da \
locale-mate-desktop-de \
locale-mate-desktop-de-CH \
locale-mate-desktop-dz \
locale-mate-desktop-el \
locale-mate-desktop-en-AU \
locale-mate-desktop-en-CA \
locale-mate-desktop-en-GB \
locale-mate-desktop-eo \
locale-mate-desktop-es \
locale-mate-desktop-es-AR \
locale-mate-desktop-es-CL \
locale-mate-desktop-es-CO \
locale-mate-desktop-es-MX \
locale-mate-desktop-et \
locale-mate-desktop-eu \
locale-mate-desktop-fa \
locale-mate-desktop-fi \
locale-mate-desktop-fr \
locale-mate-desktop-fur \
locale-mate-desktop-ga \
locale-mate-desktop-gl \
locale-mate-desktop-gu \
locale-mate-desktop-he \
locale-mate-desktop-hi \
locale-mate-desktop-hr \
locale-mate-desktop-hu \
locale-mate-desktop-ia \
locale-mate-desktop-id \
locale-mate-desktop-is \
locale-mate-desktop-it \
locale-mate-desktop-ja \
locale-mate-desktop-ka \
locale-mate-desktop-kk \
locale-mate-desktop-kn \
locale-mate-desktop-ko \
locale-mate-desktop-lt \
locale-mate-desktop-lv \
locale-mate-desktop-mai \
locale-mate-desktop-mk \
locale-mate-desktop-ml \
locale-mate-desktop-mr \
locale-mate-desktop-ms \
locale-mate-desktop-nb \
locale-mate-desktop-nds \
locale-mate-desktop-ne \
locale-mate-desktop-nl \
locale-mate-desktop-nn \
locale-mate-desktop-oc \
locale-mate-desktop-or \
locale-mate-desktop-pa \
locale-mate-desktop-pl \
locale-mate-desktop-pt \
locale-mate-desktop-pt-BR \
locale-mate-desktop-ro \
locale-mate-desktop-ru \
locale-mate-desktop-si \
locale-mate-desktop-sk \
locale-mate-desktop-sl \
locale-mate-desktop-sq \
locale-mate-desktop-sr \
locale-mate-desktop-sr@latin \
locale-mate-desktop-sv \
locale-mate-desktop-ta \
locale-mate-desktop-te \
locale-mate-desktop-th \
locale-mate-desktop-tr \
locale-mate-desktop-ug \
locale-mate-desktop-uk \
locale-mate-desktop-vi \
locale-mate-desktop-wa \
locale-mate-desktop-zh-CN \
locale-mate-desktop-zh-HK \
locale-mate-desktop-zh-TW \
mate-desktop-lang \
mate-desktop-lang-all"

RDEPENDS:${PN} += "mate-desktop"

inherit rpm
