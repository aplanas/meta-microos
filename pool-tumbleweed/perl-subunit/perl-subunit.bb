SUMMARY = "Perl bindings for subunit"
DESCRIPTION = "Subunit Perl bindings.  See the python3-python-subunit package for test \
processing functionality."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "perl-subunit-1.4.2-3.1.noarch.rpm"
RPM_HASH = "7e1e591ec1452bbab1da60c99c2240da8523081804b5f452efcf180c39a5dedabc4db1034370e97d5a9c590452b46296d8bb3be210d9c44a0613167b644d4470"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Subunit \
perl-Subunit--Diff \
perl-subunit"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-base"

inherit rpm
