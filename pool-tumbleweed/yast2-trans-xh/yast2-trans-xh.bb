SUMMARY = "YaST2 - Xhosa Translations"
DESCRIPTION = "YaST2 - Translations for Xhosa."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-xh-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "71e375174595e67de72a30532a42b7a74690ab6a7278db9ba2ed4cc6bbacfd4c71ce0046e577dbf8ada611061ca93d0dc2b943f6157d152a8eddf3363af2c510"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-xh \
yast2-trans-xh"

RDEPENDS:${PN} += ""

inherit rpm
