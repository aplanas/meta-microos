SUMMARY = "Translations for package gnome-dictionary"
DESCRIPTION = "Provides translations for the 'gnome-dictionary' package."
LICENSE = "GPL-2.0-or-later"

PV = "40.0"

RPM_NAME = "gnome-dictionary-lang-40.0-3.7.noarch.rpm"
RPM_HASH = "fb0a00c59132b9a681c0ead9a4a30517939af1438eff56a7b64a3b4befa65f9184a0eff24160fd872e41ad0816ed0ebfa1244ba8971467ad7a68a28816ef1537"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-dictionary-lang \
gnome-dictionary-lang-all \
locale-gnome-dictionary-af \
locale-gnome-dictionary-ar \
locale-gnome-dictionary-as \
locale-gnome-dictionary-ast \
locale-gnome-dictionary-az \
locale-gnome-dictionary-be \
locale-gnome-dictionary-be@latin \
locale-gnome-dictionary-bg \
locale-gnome-dictionary-bn \
locale-gnome-dictionary-bn-IN \
locale-gnome-dictionary-br \
locale-gnome-dictionary-bs \
locale-gnome-dictionary-ca \
locale-gnome-dictionary-ca@valencia \
locale-gnome-dictionary-cs \
locale-gnome-dictionary-cy \
locale-gnome-dictionary-da \
locale-gnome-dictionary-de \
locale-gnome-dictionary-dz \
locale-gnome-dictionary-el \
locale-gnome-dictionary-en-CA \
locale-gnome-dictionary-en-GB \
locale-gnome-dictionary-en@shaw \
locale-gnome-dictionary-eo \
locale-gnome-dictionary-es \
locale-gnome-dictionary-et \
locale-gnome-dictionary-eu \
locale-gnome-dictionary-fa \
locale-gnome-dictionary-fi \
locale-gnome-dictionary-fr \
locale-gnome-dictionary-fur \
locale-gnome-dictionary-ga \
locale-gnome-dictionary-gd \
locale-gnome-dictionary-gl \
locale-gnome-dictionary-gu \
locale-gnome-dictionary-he \
locale-gnome-dictionary-hi \
locale-gnome-dictionary-hr \
locale-gnome-dictionary-hu \
locale-gnome-dictionary-id \
locale-gnome-dictionary-is \
locale-gnome-dictionary-it \
locale-gnome-dictionary-ja \
locale-gnome-dictionary-ka \
locale-gnome-dictionary-kk \
locale-gnome-dictionary-km \
locale-gnome-dictionary-kn \
locale-gnome-dictionary-ko \
locale-gnome-dictionary-lt \
locale-gnome-dictionary-lv \
locale-gnome-dictionary-mai \
locale-gnome-dictionary-mk \
locale-gnome-dictionary-ml \
locale-gnome-dictionary-mr \
locale-gnome-dictionary-ms \
locale-gnome-dictionary-nb \
locale-gnome-dictionary-nds \
locale-gnome-dictionary-ne \
locale-gnome-dictionary-nl \
locale-gnome-dictionary-nn \
locale-gnome-dictionary-oc \
locale-gnome-dictionary-or \
locale-gnome-dictionary-pa \
locale-gnome-dictionary-pl \
locale-gnome-dictionary-pt \
locale-gnome-dictionary-pt-BR \
locale-gnome-dictionary-ro \
locale-gnome-dictionary-ru \
locale-gnome-dictionary-si \
locale-gnome-dictionary-sk \
locale-gnome-dictionary-sl \
locale-gnome-dictionary-sq \
locale-gnome-dictionary-sr \
locale-gnome-dictionary-sr@latin \
locale-gnome-dictionary-sv \
locale-gnome-dictionary-ta \
locale-gnome-dictionary-te \
locale-gnome-dictionary-th \
locale-gnome-dictionary-tr \
locale-gnome-dictionary-ug \
locale-gnome-dictionary-uk \
locale-gnome-dictionary-vi \
locale-gnome-dictionary-wa \
locale-gnome-dictionary-zh-CN \
locale-gnome-dictionary-zh-HK \
locale-gnome-dictionary-zh-TW"

RDEPENDS:${PN} += "gnome-dictionary"

inherit rpm
