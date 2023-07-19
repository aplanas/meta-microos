SUMMARY = "Translations for package kphotoalbum"
DESCRIPTION = "Provides translations for the 'kphotoalbum' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.11.0"

RPM_NAME = "kphotoalbum-lang-5.11.0-1.1.noarch.rpm"
RPM_HASH = "54804d91e6bdf82f5bfe28dbe22b33d5c9ab8674f210ba25a5ab8da42f603a0b1036ebe13c5fdb12001efc00f5f4ab9616648614d16b3eb5ded314e5f641e599"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kphotoalbum-lang \
kphotoalbum-lang-all \
locale-kphotoalbum-ar \
locale-kphotoalbum-be \
locale-kphotoalbum-bg \
locale-kphotoalbum-bs \
locale-kphotoalbum-ca \
locale-kphotoalbum-ca@valencia \
locale-kphotoalbum-cs \
locale-kphotoalbum-da \
locale-kphotoalbum-de \
locale-kphotoalbum-el \
locale-kphotoalbum-en-GB \
locale-kphotoalbum-eo \
locale-kphotoalbum-es \
locale-kphotoalbum-et \
locale-kphotoalbum-eu \
locale-kphotoalbum-fi \
locale-kphotoalbum-fr \
locale-kphotoalbum-ga \
locale-kphotoalbum-gl \
locale-kphotoalbum-hi \
locale-kphotoalbum-hr \
locale-kphotoalbum-hu \
locale-kphotoalbum-ia \
locale-kphotoalbum-id \
locale-kphotoalbum-is \
locale-kphotoalbum-it \
locale-kphotoalbum-ja \
locale-kphotoalbum-ka \
locale-kphotoalbum-km \
locale-kphotoalbum-lt \
locale-kphotoalbum-mai \
locale-kphotoalbum-mr \
locale-kphotoalbum-nb \
locale-kphotoalbum-nds \
locale-kphotoalbum-nl \
locale-kphotoalbum-nn \
locale-kphotoalbum-pa \
locale-kphotoalbum-pl \
locale-kphotoalbum-pt \
locale-kphotoalbum-pt-BR \
locale-kphotoalbum-ro \
locale-kphotoalbum-ru \
locale-kphotoalbum-sk \
locale-kphotoalbum-sl \
locale-kphotoalbum-sv \
locale-kphotoalbum-tr \
locale-kphotoalbum-ug \
locale-kphotoalbum-uk \
locale-kphotoalbum-vi \
locale-kphotoalbum-zh-CN \
locale-kphotoalbum-zh-TW"

RDEPENDS:${PN} += "kphotoalbum"

inherit rpm
