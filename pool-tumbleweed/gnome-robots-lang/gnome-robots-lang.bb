SUMMARY = "Translations for package gnome-robots"
DESCRIPTION = "Provides translations for the 'gnome-robots' package."
LICENSE = "GPL-3.0-or-later"

PV = "40.0"

RPM_NAME = "gnome-robots-lang-40.0-1.12.noarch.rpm"
RPM_HASH = "1cdb008d95c3b7c356f6c583b9fb9de1f201bf31196f901fa01f7fcfe6b53c8763dac8a9c7e057f24473633b27931e3a42cb3a184a2b7ebfa1bc205a1e97f400"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-robots-lang \
gnome-robots-lang-all \
locale-gnome-robots-af \
locale-gnome-robots-ar \
locale-gnome-robots-as \
locale-gnome-robots-ast \
locale-gnome-robots-az \
locale-gnome-robots-be \
locale-gnome-robots-bg \
locale-gnome-robots-bn \
locale-gnome-robots-bn-IN \
locale-gnome-robots-br \
locale-gnome-robots-bs \
locale-gnome-robots-ca \
locale-gnome-robots-ca@valencia \
locale-gnome-robots-cs \
locale-gnome-robots-cy \
locale-gnome-robots-da \
locale-gnome-robots-de \
locale-gnome-robots-dz \
locale-gnome-robots-el \
locale-gnome-robots-en-CA \
locale-gnome-robots-en-GB \
locale-gnome-robots-en@shaw \
locale-gnome-robots-eo \
locale-gnome-robots-es \
locale-gnome-robots-et \
locale-gnome-robots-eu \
locale-gnome-robots-fa \
locale-gnome-robots-fi \
locale-gnome-robots-fr \
locale-gnome-robots-fur \
locale-gnome-robots-ga \
locale-gnome-robots-gl \
locale-gnome-robots-gu \
locale-gnome-robots-he \
locale-gnome-robots-hi \
locale-gnome-robots-hr \
locale-gnome-robots-hu \
locale-gnome-robots-id \
locale-gnome-robots-is \
locale-gnome-robots-it \
locale-gnome-robots-ja \
locale-gnome-robots-ka \
locale-gnome-robots-kk \
locale-gnome-robots-km \
locale-gnome-robots-kn \
locale-gnome-robots-ko \
locale-gnome-robots-lt \
locale-gnome-robots-lv \
locale-gnome-robots-mai \
locale-gnome-robots-mk \
locale-gnome-robots-ml \
locale-gnome-robots-mr \
locale-gnome-robots-ms \
locale-gnome-robots-nb \
locale-gnome-robots-ne \
locale-gnome-robots-nl \
locale-gnome-robots-nn \
locale-gnome-robots-oc \
locale-gnome-robots-or \
locale-gnome-robots-pa \
locale-gnome-robots-pl \
locale-gnome-robots-pt \
locale-gnome-robots-pt-BR \
locale-gnome-robots-ro \
locale-gnome-robots-ru \
locale-gnome-robots-si \
locale-gnome-robots-sk \
locale-gnome-robots-sl \
locale-gnome-robots-sq \
locale-gnome-robots-sr \
locale-gnome-robots-sr@latin \
locale-gnome-robots-sv \
locale-gnome-robots-ta \
locale-gnome-robots-te \
locale-gnome-robots-th \
locale-gnome-robots-tr \
locale-gnome-robots-ug \
locale-gnome-robots-uk \
locale-gnome-robots-vi \
locale-gnome-robots-wa \
locale-gnome-robots-zh-CN \
locale-gnome-robots-zh-HK \
locale-gnome-robots-zh-TW"

RDEPENDS:${PN} += "gnome-robots"

inherit rpm
