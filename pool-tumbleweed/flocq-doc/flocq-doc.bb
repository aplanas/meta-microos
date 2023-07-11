SUMMARY = "Documentation for Flocq"
DESCRIPTION = "This package contains the HTML documentation for flocq."
LICENSE = "LGPL-3.0-or-later"

PV = "4.1.1"

RPM_NAME = "flocq-doc-4.1.1-1.5.noarch.rpm"
RPM_HASH = "6dece66ab1227f68e5e1df35a9aa1ed4459f895805c142791ddbc105341d21bb6af269add1af15e294ceff8c596124b2c36dfb1fff31ab98de18be8ab9e546e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flocq-doc"

RDEPENDS:${PN} += "coq-doc \
flocq"

inherit rpm
