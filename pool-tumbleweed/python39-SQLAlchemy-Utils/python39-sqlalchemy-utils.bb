SUMMARY = "Various utility functions for SQLAlchemy"
DESCRIPTION = "Various utility functions and custom data types for SQLAlchemy."
LICENSE = "BSD-3-Clause"

PV = "0.38.3"

RPM_NAME = "python39-SQLAlchemy-Utils-0.38.3-1.6.noarch.rpm"
RPM_HASH = "54062c3be8df723c3ba9e92bd9c7b84e903b46cc3a781862d68a4424fd396d20293f67567d31686dcd86093438e3c7d7f385689491cdfd315dc4be54d910d857"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sqlalchemy-utils) \
python39-SQLAlchemy-Utils \
python3dist(sqlalchemy-utils)"

RDEPENDS:${PN} += "python(abi) \
python39-SQLAlchemy"

inherit rpm
