SUMMARY = "YaST2 - Zulu Translations"
DESCRIPTION = "YaST2 - Translations for Zulu."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-zu-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "47dbfda4097b9e58f2ed0e73feb42c65bb0a0f9c356535bf8b995e8435d3fb5c4f3ab53ecba2e112f6cf18d3eaad8fc3f240dd9d8739cd8b7b2cbc6b88a5a9bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-zu \
yast2-trans-zu"

RDEPENDS:${PN} += ""

inherit rpm
