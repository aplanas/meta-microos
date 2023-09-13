SUMMARY = "The python pandas[sql-other] extra"
DESCRIPTION = "This package provides the [sql-other] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python310-pandas-sql-other-2.1.0-1.2.noarch.rpm"
RPM_HASH = "36f31bb15e7ce088d79079636f7a4b3ca17792c2474194355471b05c4ef15d4359a8fa49b87160e9c649bfa172aea8dff4a52f45a75c5cc6ddc688666ef1e10c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-sql-other"

RDEPENDS:${PN} += "python310-SQLAlchemy \
python310-pandas"

inherit rpm
