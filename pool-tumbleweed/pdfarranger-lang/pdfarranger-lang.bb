SUMMARY = "Translations for package pdfarranger"
DESCRIPTION = "Provides translations for the 'pdfarranger' package."
LICENSE = "GPL-3.0-only"

PV = "1.9.2"

RPM_NAME = "pdfarranger-lang-1.9.2-1.3.noarch.rpm"
RPM_HASH = "23f4f19f671a28f83002db9d53ecfee44a3116e735b6c8d050067bf6480306ad50fc657690da51591359cc24090a820fd49561377eae9c8d72a21f303ff083df"
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
