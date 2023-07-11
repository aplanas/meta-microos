SUMMARY = "Translations for package phonon4qt5"
DESCRIPTION = "Provides translations for the 'phonon4qt5' package."
LICENSE = "LGPL-2.0-or-later"

PV = "4.11.1"

RPM_NAME = "phonon4qt5-lang-4.11.1-3.10.noarch.rpm"
RPM_HASH = "5294ba795ad2e907771a29b2187cb3a404a02c80852deb37fad896d44cb37463e5e12cec0d96a85d28dc5147cca7d7de59a8d1359024a74309b244b2509cde37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-phonon4qt5-ca \
locale-phonon4qt5-cs \
locale-phonon4qt5-de \
locale-phonon4qt5-en-GB \
locale-phonon4qt5-es \
locale-phonon4qt5-eu \
locale-phonon4qt5-fi \
locale-phonon4qt5-fr \
locale-phonon4qt5-gl \
locale-phonon4qt5-id \
locale-phonon4qt5-it \
locale-phonon4qt5-ko \
locale-phonon4qt5-nl \
locale-phonon4qt5-nn \
locale-phonon4qt5-pl \
locale-phonon4qt5-pt \
locale-phonon4qt5-pt-BR \
locale-phonon4qt5-sk \
locale-phonon4qt5-sr \
locale-phonon4qt5-sr@ijekavian \
locale-phonon4qt5-sr@ijekavianlatin \
locale-phonon4qt5-sr@latin \
locale-phonon4qt5-sv \
locale-phonon4qt5-uk \
locale-phonon4qt5-zh-CN \
phonon4qt5-lang \
phonon4qt5-lang-all"

RDEPENDS:${PN} += "phonon4qt5"

inherit rpm
