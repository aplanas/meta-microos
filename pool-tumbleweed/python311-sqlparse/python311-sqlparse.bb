SUMMARY = "Non-validating SQL parser"
DESCRIPTION = "sqlparse is a non-validating SQL parser module.  It provides support for \
parsing, splitting and formatting SQL statements."
LICENSE = "BSD-3-Clause"

PV = "0.4.4"

RPM_NAME = "python311-sqlparse-0.4.4-1.1.noarch.rpm"
RPM_HASH = "7e19e18ba74979c29ecca04a06c73fbca87c5b9feb5a6a66da0b71683ece71049a2ae544343b741a737c70de4851ecc8e30849a067b4d84660ef85c9f76b8e85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-sqlparse \
python311-sqlparse \
python3dist-sqlparse"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
update-alternatives"

inherit rpm
