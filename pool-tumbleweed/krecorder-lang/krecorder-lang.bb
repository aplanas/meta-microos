SUMMARY = "Translations for package krecorder"
DESCRIPTION = "Provides translations for the 'krecorder' package."
LICENSE = "GPL-3.0-or-later"

PV = "23.08.0"

RPM_NAME = "krecorder-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "7f680c2c15cba78c338d85b68e9c4bb1e153efd19b7dadccbe43d36a56c9ac2aff7a4784b64b735144a46d360347d9cf0111741c8558670c9c0ebc160e8755d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "krecorder-lang \
krecorder-lang-all \
locale-krecorder-ar \
locale-krecorder-ca \
locale-krecorder-ca@valencia \
locale-krecorder-cs \
locale-krecorder-de \
locale-krecorder-el \
locale-krecorder-en-GB \
locale-krecorder-es \
locale-krecorder-eu \
locale-krecorder-fi \
locale-krecorder-fr \
locale-krecorder-gl \
locale-krecorder-it \
locale-krecorder-ja \
locale-krecorder-ka \
locale-krecorder-ko \
locale-krecorder-lt \
locale-krecorder-nl \
locale-krecorder-nn \
locale-krecorder-pa \
locale-krecorder-pl \
locale-krecorder-pt \
locale-krecorder-pt-BR \
locale-krecorder-ro \
locale-krecorder-ru \
locale-krecorder-sk \
locale-krecorder-sl \
locale-krecorder-sv \
locale-krecorder-tr \
locale-krecorder-uk \
locale-krecorder-zh-CN \
locale-krecorder-zh-TW"

RDEPENDS:${PN} += "krecorder"

inherit rpm
