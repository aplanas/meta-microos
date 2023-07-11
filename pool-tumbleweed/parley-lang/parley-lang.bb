SUMMARY = "Translations for package parley"
DESCRIPTION = "Provides translations for the 'parley' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "parley-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "9c84462dc89abe99778cfbe74f172a2d4aabec92ba8345949fc4fc7a41fa9036d0436abea4f65d9e7b02af520a6873dd6c9242e1a273909eb58366e0bb4d0d9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-parley-af \
locale-parley-ar \
locale-parley-be \
locale-parley-bg \
locale-parley-bn \
locale-parley-br \
locale-parley-bs \
locale-parley-ca \
locale-parley-ca@valencia \
locale-parley-cs \
locale-parley-cy \
locale-parley-da \
locale-parley-de \
locale-parley-el \
locale-parley-en-GB \
locale-parley-eo \
locale-parley-es \
locale-parley-et \
locale-parley-eu \
locale-parley-fa \
locale-parley-fi \
locale-parley-fr \
locale-parley-ga \
locale-parley-gl \
locale-parley-he \
locale-parley-hi \
locale-parley-hr \
locale-parley-hu \
locale-parley-ia \
locale-parley-is \
locale-parley-it \
locale-parley-ja \
locale-parley-ka \
locale-parley-kk \
locale-parley-km \
locale-parley-lt \
locale-parley-lv \
locale-parley-mk \
locale-parley-ml \
locale-parley-mr \
locale-parley-ms \
locale-parley-nb \
locale-parley-nds \
locale-parley-ne \
locale-parley-nl \
locale-parley-nn \
locale-parley-oc \
locale-parley-pa \
locale-parley-pl \
locale-parley-pt \
locale-parley-pt-BR \
locale-parley-ro \
locale-parley-ru \
locale-parley-si \
locale-parley-sk \
locale-parley-sl \
locale-parley-sq \
locale-parley-sv \
locale-parley-ta \
locale-parley-tr \
locale-parley-ug \
locale-parley-uk \
locale-parley-zh-CN \
locale-parley-zh-TW \
parley-lang \
parley-lang-all"

RDEPENDS:${PN} += "parley"

inherit rpm
