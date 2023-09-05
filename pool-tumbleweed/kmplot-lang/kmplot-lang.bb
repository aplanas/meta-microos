SUMMARY = "Translations for package kmplot"
DESCRIPTION = "Provides translations for the 'kmplot' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kmplot-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "53c41838223e64ad4bcf63556e3cbd264f3eecebbf22cb9e73c4434125c7a7371eb1808c6047e771bfd1bc0ab8a0e695f875b60226db045979bd39a5733c8f58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kmplot-lang \
kmplot-lang-all \
locale-kmplot-af \
locale-kmplot-ar \
locale-kmplot-be \
locale-kmplot-bg \
locale-kmplot-bn \
locale-kmplot-br \
locale-kmplot-bs \
locale-kmplot-ca \
locale-kmplot-ca@valencia \
locale-kmplot-cs \
locale-kmplot-cy \
locale-kmplot-da \
locale-kmplot-de \
locale-kmplot-el \
locale-kmplot-en-GB \
locale-kmplot-eo \
locale-kmplot-es \
locale-kmplot-et \
locale-kmplot-eu \
locale-kmplot-fa \
locale-kmplot-fi \
locale-kmplot-fr \
locale-kmplot-ga \
locale-kmplot-gl \
locale-kmplot-he \
locale-kmplot-hi \
locale-kmplot-hr \
locale-kmplot-hu \
locale-kmplot-is \
locale-kmplot-it \
locale-kmplot-ja \
locale-kmplot-ka \
locale-kmplot-kk \
locale-kmplot-km \
locale-kmplot-ko \
locale-kmplot-lt \
locale-kmplot-lv \
locale-kmplot-mai \
locale-kmplot-mk \
locale-kmplot-ml \
locale-kmplot-mr \
locale-kmplot-ms \
locale-kmplot-nb \
locale-kmplot-nds \
locale-kmplot-ne \
locale-kmplot-nl \
locale-kmplot-nn \
locale-kmplot-oc \
locale-kmplot-pa \
locale-kmplot-pl \
locale-kmplot-pt \
locale-kmplot-pt-BR \
locale-kmplot-ro \
locale-kmplot-ru \
locale-kmplot-si \
locale-kmplot-sk \
locale-kmplot-sl \
locale-kmplot-sq \
locale-kmplot-sv \
locale-kmplot-ta \
locale-kmplot-tr \
locale-kmplot-ug \
locale-kmplot-uk \
locale-kmplot-vi \
locale-kmplot-zh-CN \
locale-kmplot-zh-TW"

RDEPENDS:${PN} += "kmplot"

inherit rpm
