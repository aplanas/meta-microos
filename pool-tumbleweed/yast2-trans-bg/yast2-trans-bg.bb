SUMMARY = "YaST2 - Bulgarian Translations"
DESCRIPTION = "YaST2 - Translations for Bulgarian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-bg-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "da37d0d189953b776fb2d538ad8b46de6b3add873382b643fa9c2d4a643e7376f3800feb6e2033b3d3645baaa4380899a4bd7f6324687ede0db4ecb8d8cb8636"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-bg \
yast2-trans-bg"

RDEPENDS:${PN} += ""

inherit rpm
