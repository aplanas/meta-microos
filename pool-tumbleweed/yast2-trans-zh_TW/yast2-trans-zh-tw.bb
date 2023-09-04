SUMMARY = "YaST2 - Traditional Chinese Translations"
DESCRIPTION = "YaST2 - Translations for Traditional Chinese."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-zh_TW-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "c3dfe6aa5df7982d1e3d7c55bb25a2b634cf8c238e38d2f9943e2463b6b260cad79d8b813907e11d512e6fab457aeb23985e7ce66065e7a31f09e402a0f902e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-zh-TW \
yast2-trans-zh-TW"

RDEPENDS:${PN} += ""

inherit rpm
