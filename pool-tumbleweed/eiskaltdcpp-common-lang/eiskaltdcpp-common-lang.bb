SUMMARY = "Translations for package eiskaltdcpp-common"
DESCRIPTION = "Provides translations for the 'eiskaltdcpp-common' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.2"

RPM_NAME = "eiskaltdcpp-common-lang-2.4.2-1.14.noarch.rpm"
RPM_HASH = "441b13f35d702e3bb2bd38afe754a791026a35dfae3bf947348952abe87342790916c5c9af56f3182526675f4bdc9bf223dca934fb474ab4792275606ffdb0aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eiskaltdcpp-common-lang \
eiskaltdcpp-common-lang-all \
locale-eiskaltdcpp-common-be \
locale-eiskaltdcpp-common-bg \
locale-eiskaltdcpp-common-cs \
locale-eiskaltdcpp-common-da \
locale-eiskaltdcpp-common-de \
locale-eiskaltdcpp-common-el \
locale-eiskaltdcpp-common-en \
locale-eiskaltdcpp-common-es \
locale-eiskaltdcpp-common-eu \
locale-eiskaltdcpp-common-fr \
locale-eiskaltdcpp-common-hu \
locale-eiskaltdcpp-common-it \
locale-eiskaltdcpp-common-pl \
locale-eiskaltdcpp-common-pt-BR \
locale-eiskaltdcpp-common-ru \
locale-eiskaltdcpp-common-sk \
locale-eiskaltdcpp-common-sr \
locale-eiskaltdcpp-common-sr@latin \
locale-eiskaltdcpp-common-tr \
locale-eiskaltdcpp-common-uk \
locale-eiskaltdcpp-common-vi \
locale-eiskaltdcpp-common-zh-CN"

RDEPENDS:${PN} += "eiskaltdcpp-common"

inherit rpm
