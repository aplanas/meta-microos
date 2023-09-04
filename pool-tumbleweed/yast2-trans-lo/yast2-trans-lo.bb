SUMMARY = "YaST2 - Lao Translations"
DESCRIPTION = "YaST2 - Translations for Lao."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-lo-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "3491bad1af5ff452a5c4d9b8650bd979846e32149d036e35e22c1aff55c6af2264b4fbcc6fd61c5f21b21af4b3de815bbfbf992a41c125cad08e7ae8f7ff9cca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-lo \
yast2-trans-lo"

RDEPENDS:${PN} += ""

inherit rpm
