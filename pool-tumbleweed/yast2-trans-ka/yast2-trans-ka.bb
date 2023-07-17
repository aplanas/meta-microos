SUMMARY = "YaST2 - Georgian Translations"
DESCRIPTION = "YaST2 - Translations for Georgian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-ka-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "41dbfc7dd419797fa28219b6f48b2b7f283ba37833eed342d192090608d8aec8f01ad3eb98839f6b743df07505ef35572d14e236d186342113cfbd0df8a5c620"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ka \
yast2-trans-ka"

RDEPENDS:${PN} += ""

inherit rpm
