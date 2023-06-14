SUMMARY = "Translations for package qmlkonsole"
DESCRIPTION = "Provides translations for the 'qmlkonsole' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "qmlkonsole-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "be332c83e1b537cb2fa2847a07b1a566956f03280235433878f5416f1f9bfaa7b4238bef348e2c30d1cd42975e262a73016eddad0d23a90c6071e63b15ea1709"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-qmlkonsole-ca \
locale-qmlkonsole-ca@valencia \
locale-qmlkonsole-cs \
locale-qmlkonsole-de \
locale-qmlkonsole-en-GB \
locale-qmlkonsole-es \
locale-qmlkonsole-eu \
locale-qmlkonsole-fi \
locale-qmlkonsole-fr \
locale-qmlkonsole-hi \
locale-qmlkonsole-hu \
locale-qmlkonsole-it \
locale-qmlkonsole-ja \
locale-qmlkonsole-ka \
locale-qmlkonsole-ko \
locale-qmlkonsole-lt \
locale-qmlkonsole-nl \
locale-qmlkonsole-nn \
locale-qmlkonsole-pa \
locale-qmlkonsole-pl \
locale-qmlkonsole-pt \
locale-qmlkonsole-pt-BR \
locale-qmlkonsole-ro \
locale-qmlkonsole-ru \
locale-qmlkonsole-sk \
locale-qmlkonsole-sl \
locale-qmlkonsole-sv \
locale-qmlkonsole-ta \
locale-qmlkonsole-tr \
locale-qmlkonsole-uk \
locale-qmlkonsole-zh-CN \
locale-qmlkonsole-zh-TW \
qmlkonsole-lang \
qmlkonsole-lang-all"

RDEPENDS:${PN} += "qmlkonsole"

inherit rpm
