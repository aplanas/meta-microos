SUMMARY = "Translations for package rocs"
DESCRIPTION = "Provides translations for the 'rocs' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "rocs-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "86ed4279a923a1b4359f8f2c17322081a95de34bfd50a71001633450aaf937e5bd438cbc7d4d9e81701821b8f73aef1a8396eb20d17892d6c231e666a9af253b"
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
