SUMMARY = "YaST2 - Dutch Translations"
DESCRIPTION = "YaST2 - Translations for Dutch."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-nl-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "e635dcb8448c4837328a0854dc9f179447e805545c301412ba8bc0e1ebc9ca698c824952952e6c6d3654eb6f40fcb05bd52a8368b85d052c05d36157b3e5ed88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-nl \
yast2-trans-nl"

RDEPENDS:${PN} += ""

inherit rpm
