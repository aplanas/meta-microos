SUMMARY = "Translations for package libshumate"
DESCRIPTION = "Provides translations for the 'libshumate' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.3"

RPM_NAME = "libshumate-lang-1.0.3-1.4.noarch.rpm"
RPM_HASH = "597b95035a37c5ad2dafc4109ee5e932adda84fb15c576c6b4e6994dcd58bdb71cefc044fe29378b8a7f40e0193a77d32d923abf55e1e22f7fa7a93cf0ffc21c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libshumate-lang \
libshumate-lang-all \
locale-libshumate-bg \
locale-libshumate-ca \
locale-libshumate-cs \
locale-libshumate-da \
locale-libshumate-de \
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
locale-libshumate-sl \
locale-libshumate-sr \
locale-libshumate-sv \
locale-libshumate-tr \
locale-libshumate-uk \
locale-libshumate-zh-CN"

RDEPENDS:${PN} += "libshumate"

inherit rpm
