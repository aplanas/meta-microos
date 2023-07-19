SUMMARY = "Translations for package calamares"
DESCRIPTION = "Provides translations for the 'calamares' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.62"

RPM_NAME = "calamares-lang-3.2.62-1.1.noarch.rpm"
RPM_HASH = "33fdec98e7a2e625baf81705ff58f4024a464abcc136589816046f1b6a7bf121b304ba10e2373ae996b9be32ec73deb761184bd899fb7b21cdae7032d131063a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "calamares-lang \
calamares-lang-all \
locale-calamares-ar \
locale-calamares-as \
locale-calamares-ast \
locale-calamares-az \
locale-calamares-be \
locale-calamares-bg \
locale-calamares-bn \
locale-calamares-ca \
locale-calamares-ca@valencia \
locale-calamares-cs-CZ \
locale-calamares-da \
locale-calamares-de \
locale-calamares-el \
locale-calamares-en-GB \
locale-calamares-eo \
locale-calamares-es \
locale-calamares-es-MX \
locale-calamares-et \
locale-calamares-eu \
locale-calamares-fa \
locale-calamares-fi-FI \
locale-calamares-fr \
locale-calamares-fur \
locale-calamares-gl \
locale-calamares-he \
locale-calamares-hi \
locale-calamares-hr \
locale-calamares-hu \
locale-calamares-id \
locale-calamares-is \
locale-calamares-it-IT \
locale-calamares-ja \
locale-calamares-ko \
locale-calamares-lt \
locale-calamares-ml \
locale-calamares-mr \
locale-calamares-nb \
locale-calamares-nl \
locale-calamares-oc \
locale-calamares-pl \
locale-calamares-pt-BR \
locale-calamares-pt-PT \
locale-calamares-ro \
locale-calamares-ru \
locale-calamares-si \
locale-calamares-sk \
locale-calamares-sl \
locale-calamares-sq \
locale-calamares-sr \
locale-calamares-sr@latin \
locale-calamares-sv \
locale-calamares-th \
locale-calamares-tr-TR \
locale-calamares-uk \
locale-calamares-vi \
locale-calamares-zh-CN \
locale-calamares-zh-TW"

RDEPENDS:${PN} += "calamares"

inherit rpm
