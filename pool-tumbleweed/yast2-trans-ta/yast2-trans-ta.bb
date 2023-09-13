SUMMARY = "YaST2 - Tamil Translations"
DESCRIPTION = "YaST2 - Tamil translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-ta-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "7462ffbd519721f4abba97ea84bdfdaf38a99a5da8056045d006d1e1bcbfde92db5870f9c4a0d0aea578a6a90188c1970a7b08cf252a07b98ae9ef23178b10c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ta \
yast2-trans-ta"

RDEPENDS:${PN} += ""

inherit rpm
