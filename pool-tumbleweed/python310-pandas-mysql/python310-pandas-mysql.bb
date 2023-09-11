SUMMARY = "The python pandas[mysql] extra"
DESCRIPTION = "This package provides the [mysql] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python310-pandas-mysql-2.0.3-1.3.noarch.rpm"
RPM_HASH = "c36b2d10a3efed9ffbec9b057550ed6814ef32c5dd9dd2c51e70e7f36fea7753879126955b70e06edeffe4b3d7bc74f9676da899cc26f018540c6d46c7434904"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-mysql"

RDEPENDS:${PN} += "python310-PyMySQL \
python310-SQLAlchemy \
python310-pandas"

inherit rpm
