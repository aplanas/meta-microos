SUMMARY = "Translations for package gcab"
DESCRIPTION = "Provides translations for the 'gcab' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5"

RPM_NAME = "gcab-lang-1.5-1.6.noarch.rpm"
RPM_HASH = "ca5973565ab24d963278ca9e357d443793329c2d81497aaf8d9e8d8d5ff7e92a8c348ecdd2fcdd04a4dcb7e10988ecec8368b98563b6a9d6b134c14186e40ec5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcab-lang \
gcab-lang-all \
locale-gcab-bs \
locale-gcab-cs \
locale-gcab-da \
locale-gcab-de \
locale-gcab-el \
locale-gcab-en-GB \
locale-gcab-es \
locale-gcab-eu \
locale-gcab-fi \
locale-gcab-fr \
locale-gcab-fur \
locale-gcab-gl \
locale-gcab-hr \
locale-gcab-hu \
locale-gcab-id \
locale-gcab-ja \
locale-gcab-ka \
locale-gcab-lt \
locale-gcab-lv \
locale-gcab-nb \
locale-gcab-nl \
locale-gcab-oc \
locale-gcab-pl \
locale-gcab-pt \
locale-gcab-pt-BR \
locale-gcab-ro \
locale-gcab-ru \
locale-gcab-sl \
locale-gcab-sr \
locale-gcab-sr@latin \
locale-gcab-sv \
locale-gcab-tr \
locale-gcab-uk \
locale-gcab-zh-CN"

RDEPENDS:${PN} += "gcab"

inherit rpm
