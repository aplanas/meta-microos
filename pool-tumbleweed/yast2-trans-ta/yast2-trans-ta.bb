SUMMARY = "YaST2 - Tamil Translations"
DESCRIPTION = "YaST2 - Tamil translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-ta-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "a7f3b3e5c345a560efb86db2231575b48f2aaaa4ac89091190058d370f92506c1ef2c7f41709ce780012421124f63c8dbb2288a955109b06563b26fa1bdf7075"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ta \
yast2-trans-ta"

RDEPENDS:${PN} += ""

inherit rpm
