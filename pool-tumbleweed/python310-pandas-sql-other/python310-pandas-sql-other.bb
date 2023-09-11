SUMMARY = "The python pandas[sql-other] extra"
DESCRIPTION = "This package provides the [sql-other] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python310-pandas-sql-other-2.0.3-1.3.noarch.rpm"
RPM_HASH = "2134ec18487c974e1a2920a1d71d9e0315ad3b6ae2df9cc46e34af7ef1c00498f9be8108dee7ee14311b5f45bcdf16c7d075c852913d81ce836ca2e27b5823af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-sql-other"

RDEPENDS:${PN} += "python310-SQLAlchemy \
python310-pandas"

inherit rpm
