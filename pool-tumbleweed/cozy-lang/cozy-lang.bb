SUMMARY = "Translations for package cozy"
DESCRIPTION = "Provides translations for the 'cozy' package."
LICENSE = "GPL-3.0-only"

PV = "1.2.1"

RPM_NAME = "cozy-lang-1.2.1-2.2.noarch.rpm"
RPM_HASH = "cc32a3bef1b5573e156727f0ec2bf10741366fcec5d80b3d5cb76c6bc560545a82c353efde6f16f85d409aa89bcf9ac213f4f94c7cd4787bd4378a4388aaee36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cozy-lang \
cozy-lang-all \
locale-cozy-bg \
locale-cozy-cs \
locale-cozy-da \
locale-cozy-de \
locale-cozy-el \
locale-cozy-es \
locale-cozy-fi \
locale-cozy-fr \
locale-cozy-gl \
locale-cozy-hi \
locale-cozy-hr \
locale-cozy-it \
locale-cozy-nl \
locale-cozy-pl \
locale-cozy-pt \
locale-cozy-pt-BR \
locale-cozy-ru \
locale-cozy-sv \
locale-cozy-tr \
locale-cozy-uk \
locale-cozy-zh"

RDEPENDS:${PN} += "cozy"

inherit rpm
