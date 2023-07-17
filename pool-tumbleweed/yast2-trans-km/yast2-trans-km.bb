SUMMARY = "YaST2 - Khmer Translations"
DESCRIPTION = "YaST2 - Translations for Khmer."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-km-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "6e1bc5efb96448c1c6fab0f4c10bc44141ef403daac724cb46de5d12e08e7ba480370b2f616cea271984a537222ded2fbf0d8b0f90a63620445bf4f1b8911764"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-km \
yast2-trans-km"

RDEPENDS:${PN} += ""

inherit rpm
