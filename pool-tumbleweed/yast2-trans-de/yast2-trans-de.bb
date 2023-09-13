SUMMARY = "YaST2 - German Translations"
DESCRIPTION = "YaST2 - German translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-de-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "c1d620b673e0571dc9b6e43fe61c5759a11ec7435d2c387f5c11873aef5cfb8b331a2bed04ddb2a07157a974ea8d526de50b6deed98ee762706d7c4edc975451"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-de \
yast2-trans-de"

RDEPENDS:${PN} += ""

inherit rpm
