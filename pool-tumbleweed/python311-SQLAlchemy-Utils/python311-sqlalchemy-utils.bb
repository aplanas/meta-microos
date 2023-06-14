SUMMARY = "Various utility functions for SQLAlchemy"
DESCRIPTION = "Various utility functions and custom data types for SQLAlchemy."
LICENSE = "BSD-3-Clause"

PV = "0.38.3"

RPM_NAME = "python311-SQLAlchemy-Utils-0.38.3-1.6.noarch.rpm"
RPM_HASH = "1b9fc2348cc888389ba3f9ee2ed5f086669fa49605259a13160f9e2369b56ac92087e0960db478381925c5570478dca48d47c3763eee8d59c73b92840c2e1b53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-sqlalchemy-utils \
python311-SQLAlchemy-Utils \
python3dist-sqlalchemy-utils"

RDEPENDS:${PN} += "python-abi \
python311-SQLAlchemy"

inherit rpm
