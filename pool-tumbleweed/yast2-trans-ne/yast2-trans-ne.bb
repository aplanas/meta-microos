SUMMARY = "YaST2 - Nepali Translations"
DESCRIPTION = "YaST2 - Translations for Nepali."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-ne-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "34eb6ddd7c2b57e4c781df8a462dfaf73b6c42d7abf697b57b12a0fdde2b77edee8442855c61d91706fe22a483b06d273f20334266e0e5fe10dd64d945b70a87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ne \
yast2-trans-ne"

RDEPENDS:${PN} += ""

inherit rpm
