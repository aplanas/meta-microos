SUMMARY = "The python pandas[sql-other] extra"
DESCRIPTION = "This package provides the [sql-other] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python311-pandas-sql-other-2.1.0-1.2.noarch.rpm"
RPM_HASH = "4987c7ceaefaefb6d9c7270fa0976d6ad4211213f0782c693d17ee7eeacedecbf4260d44e6ce0381bedd35fe24d3a6d733b8c2268ccffe60f69acde7098497fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-sql-other \
python311-pandas-sql-other"

RDEPENDS:${PN} += "python311-SQLAlchemy \
python311-pandas"

inherit rpm
