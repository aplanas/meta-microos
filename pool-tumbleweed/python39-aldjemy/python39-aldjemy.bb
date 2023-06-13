SUMMARY = "SQLAlchemy to Django integration library"
DESCRIPTION = "SQLAlchemy to Django integration library."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "python39-aldjemy-1.0.0-3.1.noarch.rpm"
RPM_HASH = "55f87fd09d90877a83eda50256253101781d7584c6fba4200a354c80008425177d59f9ab3c361060be2a3bdc76f6a5d8d919ae5d60ce071038f02e77dc89c259"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(aldjemy) \
python39-aldjemy \
python3dist(aldjemy)"

RDEPENDS:${PN} += "python(abi) \
python39-Django \
python39-SQLAlchemy"

inherit rpm
