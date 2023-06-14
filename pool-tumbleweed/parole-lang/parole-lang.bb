SUMMARY = "Translations for package parole"
DESCRIPTION = "Provides translations for the 'parole' package."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "parole-lang-4.18.0-1.3.noarch.rpm"
RPM_HASH = "e5783dc6e57d27517b54d4655278a5033cfd71e4d5d3f4b68cd641b825c429565cb884d70fe24a7911ac3d2162c26e2b043798663cf494bf84d97efe1579f90e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-parole-ar \
locale-parole-ast \
locale-parole-be \
locale-parole-bg \
locale-parole-ca \
locale-parole-cs \
locale-parole-da \
locale-parole-de \
locale-parole-el \
locale-parole-en-AU \
locale-parole-en-GB \
locale-parole-es \
locale-parole-et \
locale-parole-eu \
locale-parole-fi \
locale-parole-fr \
locale-parole-gl \
locale-parole-he \
locale-parole-hr \
locale-parole-hu \
locale-parole-id \
locale-parole-is \
locale-parole-it \
locale-parole-ja \
locale-parole-kk \
locale-parole-ko \
locale-parole-lt \
locale-parole-lv \
locale-parole-ms \
locale-parole-nb \
locale-parole-nl \
locale-parole-nn \
locale-parole-oc \
locale-parole-pl \
locale-parole-pt \
locale-parole-pt-BR \
locale-parole-ru \
locale-parole-sk \
locale-parole-sl \
locale-parole-sq \
locale-parole-sr \
locale-parole-sv \
locale-parole-te \
locale-parole-th \
locale-parole-tr \
locale-parole-ug \
locale-parole-uk \
locale-parole-zh-CN \
locale-parole-zh-TW \
parole-lang \
parole-lang-all"

RDEPENDS:${PN} += "parole"

inherit rpm
