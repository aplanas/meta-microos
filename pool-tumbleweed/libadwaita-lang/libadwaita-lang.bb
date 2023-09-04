SUMMARY = "Translations for package libadwaita"
DESCRIPTION = "Provides translations for the 'libadwaita' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.4"

RPM_NAME = "libadwaita-lang-1.3.4-1.1.noarch.rpm"
RPM_HASH = "d51cb81245d645840d5c077033ddb0481a36bafdba53df8d29d2797f059de35da2f1245d566b55ceef5b5ae94d230e369567ac70c5f96b0aa5daf3e1813c09f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libadwaita-lang \
libadwaita-lang-all \
locale-libadwaita-be \
locale-libadwaita-bg \
locale-libadwaita-ca \
locale-libadwaita-cs \
locale-libadwaita-da \
locale-libadwaita-de \
locale-libadwaita-el \
locale-libadwaita-en-GB \
locale-libadwaita-es \
locale-libadwaita-eu \
locale-libadwaita-fa \
locale-libadwaita-fi \
locale-libadwaita-fr \
locale-libadwaita-fur \
locale-libadwaita-gl \
locale-libadwaita-he \
locale-libadwaita-hi \
locale-libadwaita-hr \
locale-libadwaita-hu \
locale-libadwaita-id \
locale-libadwaita-it \
locale-libadwaita-ja \
locale-libadwaita-ka \
locale-libadwaita-kk \
locale-libadwaita-ko \
locale-libadwaita-lt \
locale-libadwaita-ne \
locale-libadwaita-nl \
locale-libadwaita-oc \
locale-libadwaita-pl \
locale-libadwaita-pt \
locale-libadwaita-pt-BR \
locale-libadwaita-ro \
locale-libadwaita-ru \
locale-libadwaita-sk \
locale-libadwaita-sl \
locale-libadwaita-sr \
locale-libadwaita-sv \
locale-libadwaita-tr \
locale-libadwaita-uk \
locale-libadwaita-vi \
locale-libadwaita-zh-CN \
locale-libadwaita-zh-TW"

RDEPENDS:${PN} += "libadwaita"

inherit rpm
