SUMMARY = "Non-validating SQL parser"
DESCRIPTION = "sqlparse is a non-validating SQL parser module.  It provides support for \
parsing, splitting and formatting SQL statements."
LICENSE = "BSD-3-Clause"

PV = "0.4.4"

RPM_NAME = "python311-sqlparse-0.4.4-2.3.noarch.rpm"
RPM_HASH = "cc210a8507a7f0538a7f4a1a94911221a441cdae5f0bc6b7294eab9566ddbbe26f20b50c1de80bceb9d6ecc32a5316b23b6111249a20b80a1a8c701bee5b4c5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sqlparse \
python3.11dist-sqlparse \
python311-sqlparse \
python3dist-sqlparse"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
