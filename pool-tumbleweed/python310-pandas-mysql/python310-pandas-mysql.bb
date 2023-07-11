SUMMARY = "The python pandas[mysql] extra"
DESCRIPTION = "This package provides the [mysql] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python310-pandas-mysql-2.0.2-4.1.noarch.rpm"
RPM_HASH = "a73b07cb8581cbe06894b0875b8fe15333ae6312d3e118e25a9a993ca5dad5c4bce66276c5f71ca2f9ce22c2cb7ee53f4da58d899350eef270c2de67a6700c0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-mysql"

RDEPENDS:${PN} += "python310-PyMySQL \
python310-SQLAlchemy \
python310-pandas"

inherit rpm
