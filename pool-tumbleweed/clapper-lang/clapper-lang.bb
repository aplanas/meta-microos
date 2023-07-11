SUMMARY = "Translations for package clapper"
DESCRIPTION = "Provides translations for the 'clapper' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.2"

RPM_NAME = "clapper-lang-0.5.2-1.4.noarch.rpm"
RPM_HASH = "310119901f3af5a6dda38c204a6478cbcc95a13ef8cbb70d4731f30cf300ba10c24c2517d7b3020e322a87cef4d09be58041492fc03f704950517c9e5e635de1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clapper-lang \
clapper-lang-all \
locale-clapper-ar \
locale-clapper-ca \
locale-clapper-cs \
locale-clapper-de \
locale-clapper-es \
locale-clapper-eu \
locale-clapper-fr \
locale-clapper-he \
locale-clapper-hu \
locale-clapper-it \
locale-clapper-ja \
locale-clapper-nl \
locale-clapper-pl \
locale-clapper-pt \
locale-clapper-pt-BR \
locale-clapper-ru \
locale-clapper-sv \
locale-clapper-tr \
locale-clapper-zh-CN"

RDEPENDS:${PN} += "clapper"

inherit rpm
