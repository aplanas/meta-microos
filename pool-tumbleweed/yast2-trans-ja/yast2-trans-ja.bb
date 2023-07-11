SUMMARY = "YaST2 - Japanese Translations"
DESCRIPTION = "YaST2 - Japanese translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-ja-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "b8bdca5a90f4d9ecef7e327ab508511bf6d71ee10467d0836f140735a27d6d693644452ba819beb0e13e0a6dd5b45e38a19bfa4bc9cbac95f16b03690ab588d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ja \
yast2-trans-ja"

RDEPENDS:${PN} += ""

inherit rpm
