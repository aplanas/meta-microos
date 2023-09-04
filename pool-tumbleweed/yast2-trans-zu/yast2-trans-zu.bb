SUMMARY = "YaST2 - Zulu Translations"
DESCRIPTION = "YaST2 - Translations for Zulu."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-zu-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "ee163dde1d877659f3ccd0341aecd925243e34c9e854e864998c12b27b802c1921eebbf81ab8c5eaf3254487d0667d626f7c9dc655dfa84969056b7e9961e224"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-zu \
yast2-trans-zu"

RDEPENDS:${PN} += ""

inherit rpm
