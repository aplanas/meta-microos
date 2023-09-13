SUMMARY = "The python pandas[mysql] extra"
DESCRIPTION = "This package provides the [mysql] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python39-pandas-mysql-2.1.0-1.2.noarch.rpm"
RPM_HASH = "99a1b295a761d2cf31b1815315284a8dcc82b9372a79893228a2d7b87cc2cad594edb316e9491cb2be0a3cc872dc91f781812176753e8a8a28289f8392d8b0c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-mysql"

RDEPENDS:${PN} += "python39-PyMySQL \
python39-SQLAlchemy \
python39-pandas"

inherit rpm
