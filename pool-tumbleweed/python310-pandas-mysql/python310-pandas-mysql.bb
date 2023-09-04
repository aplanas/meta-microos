SUMMARY = "The python pandas[mysql] extra"
DESCRIPTION = "This package provides the [mysql] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python310-pandas-mysql-2.0.3-1.2.noarch.rpm"
RPM_HASH = "c9c3aa58c414d7b041f56de81b36791c45c0b90cece7def2e8127359d640eafce7b7556f42fc36c0f2d569e9f1f5de2fe1dd952d30b7b6853fd2e494ea566789"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-mysql"

RDEPENDS:${PN} += "python310-PyMySQL \
python310-SQLAlchemy \
python310-pandas"

inherit rpm
