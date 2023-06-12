SUMMARY = "SQLAlchemy to Django integration library"
DESCRIPTION = "SQLAlchemy to Django integration library."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "python310-aldjemy-1.0.0-3.1.noarch.rpm"
RPM_HASH = "80f02a6e775e0a56e2175d0bf4354191ff455c7270113102849fadd2d8b63ffc36a35699143beac969ebe08360daaa90a4984dc339ed16e9014c9eab124e6d6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aldjemy \
python3.10dist(aldjemy) \
python310-aldjemy \
python3dist(aldjemy)"
RDEPENDS:${PN} += "python(abi) \
python310-Django \
python310-SQLAlchemy"

inherit rpm
