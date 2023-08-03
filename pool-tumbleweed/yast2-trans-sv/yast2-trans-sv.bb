SUMMARY = "YaST2 - Swedish Translations"
DESCRIPTION = "YaST2 - Translations for Swedish."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-sv-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "7a297fb699ec4905b759ecb3028205be95c0bfc4333e20ad8a1fbb465911be3c9f7eea029f49ac57c15fc5116451b778c35506a39e614d6bc2806759a2e18175"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sv \
yast2-trans-sv"

RDEPENDS:${PN} += ""

inherit rpm
