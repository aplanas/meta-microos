SUMMARY = "YaST2 - Tamil Translations"
DESCRIPTION = "YaST2 - Tamil translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-ta-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "d9254813ef06ce6b6a5a7bce3fffd00d68482ae2f20aa05a7989889452951a2085b8c733bb983aacc90c6c4286262b51256b84e92db226c4d93d905623ef237b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:ta) \
yast2-trans-ta"
RDEPENDS:${PN} += ""

inherit rpm
