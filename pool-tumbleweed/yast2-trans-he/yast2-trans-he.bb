SUMMARY = "YaST2 - Hebrew Translations"
DESCRIPTION = "YaST2 - Translations for Hebrew."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-he-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "f81e909d1f05f486643c5bfa7446d5fe3a4148deb1447bbab38a3fb23905cbe871fc2ca82d72b05b6c3e12b473387abc97dbec75f1396f4ed15a68761752441e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-he \
yast2-trans-he"

RDEPENDS:${PN} += ""

inherit rpm
