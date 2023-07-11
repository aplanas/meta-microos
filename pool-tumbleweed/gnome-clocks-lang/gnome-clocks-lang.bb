SUMMARY = "Translations for package gnome-clocks"
DESCRIPTION = "Provides translations for the 'gnome-clocks' package."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-clocks-lang-44.0-1.2.noarch.rpm"
RPM_HASH = "6df494032496a941e45a44f588462a9eec52760583178c2d685bab5ef76160589f83759f69614933049510c362c6a81a3a145fd4afebbcd4018a151a71223a57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-clocks-lang \
gnome-clocks-lang-all \
locale-gnome-clocks-af \
locale-gnome-clocks-ar \
locale-gnome-clocks-as \
locale-gnome-clocks-be \
locale-gnome-clocks-bg \
locale-gnome-clocks-bn-IN \
locale-gnome-clocks-bs \
locale-gnome-clocks-ca \
locale-gnome-clocks-ca@valencia \
locale-gnome-clocks-cs \
locale-gnome-clocks-da \
locale-gnome-clocks-de \
locale-gnome-clocks-el \
locale-gnome-clocks-en-GB \
locale-gnome-clocks-eo \
locale-gnome-clocks-es \
locale-gnome-clocks-et \
locale-gnome-clocks-eu \
locale-gnome-clocks-fa \
locale-gnome-clocks-fi \
locale-gnome-clocks-fr \
locale-gnome-clocks-fur \
locale-gnome-clocks-ga \
locale-gnome-clocks-gd \
locale-gnome-clocks-gl \
locale-gnome-clocks-gu \
locale-gnome-clocks-he \
locale-gnome-clocks-hi \
locale-gnome-clocks-hr \
locale-gnome-clocks-hu \
locale-gnome-clocks-id \
locale-gnome-clocks-is \
locale-gnome-clocks-it \
locale-gnome-clocks-ja \
locale-gnome-clocks-ka \
locale-gnome-clocks-kk \
locale-gnome-clocks-kn \
locale-gnome-clocks-ko \
locale-gnome-clocks-lt \
locale-gnome-clocks-lv \
locale-gnome-clocks-ml \
locale-gnome-clocks-mr \
locale-gnome-clocks-ms \
locale-gnome-clocks-nb \
locale-gnome-clocks-ne \
locale-gnome-clocks-nl \
locale-gnome-clocks-oc \
locale-gnome-clocks-or \
locale-gnome-clocks-pa \
locale-gnome-clocks-pl \
locale-gnome-clocks-pt \
locale-gnome-clocks-pt-BR \
locale-gnome-clocks-ro \
locale-gnome-clocks-ru \
locale-gnome-clocks-sk \
locale-gnome-clocks-sl \
locale-gnome-clocks-sr \
locale-gnome-clocks-sr@latin \
locale-gnome-clocks-sv \
locale-gnome-clocks-ta \
locale-gnome-clocks-te \
locale-gnome-clocks-th \
locale-gnome-clocks-tr \
locale-gnome-clocks-ug \
locale-gnome-clocks-uk \
locale-gnome-clocks-vi \
locale-gnome-clocks-zh-CN \
locale-gnome-clocks-zh-HK \
locale-gnome-clocks-zh-TW"

RDEPENDS:${PN} += "gnome-clocks"

inherit rpm
