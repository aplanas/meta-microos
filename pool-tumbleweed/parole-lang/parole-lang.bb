SUMMARY = "Translations for package parole"
DESCRIPTION = "Provides translations for the 'parole' package."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "parole-lang-4.18.0-1.4.noarch.rpm"
RPM_HASH = "19e1ea8992f8aa20563245847ea4ebeaa95a06a9828888f311593ea65136e156dbdcb9879e4c217201718da1b6c628b695e689af360d8af85e4e4cd70199e575"
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
