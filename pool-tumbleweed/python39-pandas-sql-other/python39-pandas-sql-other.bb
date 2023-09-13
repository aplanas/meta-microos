SUMMARY = "The python pandas[sql-other] extra"
DESCRIPTION = "This package provides the [sql-other] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python39-pandas-sql-other-2.1.0-1.2.noarch.rpm"
RPM_HASH = "07ea9c01fac547011c52017007afb52005e0758a56e3f5b9c8297524780fc870bf83ee080e363b43d0d9208c324274fb987359e013ef404f592f721c7ee3ca62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-sql-other"

RDEPENDS:${PN} += "python39-SQLAlchemy \
python39-pandas"

inherit rpm
