SUMMARY = "The python pandas[postgresql] extra"
DESCRIPTION = "This package provides the [postgresql] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python39-pandas-postgresql-2.0.2-4.1.noarch.rpm"
RPM_HASH = "91d4ab11807d18df925b57df4f27a9e6d951b26af28b7f690711fe2dde3fb7a47826bd692b5542adb136f0c6b651c6d1bf0cb90888312dd4404f4d962a3b4216"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-postgresql"

RDEPENDS:${PN} += "python39-SQLAlchemy \
python39-pandas \
python39-psycopg2"

inherit rpm
