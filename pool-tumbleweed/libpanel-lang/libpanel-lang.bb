SUMMARY = "Translations for package libpanel"
DESCRIPTION = "Provides translations for the 'libpanel' package."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.0"

RPM_NAME = "libpanel-lang-1.2.0-1.2.noarch.rpm"
RPM_HASH = "ff32e29c4098ec26fc18fd540ed149c821fe51a80aec0e5e4a8e58ac557c217f3dc22fff4f0085ec42c18a983882a1b3aac38b2af30341e9741558d832467f80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libpanel-lang \
libpanel-lang-all \
locale-libpanel-be \
locale-libpanel-bg \
locale-libpanel-ca \
locale-libpanel-cs \
locale-libpanel-da \
locale-libpanel-de \
locale-libpanel-el \
locale-libpanel-es \
locale-libpanel-eu \
locale-libpanel-fa \
locale-libpanel-fi \
locale-libpanel-fr \
locale-libpanel-fur \
locale-libpanel-gl \
locale-libpanel-he \
locale-libpanel-hr \
locale-libpanel-hu \
locale-libpanel-id \
locale-libpanel-is \
locale-libpanel-it \
locale-libpanel-ka \
locale-libpanel-ko \
locale-libpanel-lt \
locale-libpanel-ne \
locale-libpanel-nl \
locale-libpanel-oc \
locale-libpanel-pl \
locale-libpanel-pt \
locale-libpanel-pt-BR \
locale-libpanel-ru \
locale-libpanel-sl \
locale-libpanel-sr \
locale-libpanel-sv \
locale-libpanel-tr \
locale-libpanel-uk \
locale-libpanel-zh-CN"

RDEPENDS:${PN} += "libpanel"

inherit rpm
