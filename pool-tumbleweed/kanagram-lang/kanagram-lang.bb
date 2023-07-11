SUMMARY = "Translations for package kanagram"
DESCRIPTION = "Provides translations for the 'kanagram' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kanagram-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "abbf697e52f1ab38c8d17fd99066c35276942ab9f9ec367e3dacbd781c510d6bd5c419451f79abb7f89cc51059599ca8e9db35d297962ec55fe019be26855b8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kanagram-lang \
kanagram-lang-all \
locale-kanagram-ar \
locale-kanagram-be \
locale-kanagram-bg \
locale-kanagram-bn \
locale-kanagram-br \
locale-kanagram-bs \
locale-kanagram-ca \
locale-kanagram-ca@valencia \
locale-kanagram-cs \
locale-kanagram-cy \
locale-kanagram-da \
locale-kanagram-de \
locale-kanagram-el \
locale-kanagram-en-GB \
locale-kanagram-eo \
locale-kanagram-es \
locale-kanagram-et \
locale-kanagram-eu \
locale-kanagram-fa \
locale-kanagram-fi \
locale-kanagram-fr \
locale-kanagram-ga \
locale-kanagram-gl \
locale-kanagram-gu \
locale-kanagram-he \
locale-kanagram-hi \
locale-kanagram-hr \
locale-kanagram-hu \
locale-kanagram-id \
locale-kanagram-it \
locale-kanagram-ja \
locale-kanagram-ka \
locale-kanagram-kk \
locale-kanagram-km \
locale-kanagram-ko \
locale-kanagram-lt \
locale-kanagram-lv \
locale-kanagram-mk \
locale-kanagram-ml \
locale-kanagram-mr \
locale-kanagram-ms \
locale-kanagram-nb \
locale-kanagram-nds \
locale-kanagram-ne \
locale-kanagram-nl \
locale-kanagram-nn \
locale-kanagram-oc \
locale-kanagram-pa \
locale-kanagram-pl \
locale-kanagram-pt \
locale-kanagram-pt-BR \
locale-kanagram-ro \
locale-kanagram-ru \
locale-kanagram-si \
locale-kanagram-sk \
locale-kanagram-sl \
locale-kanagram-sq \
locale-kanagram-sv \
locale-kanagram-tr \
locale-kanagram-ug \
locale-kanagram-uk \
locale-kanagram-zh-CN \
locale-kanagram-zh-TW"

RDEPENDS:${PN} += "kanagram"

inherit rpm
