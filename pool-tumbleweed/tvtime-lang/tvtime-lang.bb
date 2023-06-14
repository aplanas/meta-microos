SUMMARY = "Translations for package tvtime"
DESCRIPTION = "Provides translations for the 'tvtime' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.11"

RPM_NAME = "tvtime-lang-1.0.11-2.17.noarch.rpm"
RPM_HASH = "6deb3d438097277e7f4faaee79decbc97327d221c488a41fb639c046164c147c5edb973f534bbe96f115ec7cc94ba5bcd628a44d00de5206d50bc54deb5a97db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tvtime-ca \
locale-tvtime-cs \
locale-tvtime-de \
locale-tvtime-es \
locale-tvtime-fi \
locale-tvtime-fr \
locale-tvtime-hu \
locale-tvtime-ko \
locale-tvtime-lv \
locale-tvtime-nl \
locale-tvtime-nn \
locale-tvtime-pl \
locale-tvtime-pt \
locale-tvtime-pt-BR \
locale-tvtime-ru \
locale-tvtime-sk \
locale-tvtime-sv \
locale-tvtime-uk \
tvtime-lang \
tvtime-lang-all"

RDEPENDS:${PN} += "tvtime"

inherit rpm
