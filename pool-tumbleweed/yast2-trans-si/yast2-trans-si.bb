SUMMARY = "YaST2 - Sinhala Translations"
DESCRIPTION = "YaST2 - Translations for Sinhala."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-si-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "0396001ec3e0e0a46ea98ce43af8208fbcd070e0a6d8c113610a5f53f844293c4dfa77492a28bf67c8df5cc4eabdb08aa072d491d268ed3f425a60eabb7dad26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-si \
yast2-trans-si"

RDEPENDS:${PN} += ""

inherit rpm
