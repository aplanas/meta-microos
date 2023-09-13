SUMMARY = "Translations for package libadwaita"
DESCRIPTION = "Provides translations for the 'libadwaita' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.5"

RPM_NAME = "libadwaita-lang-1.3.5-1.1.noarch.rpm"
RPM_HASH = "d136ae7c3fc6c73632e1257693a661e05774d08d6e04531e7831b0b6113456f17b5392790836667b6dc17e9617b28f320d466e0a107ad077eb752c754270a472"
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
