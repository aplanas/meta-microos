SUMMARY = "Metapackage, requires R-core-devel, R-core-libs"
DESCRIPTION = "Metapackage to keep the same user experience as before the split of \
the monolithic R-base-devel"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.1"

RPM_NAME = "R-base-devel-4.3.1-46.1.aarch64.rpm"
RPM_HASH = "5e005875498dec692ba2125d4d61061f2fe11e2b73dafe9cee19ea38f1740ca58bea3c0b1180ec8e49849d2200be958e6b45b030cf910f74800a3a0e8781c033"

RPROVIDES:${PN} += "R-base-devel"

RDEPENDS:${PN} += "R-core-devel \
R-core-libs"

inherit rpm
