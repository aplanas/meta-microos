SUMMARY = "Translations for package kjournald"
DESCRIPTION = "Provides translations for the 'kjournald' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "kjournald-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "c0fca1ed7ce80c641ea87378a9eea75a1ee34ff27507f7d5de01c403957db6032ee4a22fdc16d2db4017ef54c67150930e1ecd271d8b3919c64547f8dd5d0626"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kjournald-lang \
kjournald-lang-all \
locale-kjournald-ca \
locale-kjournald-ca@valencia \
locale-kjournald-cs \
locale-kjournald-de \
locale-kjournald-en-GB \
locale-kjournald-es \
locale-kjournald-eu \
locale-kjournald-fi \
locale-kjournald-fr \
locale-kjournald-gl \
locale-kjournald-it \
locale-kjournald-ja \
locale-kjournald-ka \
locale-kjournald-ko \
locale-kjournald-lt \
locale-kjournald-nl \
locale-kjournald-pl \
locale-kjournald-pt \
locale-kjournald-ru \
locale-kjournald-sk \
locale-kjournald-sl \
locale-kjournald-sv \
locale-kjournald-tr \
locale-kjournald-uk \
locale-kjournald-zh-CN \
locale-kjournald-zh-TW"

RDEPENDS:${PN} += "kjournald"

inherit rpm
