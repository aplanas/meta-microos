SUMMARY = "Translations for package gtg"
DESCRIPTION = "Provides translations for the 'gtg' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.6"

RPM_NAME = "gtg-lang-0.6-1.4.noarch.rpm"
RPM_HASH = "5d8146cbfc88d13a22c5505cd79b25dcc391d824a3ef7cbf9ef36324fa16d7d37fea57fe95bab52503928fea1f4a8df64c8f9a564a9a131895891760a7d17be8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtg-lang \
gtg-lang-all \
locale-gtg-af \
locale-gtg-ar \
locale-gtg-ast \
locale-gtg-be \
locale-gtg-bg \
locale-gtg-bn \
locale-gtg-ca \
locale-gtg-cs \
locale-gtg-da \
locale-gtg-de \
locale-gtg-el \
locale-gtg-en-CA \
locale-gtg-en-GB \
locale-gtg-eo \
locale-gtg-es \
locale-gtg-eu \
locale-gtg-fa \
locale-gtg-fi \
locale-gtg-fr \
locale-gtg-gl \
locale-gtg-he \
locale-gtg-hi \
locale-gtg-hr \
locale-gtg-hu \
locale-gtg-ia \
locale-gtg-id \
locale-gtg-is \
locale-gtg-it \
locale-gtg-ja \
locale-gtg-ka \
locale-gtg-ko \
locale-gtg-lt \
locale-gtg-ms \
locale-gtg-nb \
locale-gtg-nds \
locale-gtg-nl \
locale-gtg-oc \
locale-gtg-pl \
locale-gtg-pt \
locale-gtg-pt-BR \
locale-gtg-ro \
locale-gtg-ru \
locale-gtg-si \
locale-gtg-sk \
locale-gtg-sl \
locale-gtg-sq \
locale-gtg-sr \
locale-gtg-sv \
locale-gtg-te \
locale-gtg-th \
locale-gtg-tr \
locale-gtg-uk \
locale-gtg-zh-CN \
locale-gtg-zh-TW"

RDEPENDS:${PN} += "gtg"

inherit rpm
