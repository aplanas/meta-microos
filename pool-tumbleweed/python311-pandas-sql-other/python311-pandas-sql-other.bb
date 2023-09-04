SUMMARY = "The python pandas[sql-other] extra"
DESCRIPTION = "This package provides the [sql-other] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python311-pandas-sql-other-2.0.3-1.2.noarch.rpm"
RPM_HASH = "2da2474ee04822e8c0b4cbd934bf4f3f8dced4797990a115bcaaa7c062d3fdf5f5ab83c2e087e63ed1ec1ac35188719ac1105b8c2ae5730c0e5a98a6c48a16d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-sql-other \
python311-pandas-sql-other"

RDEPENDS:${PN} += "python311-SQLAlchemy \
python311-pandas"

inherit rpm
