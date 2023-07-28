SUMMARY = "YaST2 - Finnish Translations"
DESCRIPTION = "YaST2 - Finnish translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-fi-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "4fb855addba37a56e2c860637f34809222d1982238116569452903c3b690f5ccac5a51545a816a513ed791a7d2e11ef19530ab6341978985a7f52040b4c4a2ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-fi \
yast2-trans-fi"

RDEPENDS:${PN} += ""

inherit rpm
