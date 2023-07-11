SUMMARY = "Library to write SQL queries"
DESCRIPTION = "python-sql is a library to write SQL queries in a pythonic way."
LICENSE = "BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "python311-python-sql-1.4.0-1.6.noarch.rpm"
RPM_HASH = "0b8795b0cb62ab673354292d7d167cd1d46af24938ff7bdea31c8ad817dfc75725f0c0ba95cd4bd904afa48b090c225f1cb5552ad45c3db3f98adf0d77f6fcf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-sql \
python3.11dist-python-sql \
python311-python-sql \
python3dist-python-sql"

RDEPENDS:${PN} += "python-abi"

inherit rpm
