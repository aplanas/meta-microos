SUMMARY = "Translations for package rsibreak"
DESCRIPTION = "Provides translations for the 'rsibreak' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.15"

RPM_NAME = "rsibreak-lang-0.12.15-1.5.noarch.rpm"
RPM_HASH = "fee9825b09c696e185573d01590a420522f2d623221b705c1b82df88049f44160cb884fa16baa2811a9454ff488a2335ee301af7780e88f79370eb3b7515e5af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-rsibreak-ar \
locale-rsibreak-be \
locale-rsibreak-bs \
locale-rsibreak-ca \
locale-rsibreak-ca@valencia \
locale-rsibreak-cs \
locale-rsibreak-da \
locale-rsibreak-de \
locale-rsibreak-el \
locale-rsibreak-en-GB \
locale-rsibreak-eo \
locale-rsibreak-es \
locale-rsibreak-et \
locale-rsibreak-fi \
locale-rsibreak-fr \
locale-rsibreak-ga \
locale-rsibreak-gl \
locale-rsibreak-hi \
locale-rsibreak-hr \
locale-rsibreak-hu \
locale-rsibreak-ia \
locale-rsibreak-id \
locale-rsibreak-is \
locale-rsibreak-it \
locale-rsibreak-ja \
locale-rsibreak-km \
locale-rsibreak-ko \
locale-rsibreak-lt \
locale-rsibreak-mai \
locale-rsibreak-nb \
locale-rsibreak-nds \
locale-rsibreak-nl \
locale-rsibreak-nn \
locale-rsibreak-oc \
locale-rsibreak-pl \
locale-rsibreak-pt \
locale-rsibreak-pt-BR \
locale-rsibreak-ro \
locale-rsibreak-ru \
locale-rsibreak-sk \
locale-rsibreak-sl \
locale-rsibreak-sv \
locale-rsibreak-ta \
locale-rsibreak-tr \
locale-rsibreak-ug \
locale-rsibreak-uk \
locale-rsibreak-zh-CN \
locale-rsibreak-zh-TW \
rsibreak-lang \
rsibreak-lang-all"

RDEPENDS:${PN} += "rsibreak"

inherit rpm
