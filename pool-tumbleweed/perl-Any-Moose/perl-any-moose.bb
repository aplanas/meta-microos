SUMMARY = "(DEPRECATED) use Moo instead!"
DESCRIPTION = "(DEPRECATED) use Moo instead!"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.27"

RPM_NAME = "perl-Any-Moose-0.27-1.25.noarch.rpm"
RPM_HASH = "58d0c00377c8ce137b7bc169ed3ed09d280992ee0e25dcc3df2702798b0400a40351a89de7466619762011e3a70743c6714cae1037c42d4661abb1e7f8ec6add"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Any--Moose \
perl-Any-Moose"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Moose"

inherit rpm
