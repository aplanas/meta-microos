SUMMARY = "Translations for package gnome-color-manager"
DESCRIPTION = "Provides translations for the 'gnome-color-manager' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.36.0"

RPM_NAME = "gnome-color-manager-lang-3.36.0-2.10.noarch.rpm"
RPM_HASH = "83f8f1f33abbff1dfa9285fe6fb1431216f6f7769d1ef721186ed8cf6efe29ec94b7f11fb4c7b98c07a31ed6859ce73516e0466c66ee8a454ee66630a8968511"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-color-manager-lang \
gnome-color-manager-lang-all \
locale-gnome-color-manager-ar \
locale-gnome-color-manager-as \
locale-gnome-color-manager-bg \
locale-gnome-color-manager-bn-IN \
locale-gnome-color-manager-bs \
locale-gnome-color-manager-ca \
locale-gnome-color-manager-ca@valencia \
locale-gnome-color-manager-cs \
locale-gnome-color-manager-da \
locale-gnome-color-manager-de \
locale-gnome-color-manager-el \
locale-gnome-color-manager-en-GB \
locale-gnome-color-manager-eo \
locale-gnome-color-manager-es \
locale-gnome-color-manager-et \
locale-gnome-color-manager-eu \
locale-gnome-color-manager-fa \
locale-gnome-color-manager-fi \
locale-gnome-color-manager-fr \
locale-gnome-color-manager-fur \
locale-gnome-color-manager-gd \
locale-gnome-color-manager-gl \
locale-gnome-color-manager-gu \
locale-gnome-color-manager-he \
locale-gnome-color-manager-hi \
locale-gnome-color-manager-hr \
locale-gnome-color-manager-hu \
locale-gnome-color-manager-id \
locale-gnome-color-manager-is \
locale-gnome-color-manager-it \
locale-gnome-color-manager-ja \
locale-gnome-color-manager-kk \
locale-gnome-color-manager-kn \
locale-gnome-color-manager-ko \
locale-gnome-color-manager-lt \
locale-gnome-color-manager-lv \
locale-gnome-color-manager-ml \
locale-gnome-color-manager-mr \
locale-gnome-color-manager-ms \
locale-gnome-color-manager-nb \
locale-gnome-color-manager-ne \
locale-gnome-color-manager-nl \
locale-gnome-color-manager-oc \
locale-gnome-color-manager-or \
locale-gnome-color-manager-pa \
locale-gnome-color-manager-pl \
locale-gnome-color-manager-pt \
locale-gnome-color-manager-pt-BR \
locale-gnome-color-manager-ro \
locale-gnome-color-manager-ru \
locale-gnome-color-manager-sk \
locale-gnome-color-manager-sl \
locale-gnome-color-manager-sr \
locale-gnome-color-manager-sr@latin \
locale-gnome-color-manager-sv \
locale-gnome-color-manager-ta \
locale-gnome-color-manager-te \
locale-gnome-color-manager-th \
locale-gnome-color-manager-tr \
locale-gnome-color-manager-ug \
locale-gnome-color-manager-uk \
locale-gnome-color-manager-vi \
locale-gnome-color-manager-zh-CN \
locale-gnome-color-manager-zh-HK \
locale-gnome-color-manager-zh-TW"

RDEPENDS:${PN} += "gnome-color-manager"

inherit rpm
