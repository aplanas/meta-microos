SUMMARY = "Translations for package calindori"
DESCRIPTION = "Provides translations for the 'calindori' package."
LICENSE = "GPL-3.0-or-later"

PV = "23.08.0"

RPM_NAME = "calindori-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "5f1365eb2aa4a945e3716ac9560cd1a430096432e5535a78ee132e7ba942a2c13c5a99f58f4e9629dfc4642942e1d5c82c8c5a2eed057def8e4ee39704fd2c41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "calindori-lang \
calindori-lang-all \
locale-calindori-ca \
locale-calindori-ca@valencia \
locale-calindori-cs \
locale-calindori-da \
locale-calindori-de \
locale-calindori-el \
locale-calindori-en-GB \
locale-calindori-eo \
locale-calindori-es \
locale-calindori-et \
locale-calindori-eu \
locale-calindori-fi \
locale-calindori-fr \
locale-calindori-gl \
locale-calindori-ia \
locale-calindori-it \
locale-calindori-ja \
locale-calindori-ka \
locale-calindori-ko \
locale-calindori-lt \
locale-calindori-nl \
locale-calindori-nn \
locale-calindori-pa \
locale-calindori-pl \
locale-calindori-pt \
locale-calindori-pt-BR \
locale-calindori-ru \
locale-calindori-sk \
locale-calindori-sl \
locale-calindori-sv \
locale-calindori-tr \
locale-calindori-uk \
locale-calindori-zh-CN \
locale-calindori-zh-TW"

RDEPENDS:${PN} += "calindori"

inherit rpm
