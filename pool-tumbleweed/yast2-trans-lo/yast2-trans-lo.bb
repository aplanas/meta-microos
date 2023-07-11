SUMMARY = "YaST2 - Lao Translations"
DESCRIPTION = "YaST2 - Translations for Lao."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-lo-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "a3a526476d6d2f6120e781660582ce7422c05564cc469b0d54e8359777093dadb4c2707258d7ed5b6bc6d2c7b82ddde9ad35a6fe463613642404d3d3c214a891"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-lo \
yast2-trans-lo"

RDEPENDS:${PN} += ""

inherit rpm
