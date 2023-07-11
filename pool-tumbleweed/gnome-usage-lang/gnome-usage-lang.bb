SUMMARY = "Translations for package gnome-usage"
DESCRIPTION = "Provides translations for the 'gnome-usage' package."
LICENSE = "GPL-3.0-only"

PV = "3.38.1"

RPM_NAME = "gnome-usage-lang-3.38.1-1.11.noarch.rpm"
RPM_HASH = "3ab898d6e76406dd217287eb9717380515c38ee5b044fe2fe3c6a325da8ad24f70bd523924cafb73a09e8410ab9faf5660a49d3de9503c8b01fc7eaf9fdfc77f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-usage-lang \
gnome-usage-lang-all \
locale-gnome-usage-ca \
locale-gnome-usage-cs \
locale-gnome-usage-da \
locale-gnome-usage-de \
locale-gnome-usage-el \
locale-gnome-usage-en-GB \
locale-gnome-usage-es \
locale-gnome-usage-eu \
locale-gnome-usage-fi \
locale-gnome-usage-fr \
locale-gnome-usage-fur \
locale-gnome-usage-gl \
locale-gnome-usage-he \
locale-gnome-usage-hr \
locale-gnome-usage-hu \
locale-gnome-usage-id \
locale-gnome-usage-it \
locale-gnome-usage-ja \
locale-gnome-usage-nb \
locale-gnome-usage-nl \
locale-gnome-usage-pl \
locale-gnome-usage-pt \
locale-gnome-usage-pt-BR \
locale-gnome-usage-ro \
locale-gnome-usage-ru \
locale-gnome-usage-sk \
locale-gnome-usage-sl \
locale-gnome-usage-sr \
locale-gnome-usage-sr@latin \
locale-gnome-usage-sv \
locale-gnome-usage-tr \
locale-gnome-usage-uk \
locale-gnome-usage-zh-CN \
locale-gnome-usage-zh-TW"

RDEPENDS:${PN} += "gnome-usage"

inherit rpm
