SUMMARY = "Non-validating SQL parser"
DESCRIPTION = "sqlparse is a non-validating SQL parser module.  It provides support for \
parsing, splitting and formatting SQL statements."
LICENSE = "BSD-3-Clause"

PV = "0.4.4"

RPM_NAME = "python310-sqlparse-0.4.4-2.3.noarch.rpm"
RPM_HASH = "14fa8ab3138c7de9400ff6c3ce65af2b393aaa1130742c151f878b2f67093a7f58c44ffa3dd50bce7b8e606eeae968502a0cf742bc8a5f45de12c196d3fc0c2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sqlparse \
python310-sqlparse \
python3dist-sqlparse"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
