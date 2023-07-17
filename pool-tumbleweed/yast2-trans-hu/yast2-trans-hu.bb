SUMMARY = "YaST2 - Hungarian Translations"
DESCRIPTION = "YaST2 - Hungarian translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-hu-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "df5f8762c99d7345d0b749432e33a00146a55ed577484b1064693392871e9136227cce6fdb932db1779a53ef2fccc5e6c296bc41c9a614d61a57874eab201f89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-hu \
yast2-trans-hu"

RDEPENDS:${PN} += ""

inherit rpm
