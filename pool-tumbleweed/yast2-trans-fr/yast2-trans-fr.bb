SUMMARY = "YaST2 - French Translations"
DESCRIPTION = "YaST2 - Translations for French."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-fr-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "cb79a08ba44a3c61c7432c58ba5841aa3da2af1be413d565c3a1b9ed81624e244904f8cef41399668f6af57c1f4bd6062ba4e4f2ac08caf382e2136a9e19a27f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-fr \
yast2-trans-fr"

RDEPENDS:${PN} += ""

inherit rpm
