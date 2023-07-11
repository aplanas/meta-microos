SUMMARY = "Translations for package gnome-calculator"
DESCRIPTION = "Provides translations for the 'gnome-calculator' package."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-calculator-lang-44.0-1.2.noarch.rpm"
RPM_HASH = "dc65a4ea916b673fe5c6c652023b2b9a2fed0fde105fc32588956e34383619fde745f7a24c00b09417316d196ea9a6f1f71d1d9d54064346efb87b2df8fadd8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-calculator-lang \
gnome-calculator-lang-all \
locale-gnome-calculator-af \
locale-gnome-calculator-ar \
locale-gnome-calculator-as \
locale-gnome-calculator-ast \
locale-gnome-calculator-az \
locale-gnome-calculator-be \
locale-gnome-calculator-be@latin \
locale-gnome-calculator-bg \
locale-gnome-calculator-bn \
locale-gnome-calculator-bn-IN \
locale-gnome-calculator-bs \
locale-gnome-calculator-ca \
locale-gnome-calculator-ca@valencia \
locale-gnome-calculator-cs \
locale-gnome-calculator-cy \
locale-gnome-calculator-da \
locale-gnome-calculator-de \
locale-gnome-calculator-dz \
locale-gnome-calculator-el \
locale-gnome-calculator-en-CA \
locale-gnome-calculator-en-GB \
locale-gnome-calculator-en@shaw \
locale-gnome-calculator-eo \
locale-gnome-calculator-es \
locale-gnome-calculator-et \
locale-gnome-calculator-eu \
locale-gnome-calculator-fa \
locale-gnome-calculator-fi \
locale-gnome-calculator-fr \
locale-gnome-calculator-fur \
locale-gnome-calculator-ga \
locale-gnome-calculator-gd \
locale-gnome-calculator-gl \
locale-gnome-calculator-gu \
locale-gnome-calculator-he \
locale-gnome-calculator-hi \
locale-gnome-calculator-hr \
locale-gnome-calculator-hu \
locale-gnome-calculator-id \
locale-gnome-calculator-it \
locale-gnome-calculator-ja \
locale-gnome-calculator-ka \
locale-gnome-calculator-kk \
locale-gnome-calculator-km \
locale-gnome-calculator-kn \
locale-gnome-calculator-ko \
locale-gnome-calculator-lt \
locale-gnome-calculator-lv \
locale-gnome-calculator-mai \
locale-gnome-calculator-mk \
locale-gnome-calculator-ml \
locale-gnome-calculator-mr \
locale-gnome-calculator-ms \
locale-gnome-calculator-nb \
locale-gnome-calculator-ne \
locale-gnome-calculator-nl \
locale-gnome-calculator-nn \
locale-gnome-calculator-oc \
locale-gnome-calculator-or \
locale-gnome-calculator-pa \
locale-gnome-calculator-pl \
locale-gnome-calculator-pt \
locale-gnome-calculator-pt-BR \
locale-gnome-calculator-ro \
locale-gnome-calculator-ru \
locale-gnome-calculator-si \
locale-gnome-calculator-sk \
locale-gnome-calculator-sl \
locale-gnome-calculator-sq \
locale-gnome-calculator-sr \
locale-gnome-calculator-sr@latin \
locale-gnome-calculator-sv \
locale-gnome-calculator-ta \
locale-gnome-calculator-te \
locale-gnome-calculator-th \
locale-gnome-calculator-tr \
locale-gnome-calculator-ug \
locale-gnome-calculator-uk \
locale-gnome-calculator-vi \
locale-gnome-calculator-zh-CN \
locale-gnome-calculator-zh-HK \
locale-gnome-calculator-zh-TW"

RDEPENDS:${PN} += "gnome-calculator"

inherit rpm
