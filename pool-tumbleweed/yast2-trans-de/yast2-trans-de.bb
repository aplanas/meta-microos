SUMMARY = "YaST2 - German Translations"
DESCRIPTION = "YaST2 - German translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-de-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "382124635257b3720f3a9d4442c8df0efb74a09cbaef52aec4c4e25c80a66e6d75de3be71be25ad1e529e5d8f2da2b2cdfede47883d2c3fb328edac8c9ea9726"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-de \
yast2-trans-de"

RDEPENDS:${PN} += ""

inherit rpm
