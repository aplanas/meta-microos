SUMMARY = "Translations for package kpmcore"
DESCRIPTION = "Provides translations for the 'kpmcore' package."
LICENSE = "GPL-3.0-only"

PV = "23.04.3"

RPM_NAME = "kpmcore-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "87376a0836c3ddf8c6953ad91adafdbf48dc7eb6a2a4f38b2743cdb4090f677a40e821e06d70802e8c7148684852e7c956448349ba27eb132f9b09e3c490db1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kpmcore-lang \
kpmcore-lang-all \
locale-kpmcore-ar \
locale-kpmcore-bg \
locale-kpmcore-bs \
locale-kpmcore-ca \
locale-kpmcore-ca@valencia \
locale-kpmcore-cs \
locale-kpmcore-da \
locale-kpmcore-de \
locale-kpmcore-el \
locale-kpmcore-en-GB \
locale-kpmcore-eo \
locale-kpmcore-es \
locale-kpmcore-et \
locale-kpmcore-eu \
locale-kpmcore-fi \
locale-kpmcore-fr \
locale-kpmcore-ga \
locale-kpmcore-gl \
locale-kpmcore-hr \
locale-kpmcore-hu \
locale-kpmcore-id \
locale-kpmcore-is \
locale-kpmcore-it \
locale-kpmcore-ja \
locale-kpmcore-ka \
locale-kpmcore-ko \
locale-kpmcore-lt \
locale-kpmcore-lv \
locale-kpmcore-mai \
locale-kpmcore-mr \
locale-kpmcore-nb \
locale-kpmcore-nds \
locale-kpmcore-nl \
locale-kpmcore-nn \
locale-kpmcore-pa \
locale-kpmcore-pl \
locale-kpmcore-pt \
locale-kpmcore-pt-BR \
locale-kpmcore-ro \
locale-kpmcore-ru \
locale-kpmcore-sk \
locale-kpmcore-sl \
locale-kpmcore-sr \
locale-kpmcore-sr@ijekavian \
locale-kpmcore-sr@ijekavianlatin \
locale-kpmcore-sr@latin \
locale-kpmcore-sv \
locale-kpmcore-th \
locale-kpmcore-tr \
locale-kpmcore-ug \
locale-kpmcore-uk \
locale-kpmcore-zh-CN \
locale-kpmcore-zh-TW"

RDEPENDS:${PN} += "kpmcore"

inherit rpm
