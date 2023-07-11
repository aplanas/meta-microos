SUMMARY = "Translations for package gnome-tour"
DESCRIPTION = "Provides translations for the 'gnome-tour' package."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-tour-lang-44.0-2.2.noarch.rpm"
RPM_HASH = "343ca7c23548a09bb7f75d228ac6f85b71961158b9b64b481f1a7b0bd43743c502b50aa8543c08ca570164cab2c67c0a19fc5bba5a9f4efb3b01c02e33467bc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-tour-lang \
gnome-tour-lang-all \
locale-gnome-tour-be \
locale-gnome-tour-bg \
locale-gnome-tour-ca \
locale-gnome-tour-cs \
locale-gnome-tour-da \
locale-gnome-tour-de \
locale-gnome-tour-el \
locale-gnome-tour-en-GB \
locale-gnome-tour-eo \
locale-gnome-tour-es \
locale-gnome-tour-eu \
locale-gnome-tour-fa \
locale-gnome-tour-fi \
locale-gnome-tour-fr \
locale-gnome-tour-fur \
locale-gnome-tour-gl \
locale-gnome-tour-he \
locale-gnome-tour-hi \
locale-gnome-tour-hr \
locale-gnome-tour-hu \
locale-gnome-tour-id \
locale-gnome-tour-is \
locale-gnome-tour-it \
locale-gnome-tour-ja \
locale-gnome-tour-ka \
locale-gnome-tour-kk \
locale-gnome-tour-ko \
locale-gnome-tour-lt \
locale-gnome-tour-lv \
locale-gnome-tour-nb \
locale-gnome-tour-ne \
locale-gnome-tour-nl \
locale-gnome-tour-oc \
locale-gnome-tour-pa \
locale-gnome-tour-pl \
locale-gnome-tour-pt \
locale-gnome-tour-pt-BR \
locale-gnome-tour-ro \
locale-gnome-tour-ru \
locale-gnome-tour-sk \
locale-gnome-tour-sl \
locale-gnome-tour-sr \
locale-gnome-tour-sv \
locale-gnome-tour-tr \
locale-gnome-tour-uk \
locale-gnome-tour-vi \
locale-gnome-tour-zh-CN \
locale-gnome-tour-zh-TW"

RDEPENDS:${PN} += "gnome-tour"

inherit rpm
