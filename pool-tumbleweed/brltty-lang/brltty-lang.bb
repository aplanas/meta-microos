SUMMARY = "Translations for package brltty"
DESCRIPTION = "Provides translations for the 'brltty' package."
LICENSE = "LGPL-2.1-or-later"

PV = "6.5"

RPM_NAME = "brltty-lang-6.5-3.1.noarch.rpm"
RPM_HASH = "a3c9ad86e1b65e5b77cdc055391744ec2973e1535cbdeea9f278041aaed79348edff5a75a7f75e489f47babe0e5f112c85c9f2ceca50f617eb8b165ac1045d16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "brltty-lang \
brltty-lang-all \
locale-brltty-ar \
locale-brltty-de \
locale-brltty-fr \
locale-brltty-it \
locale-brltty-ru \
locale-brltty-zh"

RDEPENDS:${PN} += "brltty"

inherit rpm
