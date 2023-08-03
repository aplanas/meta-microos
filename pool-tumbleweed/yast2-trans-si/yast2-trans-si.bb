SUMMARY = "YaST2 - Sinhala Translations"
DESCRIPTION = "YaST2 - Translations for Sinhala."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-si-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "0a5a16408cdd6b5742c795570e8c0d770005b0c7f22fd92ae2c1acb888da0b444b8752911776ee214d5f89b7c776dc39ba4100d64c313960ce63e8f1d57240ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-si \
yast2-trans-si"

RDEPENDS:${PN} += ""

inherit rpm
