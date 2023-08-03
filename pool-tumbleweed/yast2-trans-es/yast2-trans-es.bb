SUMMARY = "YaST2 - Spanish Translations"
DESCRIPTION = "YaST2 - Spanish Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-es-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "ce545c11c608daec53aa9515b80bac66af51026bd607fbc0aa06e54b11a42003513d1c6c6a4b992e8768548544fe725c8c4d15e143098af4c4452912678a87af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-es \
yast2-trans-es"

RDEPENDS:${PN} += ""

inherit rpm
