SUMMARY = "YaST2 - Swedish Translations"
DESCRIPTION = "YaST2 - Translations for Swedish."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-sv-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "b3cf7c36c8e22cc8598587a663fa6598a2ebe86a127592c5319b408e796f89ee7513f4209f1c3fed869151a2e81050460007c537835c7e6dae31047e176f384e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sv \
yast2-trans-sv"

RDEPENDS:${PN} += ""

inherit rpm
