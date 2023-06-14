SUMMARY = "YaST2 - Bengali Translations"
DESCRIPTION = "YaST2 - Translations for Bengali."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-bn-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "2d5b9c444f2f360cc4c93d5bb71f560d7b9895e720e44dd0c5aaa594fc40f7759612095ec768c188b6673e8f1b22924317ece790179250752f7f00e873e411d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-bn \
yast2-trans-bn"

RDEPENDS:${PN} += ""

inherit rpm
