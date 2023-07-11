SUMMARY = "Various utility functions for SQLAlchemy"
DESCRIPTION = "Various utility functions and custom data types for SQLAlchemy."
LICENSE = "BSD-3-Clause"

PV = "0.41.1"

RPM_NAME = "python39-SQLAlchemy-Utils-0.41.1-1.3.noarch.rpm"
RPM_HASH = "e98e767a8a8f42e162886a0b5ae3ce6c7f7451522e111ed30e817e1fe02e00c210f8e77945d0c3fe7d220294ac281fc7b1567293e350db63d530051b2c8ca827"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sqlalchemy-utils \
python39-SQLAlchemy-Utils \
python3dist-sqlalchemy-utils"

RDEPENDS:${PN} += "python-abi \
python39-SQLAlchemy"

inherit rpm
