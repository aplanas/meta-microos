SUMMARY = "Translations for package minder"
DESCRIPTION = "Provides translations for the 'minder' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.14.0"

RPM_NAME = "minder-lang-1.14.0-1.9.noarch.rpm"
RPM_HASH = "62466b05d3a7ca7b5dc1876fe1a7cc510fee1feba5a5853f0814b97e3440520bd3a91f05822ba6c57a48b17d4b885980b76965803cf9c71f3dbfb69ab95af64a"
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
minder-lang \
minder-lang-all"

RDEPENDS:${PN} += "minder"

inherit rpm
