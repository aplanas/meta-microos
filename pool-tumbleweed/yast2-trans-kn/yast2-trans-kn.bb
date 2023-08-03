SUMMARY = "YaST2 - Kannada Translations"
DESCRIPTION = "YaST2 - Translations for Kannada."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-kn-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "59a9d8956d75bc7da309c3b00bbddbe1f4d89ffc681a3c319e55784a6d70128d03f8b561d44a4e664b158d6127695f088fdd902c3333eb8cfad069f0d771e43c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ka \
yast2-trans-kn"

RDEPENDS:${PN} += ""

inherit rpm
