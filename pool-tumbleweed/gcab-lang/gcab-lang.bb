SUMMARY = "Translations for package gcab"
DESCRIPTION = "Provides translations for the 'gcab' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6"

RPM_NAME = "gcab-lang-1.6-1.1.noarch.rpm"
RPM_HASH = "2e051ff80072df0086be64741b2dbf91274937608ac4fcbccc64ca9b994e7e72cb0ffae21e76dcbccf02662d402c4779aa2a59662cd56f880813bec66e292d08"
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
