SUMMARY = "The python pandas[mysql] extra"
DESCRIPTION = "This package provides the [mysql] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python310-pandas-mysql-2.1.0-1.2.noarch.rpm"
RPM_HASH = "08266a999cb7e16d83b3633f2ecba931301e0e736a91feba7126b21212f28673883038d573ebfccc2fad7737cecd08dba9f9fc4848f2de3ccd5f88a155c80db1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-mysql"

RDEPENDS:${PN} += "python310-PyMySQL \
python310-SQLAlchemy \
python310-pandas"

inherit rpm
