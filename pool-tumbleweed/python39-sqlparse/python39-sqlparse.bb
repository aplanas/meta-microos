SUMMARY = "Non-validating SQL parser"
DESCRIPTION = "sqlparse is a non-validating SQL parser module.  It provides support for \
parsing, splitting and formatting SQL statements."
LICENSE = "BSD-3-Clause"

PV = "0.4.4"

RPM_NAME = "python39-sqlparse-0.4.4-2.3.noarch.rpm"
RPM_HASH = "361223a437149674953b24134c42726f0c3fe83e912ee245ef90dddc2ecf7e2bd2dd1ab38838ed17ec2c163c44c55445de8484dd6314400ecc305baaf8cf32ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sqlparse \
python39-sqlparse \
python3dist-sqlparse"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
