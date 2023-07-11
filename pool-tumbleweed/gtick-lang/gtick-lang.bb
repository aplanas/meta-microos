SUMMARY = "Translations for package gtick"
DESCRIPTION = "Provides translations for the 'gtick' package."
LICENSE = "GPL-3.0-only"

PV = "0.5.5"

RPM_NAME = "gtick-lang-0.5.5-1.15.noarch.rpm"
RPM_HASH = "1c7c7eae6b84c058329f207f9b8f54e11f2733f596522e8dbc836bde20b061559229bcb060e55b83067cdd1ba7a0283085b7b6bfe36cfac5fd519613cd23ad86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtick-lang \
gtick-lang-all \
locale-gtick-af \
locale-gtick-ca \
locale-gtick-cs \
locale-gtick-da \
locale-gtick-de \
locale-gtick-en@boldquot \
locale-gtick-en@quot \
locale-gtick-eo \
locale-gtick-es \
locale-gtick-eu \
locale-gtick-fa \
locale-gtick-fi \
locale-gtick-fr \
locale-gtick-ga \
locale-gtick-gl \
locale-gtick-hu \
locale-gtick-id \
locale-gtick-it \
locale-gtick-ko \
locale-gtick-nl \
locale-gtick-pl \
locale-gtick-pt-BR \
locale-gtick-ro \
locale-gtick-ru \
locale-gtick-sk \
locale-gtick-sr \
locale-gtick-sv \
locale-gtick-uk \
locale-gtick-vi \
locale-gtick-zh-CN"

RDEPENDS:${PN} += "gtick"

inherit rpm
