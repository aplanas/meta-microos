SUMMARY = "Translations for package nfoview"
DESCRIPTION = "Provides translations for the 'nfoview' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.29"

RPM_NAME = "nfoview-lang-1.29-1.3.noarch.rpm"
RPM_HASH = "f38f74dad2576c77f66a5dde7feff4ee71590aaa0c3429f40a82a13913ac973054d1ddda48939400e013bcfbfb86840c7edca4021d827e366645fcdba2095c4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-nfoview-bg \
locale-nfoview-br \
locale-nfoview-cs \
locale-nfoview-de \
locale-nfoview-de-CH \
locale-nfoview-el \
locale-nfoview-es-ES \
locale-nfoview-fi \
locale-nfoview-fr \
locale-nfoview-he \
locale-nfoview-hu \
locale-nfoview-it \
locale-nfoview-nl \
locale-nfoview-pl \
locale-nfoview-pt-BR \
locale-nfoview-pt-PT \
locale-nfoview-ro \
locale-nfoview-ru \
locale-nfoview-sr \
locale-nfoview-sv \
locale-nfoview-tr \
locale-nfoview-zh-CN \
nfoview-lang \
nfoview-lang-all"

RDEPENDS:${PN} += "nfoview"

inherit rpm
