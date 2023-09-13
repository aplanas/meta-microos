SUMMARY = "YaST2 - Punjabi Translations"
DESCRIPTION = "Translations for Punjabi."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-pa-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "5c6e941bf18c6954edc87034f9fee5f99e802df43a8f535f3ef1d623a0d5f8b4c9f6dbe4e18e2f77397063ba2537719b42e2134f041bd30ca82630e4b05dfc63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-pa \
yast2-trans-pa"

RDEPENDS:${PN} += ""

inherit rpm
