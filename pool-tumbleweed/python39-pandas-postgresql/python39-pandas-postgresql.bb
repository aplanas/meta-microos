SUMMARY = "The python pandas[postgresql] extra"
DESCRIPTION = "This package provides the [postgresql] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python39-pandas-postgresql-2.1.0-1.2.noarch.rpm"
RPM_HASH = "4ac8c36b6228fac707eeb75ed55b6ae5c0c7a713985dd4bb13ca67c9797ab7b084a4f37e078ead8878cdafaf4ebe18f840222d881255f31a835d36d94318361f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-postgresql"

RDEPENDS:${PN} += "python39-SQLAlchemy \
python39-pandas \
python39-psycopg2"

inherit rpm
