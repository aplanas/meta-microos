SUMMARY = "The python pandas[sql-other] extra"
DESCRIPTION = "This package provides the [sql-other] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python39-pandas-sql-other-2.0.3-1.2.noarch.rpm"
RPM_HASH = "c8527d313c73b035dd3a5a55fe6024cd9a8d05857fc578a045c5525c621b0cd0dabe368ca98beefc8b9b089a100d996f278205e670870e76e8c4df1b2e2899bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-sql-other"

RDEPENDS:${PN} += "python39-SQLAlchemy \
python39-pandas"

inherit rpm
