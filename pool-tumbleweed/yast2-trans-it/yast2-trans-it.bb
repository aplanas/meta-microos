SUMMARY = "YaST2 - Italian Translations"
DESCRIPTION = "YaST2 - translations for Italian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-it-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "23808c4608426e001d90a1ec14933a1b8a252628e1923453f92616c5290d9ed10a50969e9ecf0568d7e3de7305aadccc78b47ec3347f763b6db524a3d4cf3ab1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-it \
yast2-trans-it"

RDEPENDS:${PN} += ""

inherit rpm
