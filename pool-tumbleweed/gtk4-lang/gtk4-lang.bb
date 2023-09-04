SUMMARY = "Translations for package gtk4"
DESCRIPTION = "Provides translations for the 'gtk4' package."
LICENSE = "LGPL-2.1-or-later"

PV = "4.12.0"

RPM_NAME = "gtk4-lang-4.12.0-2.1.noarch.rpm"
RPM_HASH = "b2a7de0883a17e04a32a1072ffe46bcc2fc24a0be45191e958565667f4498110489afb6918ea21b22997a7bd42d01bafb9f72cd1febca13b327300001f9884bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk4-lang \
gtk4-lang-all \
locale-gtk4-af \
locale-gtk4-ar \
locale-gtk4-as \
locale-gtk4-ast \
locale-gtk4-az \
locale-gtk4-be \
locale-gtk4-be@latin \
locale-gtk4-bg \
locale-gtk4-bn \
locale-gtk4-bn-IN \
locale-gtk4-br \
locale-gtk4-bs \
locale-gtk4-ca \
locale-gtk4-ca@valencia \
locale-gtk4-cs \
locale-gtk4-cy \
locale-gtk4-da \
locale-gtk4-de \
locale-gtk4-dz \
locale-gtk4-el \
locale-gtk4-eo \
locale-gtk4-es \
locale-gtk4-et \
locale-gtk4-eu \
locale-gtk4-fa \
locale-gtk4-fi \
locale-gtk4-fr \
locale-gtk4-fur \
locale-gtk4-ga \
locale-gtk4-gd \
locale-gtk4-gl \
locale-gtk4-gu \
locale-gtk4-he \
locale-gtk4-hi \
locale-gtk4-hr \
locale-gtk4-hu \
locale-gtk4-ia \
locale-gtk4-id \
locale-gtk4-is \
locale-gtk4-it \
locale-gtk4-ja \
locale-gtk4-ka \
locale-gtk4-kk \
locale-gtk4-km \
locale-gtk4-kn \
locale-gtk4-ko \
locale-gtk4-lt \
locale-gtk4-lv \
locale-gtk4-mai \
locale-gtk4-mk \
locale-gtk4-ml \
locale-gtk4-mr \
locale-gtk4-ms \
locale-gtk4-nb \
locale-gtk4-nds \
locale-gtk4-ne \
locale-gtk4-nl \
locale-gtk4-nn \
locale-gtk4-oc \
locale-gtk4-or \
locale-gtk4-pa \
locale-gtk4-pl \
locale-gtk4-pt \
locale-gtk4-pt-BR \
locale-gtk4-ro \
locale-gtk4-ru \
locale-gtk4-si \
locale-gtk4-sk \
locale-gtk4-sl \
locale-gtk4-sq \
locale-gtk4-sr \
locale-gtk4-sr@ije \
locale-gtk4-sr@latin \
locale-gtk4-sv \
locale-gtk4-ta \
locale-gtk4-te \
locale-gtk4-th \
locale-gtk4-tr \
locale-gtk4-ug \
locale-gtk4-uk \
locale-gtk4-vi \
locale-gtk4-wa \
locale-gtk4-zh-CN \
locale-gtk4-zh-HK \
locale-gtk4-zh-TW"

RDEPENDS:${PN} += "gtk4"

inherit rpm
