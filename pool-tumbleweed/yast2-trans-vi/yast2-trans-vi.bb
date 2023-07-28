SUMMARY = "YaST2 - Vietnamese Translations"
DESCRIPTION = "YaST2 - Translations for Vietnamese."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-vi-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "5af37616d7e1aa77de73643472eeb0ddf26db22f5b8994312e307c931dabe90c968e51981b9c0863ed6bb1336d0022a9518f2bb68eaa036fcc8b3c36f41e51f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-vi \
yast2-trans-vi"

RDEPENDS:${PN} += ""

inherit rpm
