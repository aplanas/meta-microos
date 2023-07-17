SUMMARY = "YaST2 - Japanese Translations"
DESCRIPTION = "YaST2 - Japanese translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-ja-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "5d797267bb41430a3420fd743ce883255b1df8ab98d4ddc20779fc5fb1e86e2e49b5b18bc49d587deb07936397bf911e9ab5fbfc681be699e5ec78feded45483"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ja \
yast2-trans-ja"

RDEPENDS:${PN} += ""

inherit rpm
