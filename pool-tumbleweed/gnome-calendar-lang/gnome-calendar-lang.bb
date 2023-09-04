SUMMARY = "Translations for package gnome-calendar"
DESCRIPTION = "Provides translations for the 'gnome-calendar' package."
LICENSE = "GPL-3.0-or-later"

PV = "44.1"

RPM_NAME = "gnome-calendar-lang-44.1-2.1.noarch.rpm"
RPM_HASH = "d501f70ca67a453d266bda8ecc4ea0d779ef3ecb185f29bbcd2711861ee26dc2f0f7184701c319bdf7aef81ebd9b8c2b3f194e8079bb9a3940c8989cb42a1017"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-calendar-lang \
gnome-calendar-lang-all \
locale-gnome-calendar-af \
locale-gnome-calendar-ar \
locale-gnome-calendar-be \
locale-gnome-calendar-bg \
locale-gnome-calendar-bs \
locale-gnome-calendar-ca \
locale-gnome-calendar-ca@valencia \
locale-gnome-calendar-cs \
locale-gnome-calendar-da \
locale-gnome-calendar-de \
locale-gnome-calendar-el \
locale-gnome-calendar-en-GB \
locale-gnome-calendar-eo \
locale-gnome-calendar-es \
locale-gnome-calendar-et \
locale-gnome-calendar-eu \
locale-gnome-calendar-fa \
locale-gnome-calendar-fi \
locale-gnome-calendar-fr \
locale-gnome-calendar-fur \
locale-gnome-calendar-ga \
locale-gnome-calendar-gd \
locale-gnome-calendar-gl \
locale-gnome-calendar-he \
locale-gnome-calendar-hi \
locale-gnome-calendar-hr \
locale-gnome-calendar-hu \
locale-gnome-calendar-id \
locale-gnome-calendar-is \
locale-gnome-calendar-it \
locale-gnome-calendar-ja \
locale-gnome-calendar-ka \
locale-gnome-calendar-kk \
locale-gnome-calendar-ko \
locale-gnome-calendar-lt \
locale-gnome-calendar-lv \
locale-gnome-calendar-ml \
locale-gnome-calendar-ms \
locale-gnome-calendar-nb \
locale-gnome-calendar-ne \
locale-gnome-calendar-nl \
locale-gnome-calendar-oc \
locale-gnome-calendar-pa \
locale-gnome-calendar-pl \
locale-gnome-calendar-pt \
locale-gnome-calendar-pt-BR \
locale-gnome-calendar-ro \
locale-gnome-calendar-ru \
locale-gnome-calendar-sk \
locale-gnome-calendar-sl \
locale-gnome-calendar-sr \
locale-gnome-calendar-sr@latin \
locale-gnome-calendar-sv \
locale-gnome-calendar-ta \
locale-gnome-calendar-th \
locale-gnome-calendar-tr \
locale-gnome-calendar-uk \
locale-gnome-calendar-vi \
locale-gnome-calendar-zh-CN \
locale-gnome-calendar-zh-HK \
locale-gnome-calendar-zh-TW"

RDEPENDS:${PN} += "gnome-calendar"

inherit rpm
