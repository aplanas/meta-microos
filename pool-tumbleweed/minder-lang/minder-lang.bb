SUMMARY = "Translations for package minder"
DESCRIPTION = "Provides translations for the 'minder' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.15.2"

RPM_NAME = "minder-lang-1.15.2-1.1.noarch.rpm"
RPM_HASH = "7650dc47a11c404d56fafe4cb4ec6e854347609354cb5f912ac154a852a05caf16a5ec91d963c24539b973cb606ff47f49dfc5276b7f673f19276f2a3a19d4c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-minder-cs \
locale-minder-de \
locale-minder-es \
locale-minder-fr \
locale-minder-it \
locale-minder-nl \
locale-minder-pl \
locale-minder-pt \
locale-minder-pt-BR \
locale-minder-ru \
locale-minder-zh-CN \
minder-lang \
minder-lang-all"

RDEPENDS:${PN} += "minder"

inherit rpm
