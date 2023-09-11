SUMMARY = "The python pandas[sql-other] extra"
DESCRIPTION = "This package provides the [sql-other] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python39-pandas-sql-other-2.0.3-1.3.noarch.rpm"
RPM_HASH = "f0592ff98a349c5e3860333a1edec6dfd295a6207fe43fc9657fada909bf488e8f6d149c4a97d962dd7a6627233a47022b5e4ad398352c6dfca8d5a9ed0d9d40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-sql-other"

RDEPENDS:${PN} += "python39-SQLAlchemy \
python39-pandas"

inherit rpm
