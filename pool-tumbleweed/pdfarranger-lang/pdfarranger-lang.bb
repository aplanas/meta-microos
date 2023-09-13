SUMMARY = "Translations for package pdfarranger"
DESCRIPTION = "Provides translations for the 'pdfarranger' package."
LICENSE = "GPL-3.0-only"

PV = "1.10.0"

RPM_NAME = "pdfarranger-lang-1.10.0-1.1.noarch.rpm"
RPM_HASH = "d0a69fd7d7b159bb1a68a9ccb994e6f8a086e087d459da79d8c4288ba7e56475ed534caafdae2dca4df24fe71763b8b472f61d185f1146504ddd04c0da8e7d55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pdfarranger-ca \
locale-pdfarranger-ca@valencia \
locale-pdfarranger-cs \
locale-pdfarranger-da \
locale-pdfarranger-de \
locale-pdfarranger-el \
locale-pdfarranger-es \
locale-pdfarranger-eu \
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
locale-pdfarranger-oc \
locale-pdfarranger-pl-PL \
locale-pdfarranger-pt-BR \
locale-pdfarranger-pt-PT \
locale-pdfarranger-ru \
locale-pdfarranger-sv \
locale-pdfarranger-tr \
locale-pdfarranger-uk \
locale-pdfarranger-zh-CN \
locale-pdfarranger-zh-TW \
pdfarranger-lang \
pdfarranger-lang-all"

RDEPENDS:${PN} += "pdfarranger"

inherit rpm
