SUMMARY = "Translations for package gnome-settings-daemon"
DESCRIPTION = "Provides translations for the 'gnome-settings-daemon' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "44.1"

RPM_NAME = "gnome-settings-daemon-lang-44.1-1.1.noarch.rpm"
RPM_HASH = "d54aef660db1e518aec60177814abb368b4c9b300217d0a0ad4bed2bbf4bbfa55648ffebb17c48bd8db446ee953e9e896d20c51e2950f71af2f8c6493972876d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-settings-daemon-lang \
gnome-settings-daemon-lang-all \
locale-gnome-settings-daemon-af \
locale-gnome-settings-daemon-ar \
locale-gnome-settings-daemon-as \
locale-gnome-settings-daemon-ast \
locale-gnome-settings-daemon-az \
locale-gnome-settings-daemon-be \
locale-gnome-settings-daemon-be@latin \
locale-gnome-settings-daemon-bg \
locale-gnome-settings-daemon-bn \
locale-gnome-settings-daemon-bn-IN \
locale-gnome-settings-daemon-br \
locale-gnome-settings-daemon-bs \
locale-gnome-settings-daemon-ca \
locale-gnome-settings-daemon-ca@valencia \
locale-gnome-settings-daemon-cs \
locale-gnome-settings-daemon-cy \
locale-gnome-settings-daemon-da \
locale-gnome-settings-daemon-de \
locale-gnome-settings-daemon-dz \
locale-gnome-settings-daemon-el \
locale-gnome-settings-daemon-en-CA \
locale-gnome-settings-daemon-en-GB \
locale-gnome-settings-daemon-en@shaw \
locale-gnome-settings-daemon-eo \
locale-gnome-settings-daemon-es \
locale-gnome-settings-daemon-et \
locale-gnome-settings-daemon-eu \
locale-gnome-settings-daemon-fa \
locale-gnome-settings-daemon-fi \
locale-gnome-settings-daemon-fr \
locale-gnome-settings-daemon-fur \
locale-gnome-settings-daemon-ga \
locale-gnome-settings-daemon-gd \
locale-gnome-settings-daemon-gl \
locale-gnome-settings-daemon-gu \
locale-gnome-settings-daemon-he \
locale-gnome-settings-daemon-hi \
locale-gnome-settings-daemon-hr \
locale-gnome-settings-daemon-hu \
locale-gnome-settings-daemon-id \
locale-gnome-settings-daemon-is \
locale-gnome-settings-daemon-it \
locale-gnome-settings-daemon-ja \
locale-gnome-settings-daemon-ka \
locale-gnome-settings-daemon-kk \
locale-gnome-settings-daemon-km \
locale-gnome-settings-daemon-kn \
locale-gnome-settings-daemon-ko \
locale-gnome-settings-daemon-lt \
locale-gnome-settings-daemon-lv \
locale-gnome-settings-daemon-mai \
locale-gnome-settings-daemon-mk \
locale-gnome-settings-daemon-ml \
locale-gnome-settings-daemon-mr \
locale-gnome-settings-daemon-ms \
locale-gnome-settings-daemon-nb \
locale-gnome-settings-daemon-nds \
locale-gnome-settings-daemon-ne \
locale-gnome-settings-daemon-nl \
locale-gnome-settings-daemon-nn \
locale-gnome-settings-daemon-oc \
locale-gnome-settings-daemon-or \
locale-gnome-settings-daemon-pa \
locale-gnome-settings-daemon-pl \
locale-gnome-settings-daemon-pt \
locale-gnome-settings-daemon-pt-BR \
locale-gnome-settings-daemon-ro \
locale-gnome-settings-daemon-ru \
locale-gnome-settings-daemon-si \
locale-gnome-settings-daemon-sk \
locale-gnome-settings-daemon-sl \
locale-gnome-settings-daemon-sq \
locale-gnome-settings-daemon-sr \
locale-gnome-settings-daemon-sr@latin \
locale-gnome-settings-daemon-sv \
locale-gnome-settings-daemon-ta \
locale-gnome-settings-daemon-te \
locale-gnome-settings-daemon-th \
locale-gnome-settings-daemon-tr \
locale-gnome-settings-daemon-ug \
locale-gnome-settings-daemon-uk \
locale-gnome-settings-daemon-vi \
locale-gnome-settings-daemon-wa \
locale-gnome-settings-daemon-zh-CN \
locale-gnome-settings-daemon-zh-HK \
locale-gnome-settings-daemon-zh-TW"

RDEPENDS:${PN} += "gnome-settings-daemon"

inherit rpm
