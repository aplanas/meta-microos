SUMMARY = "Translations for package catfish"
DESCRIPTION = "Provides translations for the 'catfish' package."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "catfish-lang-4.18.0-1.1.noarch.rpm"
RPM_HASH = "6ce277c55829e7dea931e9d4206939ff39f2b36513570f4e27653d625b4b575835f95cfc36a6e38447abd79bae9060668f0e76f6440a8605d9c526e6ed8715d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "catfish-lang \
catfish-lang-all \
locale-catfish-af \
locale-catfish-ar \
locale-catfish-be \
locale-catfish-bg \
locale-catfish-ca \
locale-catfish-cs \
locale-catfish-da \
locale-catfish-de \
locale-catfish-el \
locale-catfish-en-AU \
locale-catfish-en-GB \
locale-catfish-eo \
locale-catfish-es \
locale-catfish-et \
locale-catfish-eu \
locale-catfish-fi \
locale-catfish-fr \
locale-catfish-gl \
locale-catfish-he \
locale-catfish-hr \
locale-catfish-hu \
locale-catfish-id \
locale-catfish-is \
locale-catfish-it \
locale-catfish-ja \
locale-catfish-kk \
locale-catfish-ko \
locale-catfish-lt \
locale-catfish-lv \
locale-catfish-ml \
locale-catfish-ms \
locale-catfish-nb \
locale-catfish-nl \
locale-catfish-nn \
locale-catfish-pl \
locale-catfish-pt \
locale-catfish-pt-BR \
locale-catfish-ru \
locale-catfish-si \
locale-catfish-sk \
locale-catfish-sl \
locale-catfish-sq \
locale-catfish-sr \
locale-catfish-sv \
locale-catfish-th \
locale-catfish-tr \
locale-catfish-uk \
locale-catfish-zh-CN \
locale-catfish-zh-TW"

RDEPENDS:${PN} += "catfish"

inherit rpm
