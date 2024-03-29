SUMMARY = "Translations for package kdav"
DESCRIPTION = "Provides translations for the 'kdav' package."
LICENSE = "LGPL-2.0-or-later"

PV = "5.109.0"

RPM_NAME = "kdav-lang-5.109.0-1.1.noarch.rpm"
RPM_HASH = "e77da907f08cd4a548b157b0a6fd0dfb7559a6cb5e1e9920cc3b9d4b6e210ed5f2cb5a2c741c64475a5b76947b8b6b16cc3fd086d44eab59c018b181cb4fdd02"
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
locale-kdav-eo \
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
