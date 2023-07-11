SUMMARY = "YaST2 - British English Translations"
DESCRIPTION = "YaST2 - Translations for British English."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-en_GB-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "007cdca85153de1f3c960ef18a11622c758e149692e61287362f3eb76026e2ac083a27dd0d90766e52538209a09c8da82257cecd37e1207eacf2028a504b0c37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-en-GB \
yast2-trans-en-GB"

RDEPENDS:${PN} += ""

inherit rpm
