SUMMARY = "Translations for package libhandy"
DESCRIPTION = "Provides translations for the 'libhandy' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.2"

RPM_NAME = "libhandy-lang-1.8.2-1.3.noarch.rpm"
RPM_HASH = "cbab35f00bdd352be1ee3e7fd3cbefdedcb23080138c508d0893318227236826835e0ea6d0c6dbc479f1e4534cd96653cf13122c417c29b7973512b1db56068a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libhandy-lang \
libhandy-lang-all \
locale-libhandy-ca \
locale-libhandy-cs \
locale-libhandy-de \
locale-libhandy-en-GB \
locale-libhandy-es \
locale-libhandy-eu \
locale-libhandy-fa \
locale-libhandy-fi \
locale-libhandy-fr \
locale-libhandy-fur \
locale-libhandy-gl \
locale-libhandy-hr \
locale-libhandy-hu \
locale-libhandy-id \
locale-libhandy-ka \
locale-libhandy-ko \
locale-libhandy-nl \
locale-libhandy-oc \
locale-libhandy-pl \
locale-libhandy-pt \
locale-libhandy-pt-BR \
locale-libhandy-ro \
locale-libhandy-ru \
locale-libhandy-sl \
locale-libhandy-sr \
locale-libhandy-sv \
locale-libhandy-tr \
locale-libhandy-uk \
locale-libhandy-zh-CN"

RDEPENDS:${PN} += "libhandy"

inherit rpm
