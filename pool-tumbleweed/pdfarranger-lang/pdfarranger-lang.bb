SUMMARY = "Translations for package pdfarranger"
DESCRIPTION = "Provides translations for the 'pdfarranger' package."
LICENSE = "GPL-3.0-only"

PV = "1.9.2"

RPM_NAME = "pdfarranger-lang-1.9.2-1.2.noarch.rpm"
RPM_HASH = "234bbcb28ba7c4855256b2df5132102cc70b2debe9d7efabb6c031d35c63e0d3500357e1a471213658272a4de9b080556aebafabb1aff5a3500d0f2596a22b13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pdfarranger-ca \
locale-pdfarranger-ca@valencia \
locale-pdfarranger-cs \
locale-pdfarranger-da \
locale-pdfarranger-de \
locale-pdfarranger-el \
locale-pdfarranger-es \
locale-pdfarranger-fi \
locale-pdfarranger-fr \
locale-pdfarranger-he \
locale-pdfarranger-hr \
locale-pdfarranger-hu \
locale-pdfarranger-id \
locale-pdfarranger-is \
locale-pdfarranger-it \
locale-pdfarranger-ja \
locale-pdfarranger-ko \
locale-pdfarranger-nl \
locale-pdfarranger-pl-PL \
locale-pdfarranger-pt-BR \
locale-pdfarranger-pt-PT \
locale-pdfarranger-ru \
locale-pdfarranger-sv \
locale-pdfarranger-tr \
locale-pdfarranger-zh-CN \
locale-pdfarranger-zh-TW \
pdfarranger-lang \
pdfarranger-lang-all"

RDEPENDS:${PN} += "pdfarranger"

inherit rpm
