SUMMARY = "Translations for package xreader"
DESCRIPTION = "Provides translations for the 'xreader' package."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.8.2"

RPM_NAME = "xreader-lang-3.8.2-1.1.noarch.rpm"
RPM_HASH = "23f787724dcc0fa33ea4684b2c6b3ac667955e322565c67b7c43d7ca32cd44dacc6f208dcf18b36a88b92c618178eeef1e81411f8660c608560bb00fae2817bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xreader-af \
locale-xreader-ar \
locale-xreader-as \
locale-xreader-ast \
locale-xreader-az \
locale-xreader-be \
locale-xreader-be@latin \
locale-xreader-bg \
locale-xreader-bn \
locale-xreader-bn-IN \
locale-xreader-br \
locale-xreader-ca \
locale-xreader-ca@valencia \
locale-xreader-cs \
locale-xreader-cy \
locale-xreader-da \
locale-xreader-de \
locale-xreader-dz \
locale-xreader-el \
locale-xreader-en-AU \
locale-xreader-en-CA \
locale-xreader-en-GB \
locale-xreader-en@shaw \
locale-xreader-eo \
locale-xreader-es \
locale-xreader-es-CO \
locale-xreader-es-VE \
locale-xreader-et \
locale-xreader-eu \
locale-xreader-fa \
locale-xreader-fi \
locale-xreader-fr \
locale-xreader-fr-CA \
locale-xreader-ga \
locale-xreader-gl \
locale-xreader-gu \
locale-xreader-he \
locale-xreader-hi \
locale-xreader-hr \
locale-xreader-hu \
locale-xreader-ia \
locale-xreader-id \
locale-xreader-is \
locale-xreader-it \
locale-xreader-ja \
locale-xreader-ka \
locale-xreader-kk \
locale-xreader-kn \
locale-xreader-ko \
locale-xreader-lt \
locale-xreader-lv \
locale-xreader-mai \
locale-xreader-mk \
locale-xreader-ml \
locale-xreader-mr \
locale-xreader-ms \
locale-xreader-nb \
locale-xreader-nds \
locale-xreader-ne \
locale-xreader-nl \
locale-xreader-nn \
locale-xreader-oc \
locale-xreader-or \
locale-xreader-pa \
locale-xreader-pl \
locale-xreader-pt \
locale-xreader-pt-BR \
locale-xreader-ro \
locale-xreader-ru \
locale-xreader-si \
locale-xreader-sk \
locale-xreader-sl \
locale-xreader-sq \
locale-xreader-sr \
locale-xreader-sr@latin \
locale-xreader-sv \
locale-xreader-ta \
locale-xreader-te \
locale-xreader-th \
locale-xreader-tr \
locale-xreader-uk \
locale-xreader-vi \
locale-xreader-wa \
locale-xreader-zh-CN \
locale-xreader-zh-HK \
locale-xreader-zh-TW \
xreader-lang \
xreader-lang-all"

RDEPENDS:${PN} += "xreader"

inherit rpm
