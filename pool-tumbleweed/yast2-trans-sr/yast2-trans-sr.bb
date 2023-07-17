SUMMARY = "YaST2 - Serbian Translations"
DESCRIPTION = "YaST2 - Translations for Serbian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-sr-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "19455ba5847865d62058045257598206277a439a02f429ea6c9797451984d8ac4897f7e320138cae8381e8fb6005f2d87fe41b056380266d417eb19d0b7f65e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sr \
yast2-trans-sr"

RDEPENDS:${PN} += ""

inherit rpm
