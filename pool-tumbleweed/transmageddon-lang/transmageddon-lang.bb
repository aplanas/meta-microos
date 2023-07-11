SUMMARY = "Translations for package transmageddon"
DESCRIPTION = "Provides translations for the 'transmageddon' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5"

RPM_NAME = "transmageddon-lang-1.5-5.7.noarch.rpm"
RPM_HASH = "cf593d663a3141328f9de5e9e86eab01e35542acc890827036a67f90c83a8ed32ac93991a1bf861579bf8091a1b2999fc397cfb498cd45b392b9c10c8c347183"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-transmageddon-ca \
locale-transmageddon-cs \
locale-transmageddon-da \
locale-transmageddon-de \
locale-transmageddon-el \
locale-transmageddon-en-GB \
locale-transmageddon-eo \
locale-transmageddon-es \
locale-transmageddon-fi \
locale-transmageddon-fr \
locale-transmageddon-gd \
locale-transmageddon-gl \
locale-transmageddon-he \
locale-transmageddon-hu \
locale-transmageddon-id \
locale-transmageddon-it \
locale-transmageddon-lt \
locale-transmageddon-lv \
locale-transmageddon-nb \
locale-transmageddon-pl \
locale-transmageddon-pt \
locale-transmageddon-pt-BR \
locale-transmageddon-ro \
locale-transmageddon-ru \
locale-transmageddon-sk \
locale-transmageddon-sl \
locale-transmageddon-sr \
locale-transmageddon-sr@latin \
locale-transmageddon-sv \
locale-transmageddon-th \
locale-transmageddon-tr \
locale-transmageddon-uk \
locale-transmageddon-zh-CN \
transmageddon-lang \
transmageddon-lang-all"

RDEPENDS:${PN} += "transmageddon"

inherit rpm
