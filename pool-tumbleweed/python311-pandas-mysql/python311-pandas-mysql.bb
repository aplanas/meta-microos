SUMMARY = "The python pandas[mysql] extra"
DESCRIPTION = "This package provides the [mysql] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python311-pandas-mysql-2.1.0-1.2.noarch.rpm"
RPM_HASH = "153b4d4cd78dd18b3c43692e437e2a7e4ef396cfc631224fc5a318a761c036b5194e1d1dbd79149cc311618c207fb5e8e1dea471d9b4e7ce4c2afbeeaf4958d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-mysql \
python311-pandas-mysql"

RDEPENDS:${PN} += "python311-PyMySQL \
python311-SQLAlchemy \
python311-pandas"

inherit rpm
