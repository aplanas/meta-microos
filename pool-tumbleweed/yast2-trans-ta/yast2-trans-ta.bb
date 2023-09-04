SUMMARY = "YaST2 - Tamil Translations"
DESCRIPTION = "YaST2 - Tamil translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-ta-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "a5a0d05b4e396c748d08767db7487ccd53007a21797c45af92b3f525ee1301c0b55c2bafc08682601549f19e72c00c8bf8ddcacfe944efe81b310cc10984fe26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ta \
yast2-trans-ta"

RDEPENDS:${PN} += ""

inherit rpm
