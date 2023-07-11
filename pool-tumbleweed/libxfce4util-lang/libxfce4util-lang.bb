SUMMARY = "Translations for package libxfce4util"
DESCRIPTION = "Provides translations for the 'libxfce4util' package."
LICENSE = "LGPL-2.1-or-later"

PV = "4.18.1"

RPM_NAME = "libxfce4util-lang-4.18.1-1.4.noarch.rpm"
RPM_HASH = "b4eeec66a8e76c9205bc7b97988305334e57a93120f7fceba24955e5863ffe25cea9274561c4d2e19bdda217acd404cd057b2ded620b931f6ce8346c70ae2676"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libxfce4util-lang \
libxfce4util-lang-all \
locale-libxfce4util-ar \
locale-libxfce4util-az \
locale-libxfce4util-be \
locale-libxfce4util-bg \
locale-libxfce4util-bn \
locale-libxfce4util-ca \
locale-libxfce4util-cs \
locale-libxfce4util-cy \
locale-libxfce4util-da \
locale-libxfce4util-de \
locale-libxfce4util-el \
locale-libxfce4util-en-AU \
locale-libxfce4util-en-GB \
locale-libxfce4util-es \
locale-libxfce4util-et \
locale-libxfce4util-eu \
locale-libxfce4util-fi \
locale-libxfce4util-fr \
locale-libxfce4util-gl \
locale-libxfce4util-he \
locale-libxfce4util-hi \
locale-libxfce4util-hr \
locale-libxfce4util-hu \
locale-libxfce4util-id \
locale-libxfce4util-is \
locale-libxfce4util-it \
locale-libxfce4util-ja \
locale-libxfce4util-ka \
locale-libxfce4util-ko \
locale-libxfce4util-lt \
locale-libxfce4util-lv \
locale-libxfce4util-ms \
locale-libxfce4util-nb \
locale-libxfce4util-nl \
locale-libxfce4util-nn \
locale-libxfce4util-oc \
locale-libxfce4util-pa \
locale-libxfce4util-pl \
locale-libxfce4util-pt \
locale-libxfce4util-pt-BR \
locale-libxfce4util-ro \
locale-libxfce4util-ru \
locale-libxfce4util-si \
locale-libxfce4util-sk \
locale-libxfce4util-sl \
locale-libxfce4util-sq \
locale-libxfce4util-sr \
locale-libxfce4util-sv \
locale-libxfce4util-th \
locale-libxfce4util-tr \
locale-libxfce4util-ug \
locale-libxfce4util-uk \
locale-libxfce4util-zh-CN \
locale-libxfce4util-zh-HK \
locale-libxfce4util-zh-TW"

RDEPENDS:${PN} += "libxfce4util"

inherit rpm
