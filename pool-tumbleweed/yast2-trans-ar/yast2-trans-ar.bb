SUMMARY = "YaST2 - Arabic Translations"
DESCRIPTION = "YaST2 - Translations for Arabic."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-ar-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "ab25baaf867e9c472cbc18d469ce081fee1c0858667cd01dfeb77b75794e69f6c1433a5776b07789886eb770a779cd0f42c7f144eb3d3b5e2d0adfc1b96ab33f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ar \
yast2-trans-ar"

RDEPENDS:${PN} += ""

inherit rpm
