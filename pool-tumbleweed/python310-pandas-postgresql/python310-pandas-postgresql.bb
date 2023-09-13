SUMMARY = "The python pandas[postgresql] extra"
DESCRIPTION = "This package provides the [postgresql] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python310-pandas-postgresql-2.1.0-1.2.noarch.rpm"
RPM_HASH = "998afdbec284316efe3d8ed577aaca0936faef418a03f10a57623188cd0e5a785c19ecbb4e4ab376c6da8e600079419084773953b4bbc9e1f2dc2e847b06b770"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-postgresql"

RDEPENDS:${PN} += "python310-SQLAlchemy \
python310-pandas \
python310-psycopg2"

inherit rpm
