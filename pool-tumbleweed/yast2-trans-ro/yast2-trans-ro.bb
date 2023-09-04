SUMMARY = "YaST2 - Romanian Translations"
DESCRIPTION = "YaST2 - Translations for Romanian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-ro-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "7dae34b3e702ced2ac38ceea35a58da5be087f42fc17aa2c3af87135dd14217b37bb171e30e287871c9647f3287e57fac2855188107930e7b9026bb76c27aba5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ro \
yast2-trans-ro"

RDEPENDS:${PN} += ""

inherit rpm
