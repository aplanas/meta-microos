SUMMARY = "Translations for package gnome-font-viewer"
DESCRIPTION = "Provides translations for the 'gnome-font-viewer' package."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-font-viewer-lang-44.0-1.1.noarch.rpm"
RPM_HASH = "de80f08454d290df5c8615c8ec3caf061afb3b7dca1f9b95e1a5d32ca891ff2e1544f0802627316c2f100a0731e70b34300fb1cc8ec3c97e3fe451bc04b74c5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-font-viewer-lang \
gnome-font-viewer-lang-all \
locale-gnome-font-viewer-af \
locale-gnome-font-viewer-ar \
locale-gnome-font-viewer-as \
locale-gnome-font-viewer-ast \
locale-gnome-font-viewer-az \
locale-gnome-font-viewer-be \
locale-gnome-font-viewer-be@latin \
locale-gnome-font-viewer-bg \
locale-gnome-font-viewer-bn \
locale-gnome-font-viewer-bn-IN \
locale-gnome-font-viewer-br \
locale-gnome-font-viewer-bs \
locale-gnome-font-viewer-ca \
locale-gnome-font-viewer-ca@valencia \
locale-gnome-font-viewer-cs \
locale-gnome-font-viewer-cy \
locale-gnome-font-viewer-da \
locale-gnome-font-viewer-de \
locale-gnome-font-viewer-dz \
locale-gnome-font-viewer-el \
locale-gnome-font-viewer-en-CA \
locale-gnome-font-viewer-en-GB \
locale-gnome-font-viewer-eo \
locale-gnome-font-viewer-es \
locale-gnome-font-viewer-et \
locale-gnome-font-viewer-eu \
locale-gnome-font-viewer-fa \
locale-gnome-font-viewer-fi \
locale-gnome-font-viewer-fr \
locale-gnome-font-viewer-fur \
locale-gnome-font-viewer-ga \
locale-gnome-font-viewer-gd \
locale-gnome-font-viewer-gl \
locale-gnome-font-viewer-gu \
locale-gnome-font-viewer-he \
locale-gnome-font-viewer-hi \
locale-gnome-font-viewer-hr \
locale-gnome-font-viewer-hu \
locale-gnome-font-viewer-id \
locale-gnome-font-viewer-is \
locale-gnome-font-viewer-it \
locale-gnome-font-viewer-ja \
locale-gnome-font-viewer-ka \
locale-gnome-font-viewer-kk \
locale-gnome-font-viewer-km \
locale-gnome-font-viewer-kn \
locale-gnome-font-viewer-ko \
locale-gnome-font-viewer-lt \
locale-gnome-font-viewer-lv \
locale-gnome-font-viewer-mai \
locale-gnome-font-viewer-mk \
locale-gnome-font-viewer-ml \
locale-gnome-font-viewer-mr \
locale-gnome-font-viewer-ms \
locale-gnome-font-viewer-nb \
locale-gnome-font-viewer-nds \
locale-gnome-font-viewer-ne \
locale-gnome-font-viewer-nl \
locale-gnome-font-viewer-nn \
locale-gnome-font-viewer-oc \
locale-gnome-font-viewer-or \
locale-gnome-font-viewer-pa \
locale-gnome-font-viewer-pl \
locale-gnome-font-viewer-pt \
locale-gnome-font-viewer-pt-BR \
locale-gnome-font-viewer-ro \
locale-gnome-font-viewer-ru \
locale-gnome-font-viewer-si \
locale-gnome-font-viewer-sk \
locale-gnome-font-viewer-sl \
locale-gnome-font-viewer-sq \
locale-gnome-font-viewer-sr \
locale-gnome-font-viewer-sr@latin \
locale-gnome-font-viewer-sv \
locale-gnome-font-viewer-ta \
locale-gnome-font-viewer-te \
locale-gnome-font-viewer-th \
locale-gnome-font-viewer-tr \
locale-gnome-font-viewer-ug \
locale-gnome-font-viewer-uk \
locale-gnome-font-viewer-vi \
locale-gnome-font-viewer-wa \
locale-gnome-font-viewer-zh-CN \
locale-gnome-font-viewer-zh-HK \
locale-gnome-font-viewer-zh-TW"

RDEPENDS:${PN} += "gnome-font-viewer"

inherit rpm
