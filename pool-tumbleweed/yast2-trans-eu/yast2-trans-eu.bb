SUMMARY = "YaST2 - Esperanto Translations"
DESCRIPTION = "YaST2 - Translations for Esperanto."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-eu-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "675a0784882ffae8d3da1dac2b94f1c2d9a49989d6f9c88741eba1422f043d9786917c60e4b4cdff70d2f67c2b4afe315f3a78edeb386d77adfc6f6ca0e31cc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-eu \
yast2-trans-eu"

RDEPENDS:${PN} += ""

inherit rpm
