SUMMARY = "YaST2 - Pashto Translations"
DESCRIPTION = "YaST2 - Translations for Pashto."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-ps-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "b1c882fde4909d2fb76d8cc24843165c21eddb4815620ffc099904f3fe5796fe92b7123956deac010c4ab444ebb29e3bc040347769f9527d805fd0e9aefe1df4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ps \
yast2-trans-ps"

RDEPENDS:${PN} += ""

inherit rpm
