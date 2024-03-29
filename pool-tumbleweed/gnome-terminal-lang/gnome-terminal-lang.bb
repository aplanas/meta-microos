SUMMARY = "Translations for package gnome-terminal"
DESCRIPTION = "Provides translations for the 'gnome-terminal' package."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.48.2"

RPM_NAME = "gnome-terminal-lang-3.48.2-1.1.noarch.rpm"
RPM_HASH = "a4fb3e6fd3aab3c885223273c9cd5902ee0e4a044be47a82d291bda8c3e8fd33cd6ae457e92f2a0fd2686bf951d38249568f2e5f3cf92c9446a7111b93438ad7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-terminal-lang \
gnome-terminal-lang-all \
locale-gnome-terminal-ar \
locale-gnome-terminal-as \
locale-gnome-terminal-ast \
locale-gnome-terminal-az \
locale-gnome-terminal-be \
locale-gnome-terminal-be@latin \
locale-gnome-terminal-bg \
locale-gnome-terminal-bn \
locale-gnome-terminal-bn-IN \
locale-gnome-terminal-br \
locale-gnome-terminal-bs \
locale-gnome-terminal-ca \
locale-gnome-terminal-ca@valencia \
locale-gnome-terminal-cs \
locale-gnome-terminal-cy \
locale-gnome-terminal-da \
locale-gnome-terminal-de \
locale-gnome-terminal-dz \
locale-gnome-terminal-el \
locale-gnome-terminal-en-CA \
locale-gnome-terminal-en-GB \
locale-gnome-terminal-en@shaw \
locale-gnome-terminal-eo \
locale-gnome-terminal-es \
locale-gnome-terminal-et \
locale-gnome-terminal-eu \
locale-gnome-terminal-fa \
locale-gnome-terminal-fi \
locale-gnome-terminal-fr \
locale-gnome-terminal-fur \
locale-gnome-terminal-ga \
locale-gnome-terminal-gd \
locale-gnome-terminal-gl \
locale-gnome-terminal-gu \
locale-gnome-terminal-he \
locale-gnome-terminal-hi \
locale-gnome-terminal-hr \
locale-gnome-terminal-hu \
locale-gnome-terminal-id \
locale-gnome-terminal-is \
locale-gnome-terminal-it \
locale-gnome-terminal-ja \
locale-gnome-terminal-ka \
locale-gnome-terminal-kk \
locale-gnome-terminal-km \
locale-gnome-terminal-kn \
locale-gnome-terminal-ko \
locale-gnome-terminal-lt \
locale-gnome-terminal-lv \
locale-gnome-terminal-mai \
locale-gnome-terminal-mk \
locale-gnome-terminal-ml \
locale-gnome-terminal-mr \
locale-gnome-terminal-ms \
locale-gnome-terminal-nb \
locale-gnome-terminal-nds \
locale-gnome-terminal-ne \
locale-gnome-terminal-nl \
locale-gnome-terminal-nn \
locale-gnome-terminal-oc \
locale-gnome-terminal-or \
locale-gnome-terminal-pa \
locale-gnome-terminal-pl \
locale-gnome-terminal-pt \
locale-gnome-terminal-pt-BR \
locale-gnome-terminal-ro \
locale-gnome-terminal-ru \
locale-gnome-terminal-si \
locale-gnome-terminal-sk \
locale-gnome-terminal-sl \
locale-gnome-terminal-sq \
locale-gnome-terminal-sr \
locale-gnome-terminal-sr@latin \
locale-gnome-terminal-sv \
locale-gnome-terminal-ta \
locale-gnome-terminal-te \
locale-gnome-terminal-th \
locale-gnome-terminal-tr \
locale-gnome-terminal-ug \
locale-gnome-terminal-uk \
locale-gnome-terminal-vi \
locale-gnome-terminal-wa \
locale-gnome-terminal-zh-CN \
locale-gnome-terminal-zh-HK \
locale-gnome-terminal-zh-TW"

RDEPENDS:${PN} += "gnome-terminal"

inherit rpm
