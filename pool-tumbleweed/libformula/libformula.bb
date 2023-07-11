SUMMARY = "Formula Parser"
DESCRIPTION = "LibFormula provides Excel-Style-Expressions. The implementation provided \
here is very generic and can be used in any application that needs to \
compute formulas."
LICENSE = "LGPL-2.0-only"

PV = "1.1.6"

RPM_NAME = "libformula-1.1.6-1.5.noarch.rpm"
RPM_HASH = "dabc75b969fffe0bf7546451346b275748175b785bd91b4d48880c2196379b5d2e1c6f3d07d84e2bc9d3eb26e1d3759abd76b3b406400d553aba95667158cd2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libformula"

RDEPENDS:${PN} += "apache-commons-logging \
java \
jpackage-utils \
libbase"

inherit rpm
