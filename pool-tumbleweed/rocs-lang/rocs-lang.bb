SUMMARY = "Translations for package rocs"
DESCRIPTION = "Provides translations for the 'rocs' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "rocs-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "3ca382508d196bf42fbb8c18f3ce2fcffff30b99dc0f4e8556762d3e9075f4c7c0fccaf976a2ab9d7e2c0d4a59826fef2d78bff2197e2c34fc5bfc45fffe2ae9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-rocs-ar \
locale-rocs-bg \
locale-rocs-bs \
locale-rocs-ca \
locale-rocs-ca@valencia \
locale-rocs-cs \
locale-rocs-da \
locale-rocs-de \
locale-rocs-el \
locale-rocs-en-GB \
locale-rocs-eo \
locale-rocs-es \
locale-rocs-et \
locale-rocs-fi \
locale-rocs-fr \
locale-rocs-ga \
locale-rocs-gl \
locale-rocs-hr \
locale-rocs-hu \
locale-rocs-it \
locale-rocs-ja \
locale-rocs-ka \
locale-rocs-kk \
locale-rocs-ko \
locale-rocs-lt \
locale-rocs-lv \
locale-rocs-ml \
locale-rocs-mr \
locale-rocs-nb \
locale-rocs-nds \
locale-rocs-nl \
locale-rocs-nn \
locale-rocs-pa \
locale-rocs-pl \
locale-rocs-pt \
locale-rocs-pt-BR \
locale-rocs-ro \
locale-rocs-ru \
locale-rocs-sk \
locale-rocs-sl \
locale-rocs-sv \
locale-rocs-th \
locale-rocs-tr \
locale-rocs-ug \
locale-rocs-uk \
locale-rocs-zh-CN \
locale-rocs-zh-TW \
rocs-lang \
rocs-lang-all"

RDEPENDS:${PN} += "rocs"

inherit rpm
