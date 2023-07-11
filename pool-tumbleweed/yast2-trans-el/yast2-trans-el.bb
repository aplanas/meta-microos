SUMMARY = "YaST2 - Greek Translations"
DESCRIPTION = "YaST2 - Translations for Greek."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-el-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "72903c59a9d479af484ff2261bdf12f70322d72ed039b4e498f064602befd82ff1ce2ea3b4ea51a7bd151f47865be37b772aea66d6a3543485765f5b7501e3a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-el \
yast2-trans-el"

RDEPENDS:${PN} += ""

inherit rpm
