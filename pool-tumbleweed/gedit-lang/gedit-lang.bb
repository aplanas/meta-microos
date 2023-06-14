SUMMARY = "Translations for package gedit"
DESCRIPTION = "Provides translations for the 'gedit' package."
LICENSE = "GPL-2.0-or-later"

PV = "44.2"

RPM_NAME = "gedit-lang-44.2-1.4.noarch.rpm"
RPM_HASH = "fdd7bb0cd477d6ffb40b7dbf2783689f1bc7054dd25e3c14b2ead772933f4a57a19294b259d94da426d3ba3e69540158cb0aeceef4613fc4e50514ec6c19ff03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gedit-lang \
gedit-lang-all \
locale-gedit-af \
locale-gedit-ar \
locale-gedit-as \
locale-gedit-ast \
locale-gedit-az \
locale-gedit-be \
locale-gedit-be@latin \
locale-gedit-bg \
locale-gedit-bn \
locale-gedit-bn-IN \
locale-gedit-br \
locale-gedit-bs \
locale-gedit-ca \
locale-gedit-ca@valencia \
locale-gedit-cs \
locale-gedit-cy \
locale-gedit-da \
locale-gedit-de \
locale-gedit-dz \
locale-gedit-el \
locale-gedit-en-CA \
locale-gedit-en-GB \
locale-gedit-en@shaw \
locale-gedit-eo \
locale-gedit-es \
locale-gedit-et \
locale-gedit-eu \
locale-gedit-fa \
locale-gedit-fi \
locale-gedit-fr \
locale-gedit-fur \
locale-gedit-ga \
locale-gedit-gd \
locale-gedit-gl \
locale-gedit-gu \
locale-gedit-he \
locale-gedit-hi \
locale-gedit-hr \
locale-gedit-hu \
locale-gedit-id \
locale-gedit-is \
locale-gedit-it \
locale-gedit-ja \
locale-gedit-ka \
locale-gedit-kk \
locale-gedit-km \
locale-gedit-kn \
locale-gedit-ko \
locale-gedit-lt \
locale-gedit-lv \
locale-gedit-mai \
locale-gedit-mk \
locale-gedit-ml \
locale-gedit-mr \
locale-gedit-ms \
locale-gedit-nb \
locale-gedit-nds \
locale-gedit-ne \
locale-gedit-nl \
locale-gedit-nn \
locale-gedit-oc \
locale-gedit-or \
locale-gedit-pa \
locale-gedit-pl \
locale-gedit-pt \
locale-gedit-pt-BR \
locale-gedit-ro \
locale-gedit-ru \
locale-gedit-si \
locale-gedit-sk \
locale-gedit-sl \
locale-gedit-sq \
locale-gedit-sr \
locale-gedit-sr@latin \
locale-gedit-sv \
locale-gedit-ta \
locale-gedit-te \
locale-gedit-th \
locale-gedit-tr \
locale-gedit-ug \
locale-gedit-uk \
locale-gedit-vi \
locale-gedit-wa \
locale-gedit-zh-CN \
locale-gedit-zh-HK \
locale-gedit-zh-TW"

RDEPENDS:${PN} += "gedit"

inherit rpm
