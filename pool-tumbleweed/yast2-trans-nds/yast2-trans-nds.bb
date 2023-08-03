SUMMARY = "YaST2 - Low Saxonian Translations"
DESCRIPTION = "YaST2 - Translations for Low Saxonian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-nds-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "9bf2acc3f38441dfbc5d7a90941f9138cc13da4315e1ac59e29e91130702d1ac7eabae64ef095242700a6ad9596db6a0ad7dd849f25e7a1a56c5d64a9c95ada0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-nds \
yast2-trans-nds"

RDEPENDS:${PN} += ""

inherit rpm
