SUMMARY = "YaST2 - Albanian Translations"
DESCRIPTION = "YaST2 - Translations for Albanian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-sq-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "d43095fb6faaaeab7cfa0f47fc9c7937652ed0e36324c0f630d52c814f686708926c9a50d378a9c932cf2d2f886bcb177d75f180fb7965ee8d4b92e7cd28bacf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sq \
yast2-trans-sq"

RDEPENDS:${PN} += ""

inherit rpm
