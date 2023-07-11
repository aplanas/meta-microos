SUMMARY = "Translations for package qmlkonsole"
DESCRIPTION = "Provides translations for the 'qmlkonsole' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "qmlkonsole-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "c513aa5a4f9c1fa8eead36b89aa8e0d1a901336c0e9a19fcf006119a14ca123ff08d08e07b7dd9decb28163180544b77566a49dd92f0b7ad0e17dcc8699eb487"
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
