SUMMARY = "YaST2 - Galician Translations"
DESCRIPTION = "YaST2 - Galician translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-gl-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "cfa7993879b30d1ae01bce28ad4ece0dfc23cc8ef5c3556eef64701f4d762ef6bfc3e874eaf459c0559d342b23c840828b5d7172b5a50ac3e12ec53642e2742d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-gl \
yast2-trans-gl"

RDEPENDS:${PN} += ""

inherit rpm
