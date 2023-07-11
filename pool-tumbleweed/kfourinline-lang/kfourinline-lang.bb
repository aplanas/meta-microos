SUMMARY = "Translations for package kfourinline"
DESCRIPTION = "Provides translations for the 'kfourinline' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kfourinline-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "f05c4a92cbe24db81d529c14c785f5b8bc604740c113bca130758445f4c52a75a75814f9cec613795da1ca4354f426333c9d31c5f09e0214f53a138af7b6a3d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kfourinline-lang \
kfourinline-lang-all \
locale-kfourinline-af \
locale-kfourinline-ar \
locale-kfourinline-be \
locale-kfourinline-bg \
locale-kfourinline-br \
locale-kfourinline-bs \
locale-kfourinline-ca \
locale-kfourinline-ca@valencia \
locale-kfourinline-cs \
locale-kfourinline-cy \
locale-kfourinline-da \
locale-kfourinline-de \
locale-kfourinline-el \
locale-kfourinline-en-GB \
locale-kfourinline-eo \
locale-kfourinline-es \
locale-kfourinline-et \
locale-kfourinline-eu \
locale-kfourinline-fa \
locale-kfourinline-fi \
locale-kfourinline-fr \
locale-kfourinline-ga \
locale-kfourinline-gl \
locale-kfourinline-he \
locale-kfourinline-hr \
locale-kfourinline-hu \
locale-kfourinline-id \
locale-kfourinline-is \
locale-kfourinline-it \
locale-kfourinline-ja \
locale-kfourinline-ka \
locale-kfourinline-kk \
locale-kfourinline-km \
locale-kfourinline-ko \
locale-kfourinline-lt \
locale-kfourinline-lv \
locale-kfourinline-mai \
locale-kfourinline-mk \
locale-kfourinline-ml \
locale-kfourinline-mr \
locale-kfourinline-nb \
locale-kfourinline-nds \
locale-kfourinline-ne \
locale-kfourinline-nl \
locale-kfourinline-nn \
locale-kfourinline-oc \
locale-kfourinline-pa \
locale-kfourinline-pl \
locale-kfourinline-pt \
locale-kfourinline-pt-BR \
locale-kfourinline-ro \
locale-kfourinline-ru \
locale-kfourinline-sk \
locale-kfourinline-sl \
locale-kfourinline-sr \
locale-kfourinline-sr@ijekavian \
locale-kfourinline-sr@ijekavianlatin \
locale-kfourinline-sr@latin \
locale-kfourinline-sv \
locale-kfourinline-ta \
locale-kfourinline-te \
locale-kfourinline-th \
locale-kfourinline-tr \
locale-kfourinline-ug \
locale-kfourinline-uk \
locale-kfourinline-zh-CN \
locale-kfourinline-zh-TW"

RDEPENDS:${PN} += "kfourinline"

inherit rpm
