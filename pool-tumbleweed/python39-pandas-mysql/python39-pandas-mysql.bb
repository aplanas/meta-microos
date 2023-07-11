SUMMARY = "The python pandas[mysql] extra"
DESCRIPTION = "This package provides the [mysql] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python39-pandas-mysql-2.0.2-4.1.noarch.rpm"
RPM_HASH = "f3fdcb9234419bd2d19321222034cd9db68b8c56883fe5ee9d97f6e14b3332829b6b714ed03389f619db7da0eb23e24b0108376bfb18af700ec5b28cb1f9c504"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-mysql"

RDEPENDS:${PN} += "python39-PyMySQL \
python39-SQLAlchemy \
python39-pandas"

inherit rpm
