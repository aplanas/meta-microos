SUMMARY = "Translations for package libhandy"
DESCRIPTION = "Provides translations for the 'libhandy' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.2"

RPM_NAME = "libhandy-lang-1.8.2-1.4.noarch.rpm"
RPM_HASH = "51fab9fef629f146706b51190230c8c709017c2331aefa7d6a3b2a8a1952fd4ab567d0cd8fbfea9c5c10a4cceb6e963d1214f584de9ffcba67a70d2a0099c2f0"
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
