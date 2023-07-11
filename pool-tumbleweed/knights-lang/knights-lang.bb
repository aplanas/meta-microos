SUMMARY = "Translations for package knights"
DESCRIPTION = "Provides translations for the 'knights' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "knights-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "fcc1d23c04e13dcfc337f7dd6f3b136a7d5c1afa42c3c52c2a988865c74eca97721178124e280cb4dc182699427957d0041106cff3873d70cb7ee63cce9c9e2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "knights-lang \
knights-lang-all \
locale-knights-ar \
locale-knights-bg \
locale-knights-bs \
locale-knights-ca \
locale-knights-ca@valencia \
locale-knights-cs \
locale-knights-da \
locale-knights-de \
locale-knights-el \
locale-knights-en-GB \
locale-knights-eo \
locale-knights-es \
locale-knights-et \
locale-knights-eu \
locale-knights-fa \
locale-knights-fi \
locale-knights-fr \
locale-knights-ga \
locale-knights-gl \
locale-knights-hu \
locale-knights-id \
locale-knights-it \
locale-knights-ja \
locale-knights-ka \
locale-knights-km \
locale-knights-ko \
locale-knights-lt \
locale-knights-ml \
locale-knights-mr \
locale-knights-nb \
locale-knights-nds \
locale-knights-nl \
locale-knights-nn \
locale-knights-pl \
locale-knights-pt \
locale-knights-pt-BR \
locale-knights-ro \
locale-knights-ru \
locale-knights-sk \
locale-knights-sl \
locale-knights-sr \
locale-knights-sr@ijekavian \
locale-knights-sr@ijekavianlatin \
locale-knights-sr@latin \
locale-knights-sv \
locale-knights-tr \
locale-knights-ug \
locale-knights-uk \
locale-knights-zh-CN \
locale-knights-zh-TW"

RDEPENDS:${PN} += "knights"

inherit rpm
