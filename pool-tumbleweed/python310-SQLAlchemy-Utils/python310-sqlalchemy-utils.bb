SUMMARY = "Various utility functions for SQLAlchemy"
DESCRIPTION = "Various utility functions and custom data types for SQLAlchemy."
LICENSE = "BSD-3-Clause"

PV = "0.41.1"

RPM_NAME = "python310-SQLAlchemy-Utils-0.41.1-1.3.noarch.rpm"
RPM_HASH = "692e77251758fde375037d91f752df2ca167e2e87cdf0991d0b6c84bab6d6e41a414c73b49b3a7ef9094327ca8ea1f8f28ecc918c8fd003094dba3312625da53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sqlalchemy-utils \
python310-SQLAlchemy-Utils \
python3dist-sqlalchemy-utils"

RDEPENDS:${PN} += "python-abi \
python310-SQLAlchemy"

inherit rpm
