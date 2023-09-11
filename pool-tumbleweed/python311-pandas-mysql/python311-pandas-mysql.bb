SUMMARY = "The python pandas[mysql] extra"
DESCRIPTION = "This package provides the [mysql] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python311-pandas-mysql-2.0.3-1.3.noarch.rpm"
RPM_HASH = "5f02252d5c9d1310c5d350e1c5a9cfd553a8dadfe17d23e53c72cb696b8690b630fbb81e647a6943dbb0b6e6e8a2050708475008cee04d2cf5a4b94d86731819"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-mysql \
python311-pandas-mysql"

RDEPENDS:${PN} += "python311-PyMySQL \
python311-SQLAlchemy \
python311-pandas"

inherit rpm
