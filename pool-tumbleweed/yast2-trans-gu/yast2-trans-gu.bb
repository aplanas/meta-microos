SUMMARY = "YaST2 - Gujarati Translations"
DESCRIPTION = "YaST2 - Translations for Gujarati."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-gu-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "2fa1fad1fd0c776256e1c5f6909ca8df1eaa18fb88089f1478a98e42ec60d1e57960e92e2a678b258f4debf860593d0d71c5d70e0c608420b1a9b61530250f8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-gu \
yast2-trans-gu"

RDEPENDS:${PN} += ""

inherit rpm
