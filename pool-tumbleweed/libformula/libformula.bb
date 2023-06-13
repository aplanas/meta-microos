SUMMARY = "Formula Parser"
DESCRIPTION = "LibFormula provides Excel-Style-Expressions. The implementation provided \
here is very generic and can be used in any application that needs to \
compute formulas."
LICENSE = "LGPL-2.0-only"

PV = "1.1.6"

RPM_NAME = "libformula-1.1.6-1.4.noarch.rpm"
RPM_HASH = "40736bd743b8b679ab6f2a136e28f4ad63c360f44ffe1d94669446c59048e3ea1a248b941be0379179f7ad0844778eb219c23224d415a2d1c53c8cc51c56bffe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libformula"

RDEPENDS:${PN} += "apache-commons-logging \
java \
jpackage-utils \
libbase"

inherit rpm
