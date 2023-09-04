SUMMARY = "The python pandas[mysql] extra"
DESCRIPTION = "This package provides the [mysql] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python311-pandas-mysql-2.0.3-1.2.noarch.rpm"
RPM_HASH = "7c831a33c01de4b6592096d0b5e62fd001c1c559540ba565224666b083286b7da19be38b2c0c42ce5c84686a41ec6520265522827e03c6557763d67eb2a20941"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-mysql \
python311-pandas-mysql"

RDEPENDS:${PN} += "python311-PyMySQL \
python311-SQLAlchemy \
python311-pandas"

inherit rpm
