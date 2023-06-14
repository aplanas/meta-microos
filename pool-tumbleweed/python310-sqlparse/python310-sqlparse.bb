SUMMARY = "Non-validating SQL parser"
DESCRIPTION = "sqlparse is a non-validating SQL parser module.  It provides support for \
parsing, splitting and formatting SQL statements."
LICENSE = "BSD-3-Clause"

PV = "0.4.4"

RPM_NAME = "python310-sqlparse-0.4.4-1.1.noarch.rpm"
RPM_HASH = "073ec2e40e50935318c0d901edeb90a8604a11b7efaecb209227fcc7c0c7ccc24ca5b7615e232ec4f15cb351be48d11e9ba05f067db29d7a53dd229bc93b2bbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sqlparse \
python3.10dist-sqlparse \
python310-sqlparse \
python3dist-sqlparse"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
update-alternatives"

inherit rpm
