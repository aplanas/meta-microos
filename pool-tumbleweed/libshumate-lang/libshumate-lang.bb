SUMMARY = "Translations for package libshumate"
DESCRIPTION = "Provides translations for the 'libshumate' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.4"

RPM_NAME = "libshumate-lang-1.0.4-1.1.noarch.rpm"
RPM_HASH = "735ee59ced361834949f7d5b5e73f5881b4df12e01b96e8ea095d63d6f09d62fd72657651179c6e5e5183b09fb442ab0608dc3d4ed64e6f50cc5a206cc603736"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libshumate-lang \
libshumate-lang-all \
locale-libshumate-be \
locale-libshumate-bg \
locale-libshumate-ca \
locale-libshumate-cs \
locale-libshumate-da \
locale-libshumate-de \
locale-libshumate-el \
locale-libshumate-es \
locale-libshumate-eu \
locale-libshumate-fa \
locale-libshumate-fi \
locale-libshumate-fr \
locale-libshumate-fur \
locale-libshumate-gl \
locale-libshumate-he \
locale-libshumate-hr \
locale-libshumate-hu \
locale-libshumate-id \
locale-libshumate-it \
locale-libshumate-ka \
locale-libshumate-kk \
locale-libshumate-ko \
locale-libshumate-lt \
locale-libshumate-lv \
locale-libshumate-ne \
locale-libshumate-nl \
locale-libshumate-oc \
locale-libshumate-pl \
locale-libshumate-pt \
locale-libshumate-pt-BR \
locale-libshumate-ru \
locale-libshumate-sk \
locale-libshumate-sl \
locale-libshumate-sr \
locale-libshumate-sv \
locale-libshumate-tr \
locale-libshumate-uk \
locale-libshumate-zh-CN"

RDEPENDS:${PN} += "libshumate"

inherit rpm
