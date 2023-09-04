SUMMARY = "Translations for package kjs-devel"
DESCRIPTION = "Provides translations for the 'kjs-devel' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kjs-devel-lang-5.109.0-1.1.noarch.rpm"
RPM_HASH = "c35cbbe0d95c4bc784d1906e54b48d8f8fa5662bd60c82df32b8df5d0b3b59aff531f285b7426bc00cd8c75c1540f76c48b8f6339e11244de3df3e650b44c60c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kjs-devel-lang \
kjs-devel-lang-all"

RDEPENDS:${PN} += "kjs-devel"

inherit rpm
