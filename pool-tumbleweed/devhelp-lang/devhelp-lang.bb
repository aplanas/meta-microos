SUMMARY = "Translations for package devhelp"
DESCRIPTION = "Provides translations for the 'devhelp' package."
LICENSE = "GPL-3.0-or-later"

PV = "43.0"

RPM_NAME = "devhelp-lang-43.0-2.2.noarch.rpm"
RPM_HASH = "fd4ca777606e7a2a5fe4c4b92cbd25e155e8d03d183eaa12271e0937d8241f601d9a543a96470586f4eb3052665e12c2937d34f41c8e54aca326bb69e83074a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "devhelp-lang \
devhelp-lang-all \
locale-devhelp-ar \
locale-devhelp-as \
locale-devhelp-ast \
locale-devhelp-az \
locale-devhelp-be \
locale-devhelp-be@latin \
locale-devhelp-bg \
locale-devhelp-bn \
locale-devhelp-bn-IN \
locale-devhelp-bs \
locale-devhelp-ca \
locale-devhelp-ca@valencia \
locale-devhelp-cs \
locale-devhelp-da \
locale-devhelp-de \
locale-devhelp-dz \
locale-devhelp-el \
locale-devhelp-en-CA \
locale-devhelp-en-GB \
locale-devhelp-en@shaw \
locale-devhelp-eo \
locale-devhelp-es \
locale-devhelp-et \
locale-devhelp-eu \
locale-devhelp-fa \
locale-devhelp-fi \
locale-devhelp-fr \
locale-devhelp-fur \
locale-devhelp-gl \
locale-devhelp-gu \
locale-devhelp-he \
locale-devhelp-hi \
locale-devhelp-hr \
locale-devhelp-hu \
locale-devhelp-id \
locale-devhelp-is \
locale-devhelp-it \
locale-devhelp-ja \
locale-devhelp-ka \
locale-devhelp-kk \
locale-devhelp-km \
locale-devhelp-kn \
locale-devhelp-ko \
locale-devhelp-lt \
locale-devhelp-lv \
locale-devhelp-mai \
locale-devhelp-mk \
locale-devhelp-ml \
locale-devhelp-ms \
locale-devhelp-nb \
locale-devhelp-ne \
locale-devhelp-nl \
locale-devhelp-nn \
locale-devhelp-oc \
locale-devhelp-or \
locale-devhelp-pa \
locale-devhelp-pl \
locale-devhelp-pt \
locale-devhelp-pt-BR \
locale-devhelp-ro \
locale-devhelp-ru \
locale-devhelp-si \
locale-devhelp-sk \
locale-devhelp-sl \
locale-devhelp-sq \
locale-devhelp-sr \
locale-devhelp-sr@latin \
locale-devhelp-sv \
locale-devhelp-ta \
locale-devhelp-te \
locale-devhelp-th \
locale-devhelp-tr \
locale-devhelp-ug \
locale-devhelp-uk \
locale-devhelp-vi \
locale-devhelp-zh-CN \
locale-devhelp-zh-HK \
locale-devhelp-zh-TW"

RDEPENDS:${PN} += "devhelp"

inherit rpm
