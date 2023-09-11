SUMMARY = "The python pandas[sql-other] extra"
DESCRIPTION = "This package provides the [sql-other] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python311-pandas-sql-other-2.0.3-1.3.noarch.rpm"
RPM_HASH = "78cd2f7efba6cabb7e44cfe7d3e032f7719c0016355c46323870f3a62a43e24b2433e2d3d243c9d25dc0b2ac6616d2286ef1be765c22bc88b417f928225cb1ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-sql-other \
python311-pandas-sql-other"

RDEPENDS:${PN} += "python311-SQLAlchemy \
python311-pandas"

inherit rpm
