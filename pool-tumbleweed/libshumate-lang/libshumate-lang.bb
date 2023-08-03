SUMMARY = "Translations for package libshumate"
DESCRIPTION = "Provides translations for the 'libshumate' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.5"

RPM_NAME = "libshumate-lang-1.0.5-1.1.noarch.rpm"
RPM_HASH = "cc8ea87621c4ead392537ba5daa94668a3a737a1ec2a92954c2a7ac45e9cd65a8ad8fbff81be65b62a02c314089129288a5c0b16fe8ffbfd1d0fd304bcc50efc"
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
