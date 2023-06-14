SUMMARY = "Check the compiler's availability"
DESCRIPTION = "Devel::CheckCompiler is checker for compiler's availability."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.07"

RPM_NAME = "perl-Devel-CheckCompiler-0.07-1.21.noarch.rpm"
RPM_HASH = "719f464956ee6e54c17252a123197d8eedc2e1285cae25adc3d2ef89c0f500be3fd8c790d1327499972ef5f0754e6c69dcdb9f0fdac766b48a17f5b02548016e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--AssertC99 \
perl-Devel--CheckCompiler \
perl-Devel-CheckCompiler"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-ExtUtils--CBuilder \
perl-parent"

inherit rpm
