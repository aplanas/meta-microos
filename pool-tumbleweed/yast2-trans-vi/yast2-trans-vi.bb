SUMMARY = "YaST2 - Vietnamese Translations"
DESCRIPTION = "YaST2 - Translations for Vietnamese."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-vi-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "5d1635aa66ff361632d3729e751348f093c4340435929ff4821032c9d9946bc9035de0dbd2655771320242cdcc332f8e502e851ac2a0df57bd2484e076c6ff81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-vi \
yast2-trans-vi"

RDEPENDS:${PN} += ""

inherit rpm
