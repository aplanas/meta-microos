SUMMARY = "The python pandas[postgresql] extra"
DESCRIPTION = "This package provides the [postgresql] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python39-pandas-postgresql-2.0.3-1.2.noarch.rpm"
RPM_HASH = "49b5f5407da10e4e2765303e0a8678a53497ce5599980832055ccfcad9c0e32ebe99f3f12de563ca5db483a58eae7e80e6885741bc671b1ea21b736fc3b3b2f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-postgresql"

RDEPENDS:${PN} += "python39-SQLAlchemy \
python39-pandas \
python39-psycopg2"

inherit rpm
