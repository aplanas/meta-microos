SUMMARY = "YaST2 - Ukrainian Translations"
DESCRIPTION = "YaST2 - Translations for Ukrainian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-uk-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "131da757270e20289efc294401386178277682973e7d64676891fc9fddeccc9c0561204b990b3438811227ee83cfc8b0d621ea4fda7592ee794fd154fa9c5f85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-uk \
yast2-trans-uk"

RDEPENDS:${PN} += ""

inherit rpm
