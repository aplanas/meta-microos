SUMMARY = "YaST2 - Latvian Translations"
DESCRIPTION = "YaST2 - Translations for Latvian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-lv-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "305a4a11f240935cb548f7aef639515f877e9499978aa71d6791bb4b6ea3acaf52ff6a901767e54e2d901e2f6fd950a5f02405bc290bd68b4f593ffa7b6130ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-lv \
yast2-trans-lv"

RDEPENDS:${PN} += ""

inherit rpm
