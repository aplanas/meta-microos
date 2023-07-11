SUMMARY = "Translations for package kdav"
DESCRIPTION = "Provides translations for the 'kdav' package."
LICENSE = "LGPL-2.0-or-later"

PV = "5.107.0"

RPM_NAME = "kdav-lang-5.107.0-1.1.noarch.rpm"
RPM_HASH = "d42c4dec2a045060ec230bf3530c8a28cd9e070ce83ae7de03b2a7000b46660dceb63bbc267cd18fd67114853cfd3692ab3cd8eea24e0db7dd9900bc92567fd5"
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
