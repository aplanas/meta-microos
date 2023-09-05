SUMMARY = "Translations for package qmlkonsole"
DESCRIPTION = "Provides translations for the 'qmlkonsole' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "qmlkonsole-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "d75ac4aa5338a0cf0c649635dd3603e8a951611f0c208774948e2ce30a5179c64dc1ff509ea7070085b4ba9aaebd15800d33b4a6319df145bd8ced5265055286"
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
locale-qmlkonsole-gl \
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
