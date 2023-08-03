SUMMARY = "YaST2 - Xhosa Translations"
DESCRIPTION = "YaST2 - Translations for Xhosa."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-xh-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "d19519509b441b7e0ce93b4f86ce6144260eb989b6e6798e5b4b5295b643522e72b1d11876aeb3f6296e3753c8d3479527164236664b57e810a6c36a34d12dde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-xh \
yast2-trans-xh"

RDEPENDS:${PN} += ""

inherit rpm
