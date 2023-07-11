SUMMARY = "List modules and versions loaded if tests fail"
DESCRIPTION = "Assuming you shipped your module to CPAN with working tests, test failures \
from at http://www.cpantesters.org/ might be due to platform issues, Perl \
version issues or problems with dependencies. This module helps you \
diagnose deep dependency problems by showing you exactly what modules and \
versions were loaded during a test run."
LICENSE = "Apache-2.0"

PV = "0.010"

RPM_NAME = "perl-Test-DiagINC-0.010-1.4.noarch.rpm"
RPM_HASH = "fccf7ada8e3acd3ae6b80af89a8c7fbaa06c412cf4acd7b71a718d5cd5a94e69cc93c22da6f87775d6ef968baf1837d89a6ab670037e820d20bb2773ba5cafdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--DiagINC \
perl-Test-DiagINC"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
