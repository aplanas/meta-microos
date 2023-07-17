SUMMARY = "YaST2 - Tamil Translations"
DESCRIPTION = "YaST2 - Tamil translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-ta-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "f671189970fa78c4aa2032bcf37fc99bf3296ab1f5fad2c05d846ad3ce246537d06bd3892c6c9d68ff861b3d9d6eea8298dfac9888fa4a8a11921f3ad8203418"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ta \
yast2-trans-ta"

RDEPENDS:${PN} += ""

inherit rpm
