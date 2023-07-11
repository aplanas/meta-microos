SUMMARY = "Translations for package kalk"
DESCRIPTION = "Provides translations for the 'kalk' package."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.3"

RPM_NAME = "kalk-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "7504d94e9ce322f76451cae74b2158cd2f4d65ec0b7fa392b7f4a019258547a7384abe13658137754fa3e9b33725c590174ee27554b253f53235696b9191c784"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kalk-lang \
kalk-lang-all \
locale-kalk-ar \
locale-kalk-az \
locale-kalk-ca \
locale-kalk-ca@valencia \
locale-kalk-cs \
locale-kalk-de \
locale-kalk-el \
locale-kalk-en-GB \
locale-kalk-es \
locale-kalk-eu \
locale-kalk-fi \
locale-kalk-fr \
locale-kalk-gl \
locale-kalk-hi \
locale-kalk-hu \
locale-kalk-it \
locale-kalk-ja \
locale-kalk-ka \
locale-kalk-ko \
locale-kalk-lt \
locale-kalk-nl \
locale-kalk-nn \
locale-kalk-pa \
locale-kalk-pl \
locale-kalk-pt \
locale-kalk-pt-BR \
locale-kalk-ru \
locale-kalk-sk \
locale-kalk-sl \
locale-kalk-sv \
locale-kalk-tr \
locale-kalk-uk \
locale-kalk-zh-CN \
locale-kalk-zh-TW"

RDEPENDS:${PN} += "kalk"

inherit rpm
