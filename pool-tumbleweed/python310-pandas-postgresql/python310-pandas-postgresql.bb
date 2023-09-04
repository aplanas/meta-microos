SUMMARY = "The python pandas[postgresql] extra"
DESCRIPTION = "This package provides the [postgresql] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python310-pandas-postgresql-2.0.3-1.2.noarch.rpm"
RPM_HASH = "f67ae1f0541884d95818e07db6ffd0d54f0b95f9058a71edf628e699af333e2609b9cb70fa3c4ae5ca0db91f3690d384b06e84ee1334ba02047cf44d086cb93d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-postgresql"

RDEPENDS:${PN} += "python310-SQLAlchemy \
python310-pandas \
python310-psycopg2"

inherit rpm
