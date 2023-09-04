SUMMARY = "YaST2 - Persian Translations"
DESCRIPTION = "YaST2 - Persian Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-fa-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "35ada91c80ac7ed0c3cfca89653ecf17b457088ffa81b22162ad5285558baa2584f538c90bda914ff68bdcd394069cd85e8bdd86ee4a8292401d6f10613f8077"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-fa \
yast2-trans-fa"

RDEPENDS:${PN} += ""

inherit rpm
