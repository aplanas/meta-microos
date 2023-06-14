SUMMARY = "Translations for package gnome-control-center"
DESCRIPTION = "Provides translations for the 'gnome-control-center' package."
LICENSE = "GPL-2.0-or-later"

PV = "44.2"

RPM_NAME = "gnome-control-center-lang-44.2-1.1.noarch.rpm"
RPM_HASH = "2678e22a41ef1763b8986dde4718f9cc8ac649ad1d32dc1f3f47f5ef61bfd21fafdf847d66ca1866693dabac7e57573ff627ba74077606a3fbab752d80e98c91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-control-center-lang \
gnome-control-center-lang-all \
locale-gnome-control-center-af \
locale-gnome-control-center-ar \
locale-gnome-control-center-as \
locale-gnome-control-center-ast \
locale-gnome-control-center-az \
locale-gnome-control-center-be \
locale-gnome-control-center-be@latin \
locale-gnome-control-center-bg \
locale-gnome-control-center-bn \
locale-gnome-control-center-bn-IN \
locale-gnome-control-center-br \
locale-gnome-control-center-bs \
locale-gnome-control-center-ca \
locale-gnome-control-center-ca@valencia \
locale-gnome-control-center-cs \
locale-gnome-control-center-cy \
locale-gnome-control-center-da \
locale-gnome-control-center-de \
locale-gnome-control-center-dz \
locale-gnome-control-center-el \
locale-gnome-control-center-en-CA \
locale-gnome-control-center-en-GB \
locale-gnome-control-center-en@shaw \
locale-gnome-control-center-eo \
locale-gnome-control-center-es \
locale-gnome-control-center-et \
locale-gnome-control-center-eu \
locale-gnome-control-center-fa \
locale-gnome-control-center-fi \
locale-gnome-control-center-fr \
locale-gnome-control-center-fur \
locale-gnome-control-center-ga \
locale-gnome-control-center-gd \
locale-gnome-control-center-gl \
locale-gnome-control-center-gu \
locale-gnome-control-center-he \
locale-gnome-control-center-hi \
locale-gnome-control-center-hr \
locale-gnome-control-center-hu \
locale-gnome-control-center-id \
locale-gnome-control-center-is \
locale-gnome-control-center-it \
locale-gnome-control-center-ja \
locale-gnome-control-center-ka \
locale-gnome-control-center-kk \
locale-gnome-control-center-km \
locale-gnome-control-center-kn \
locale-gnome-control-center-ko \
locale-gnome-control-center-lt \
locale-gnome-control-center-lv \
locale-gnome-control-center-mai \
locale-gnome-control-center-mk \
locale-gnome-control-center-ml \
locale-gnome-control-center-mr \
locale-gnome-control-center-ms \
locale-gnome-control-center-nb \
locale-gnome-control-center-nds \
locale-gnome-control-center-ne \
locale-gnome-control-center-nl \
locale-gnome-control-center-nn \
locale-gnome-control-center-oc \
locale-gnome-control-center-or \
locale-gnome-control-center-pa \
locale-gnome-control-center-pl \
locale-gnome-control-center-pt \
locale-gnome-control-center-pt-BR \
locale-gnome-control-center-ro \
locale-gnome-control-center-ru \
locale-gnome-control-center-si \
locale-gnome-control-center-sk \
locale-gnome-control-center-sl \
locale-gnome-control-center-sq \
locale-gnome-control-center-sr \
locale-gnome-control-center-sr@latin \
locale-gnome-control-center-sv \
locale-gnome-control-center-ta \
locale-gnome-control-center-te \
locale-gnome-control-center-th \
locale-gnome-control-center-tr \
locale-gnome-control-center-ug \
locale-gnome-control-center-uk \
locale-gnome-control-center-vi \
locale-gnome-control-center-wa \
locale-gnome-control-center-zh-CN \
locale-gnome-control-center-zh-HK \
locale-gnome-control-center-zh-TW"

RDEPENDS:${PN} += "gnome-control-center"

inherit rpm
