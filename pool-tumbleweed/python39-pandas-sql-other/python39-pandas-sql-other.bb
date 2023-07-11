SUMMARY = "The python pandas[sql-other] extra"
DESCRIPTION = "This package provides the [sql-other] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python39-pandas-sql-other-2.0.2-4.1.noarch.rpm"
RPM_HASH = "6be1dc73e1ba1d9df3163dfaa704be0e7c0fc29b732f2efc7cf1067dd99406f5a0cb53670c43879ec3af02079b7ff6a7b46509809650f9c8d5b3b36fa1b4470f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-sql-other"

RDEPENDS:${PN} += "python39-SQLAlchemy \
python39-pandas"

inherit rpm
