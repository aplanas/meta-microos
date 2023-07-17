SUMMARY = "YaST2 - Zulu Translations"
DESCRIPTION = "YaST2 - Translations for Zulu."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-zu-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "4740208fcf5bde188451c70a79eee7fdbedc74520e3e4bf41ea6a79fa4565f6e104ea08e18ca31e4aa5c4c1e5508d0f452270f5ba9789b194fb33642d754a12a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-zu \
yast2-trans-zu"

RDEPENDS:${PN} += ""

inherit rpm
