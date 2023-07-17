SUMMARY = "Translations for package kdav"
DESCRIPTION = "Provides translations for the 'kdav' package."
LICENSE = "LGPL-2.0-or-later"

PV = "5.108.0"

RPM_NAME = "kdav-lang-5.108.0-1.1.noarch.rpm"
RPM_HASH = "6bf1963bb6dddcbf27fe4683ac9bbd2340ab3af7d48588b3dfd84cc6d419bcc1e8dbcf2ce32528a9b829112a8a90b44c7439f4cf5b2e0e217856afd2e30b6a8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdav-lang \
kdav-lang-all \
locale-kdav-ar \
locale-kdav-az \
locale-kdav-bg \
locale-kdav-ca \
locale-kdav-ca@valencia \
locale-kdav-cs \
locale-kdav-de \
locale-kdav-el \
locale-kdav-en-GB \
locale-kdav-es \
locale-kdav-et \
locale-kdav-eu \
locale-kdav-fi \
locale-kdav-fr \
locale-kdav-gl \
locale-kdav-hi \
locale-kdav-ia \
locale-kdav-it \
locale-kdav-ja \
locale-kdav-ka \
locale-kdav-ko \
locale-kdav-lt \
locale-kdav-nb \
locale-kdav-nl \
locale-kdav-nn \
locale-kdav-pl \
locale-kdav-pt \
locale-kdav-pt-BR \
locale-kdav-ro \
locale-kdav-ru \
locale-kdav-sk \
locale-kdav-sl \
locale-kdav-sr \
locale-kdav-sr@ijekavian \
locale-kdav-sr@ijekavianlatin \
locale-kdav-sr@latin \
locale-kdav-sv \
locale-kdav-tr \
locale-kdav-uk \
locale-kdav-zh-CN \
locale-kdav-zh-TW"

RDEPENDS:${PN} += "kdav"

inherit rpm
