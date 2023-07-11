SUMMARY = "Translations for package lxqt-about"
DESCRIPTION = "Provides translations for the 'lxqt-about' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-about-lang-1.3.0-1.2.noarch.rpm"
RPM_HASH = "7c67f79ba08b43f790221a5320b7bca664380e1112b3684070312111749986405dd20b3dacd9fede625a742aa53267c791b53e705af5135a45b5b6f7447508c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-about-lang \
lxqt-about-lang-all"

RDEPENDS:${PN} += "lxqt-about"

inherit rpm
