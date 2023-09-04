SUMMARY = "YaST2 - Lithuanian Translations"
DESCRIPTION = "YaST2 - Translations for Lithuanian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-lt-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "4de2cc4b1474f1fbb1e359f17e4701e14a169f7dda9e1218d0ce573ae38ecfce4a19ad8a318872ebdae426ffd8ce312874890cfe071d0173fa9ab46b132bdbe2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-lt \
yast2-trans-lt"

RDEPENDS:${PN} += ""

inherit rpm
