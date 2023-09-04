SUMMARY = "List modules and versions loaded if tests fail"
DESCRIPTION = "Assuming you shipped your module to CPAN with working tests, test failures \
from at http://www.cpantesters.org/ might be due to platform issues, Perl \
version issues or problems with dependencies. This module helps you \
diagnose deep dependency problems by showing you exactly what modules and \
versions were loaded during a test run."
LICENSE = "Apache-2.0"

PV = "0.010"

RPM_NAME = "perl-Test-DiagINC-0.010-1.5.noarch.rpm"
RPM_HASH = "f0af444073d4e30c920e92b57441e039b57d59a4030bd4248733a8d049e17549731e3831aae795ef9a829b07203f504647a4c55b9bf6e53b2b4f18cc3855b5c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--DiagINC \
perl-Test-DiagINC"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
