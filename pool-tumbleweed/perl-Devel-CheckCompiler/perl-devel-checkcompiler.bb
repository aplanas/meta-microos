SUMMARY = "Check the compiler's availability"
DESCRIPTION = "Devel::CheckCompiler is checker for compiler's availability."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.07"

RPM_NAME = "perl-Devel-CheckCompiler-0.07-1.22.noarch.rpm"
RPM_HASH = "4de8cee444b535ef4c05888c417f8e520226f09dca6f53e11210bb878c561ef1ef92b162adadf85faff17b194939fc10fe2cfb0b030d117c8d6342010e59a982"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--AssertC99 \
perl-Devel--CheckCompiler \
perl-Devel-CheckCompiler"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-ExtUtils--CBuilder \
perl-parent"

inherit rpm
