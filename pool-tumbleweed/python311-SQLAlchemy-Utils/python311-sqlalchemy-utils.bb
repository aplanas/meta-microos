SUMMARY = "Various utility functions for SQLAlchemy"
DESCRIPTION = "Various utility functions and custom data types for SQLAlchemy."
LICENSE = "BSD-3-Clause"

PV = "0.41.1"

RPM_NAME = "python311-SQLAlchemy-Utils-0.41.1-1.3.noarch.rpm"
RPM_HASH = "b260dbdc292017a72607f099c5f50b2502bb122ef165ba78c0a39049303dbdd03595aa2bfae3c53ffec0adb6ec95f7b7a2a35e3f40d1f480fa18d14722b73d14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-SQLAlchemy-Utils \
python3.11dist-sqlalchemy-utils \
python311-SQLAlchemy-Utils \
python3dist-sqlalchemy-utils"

RDEPENDS:${PN} += "python-abi \
python311-SQLAlchemy"

inherit rpm
