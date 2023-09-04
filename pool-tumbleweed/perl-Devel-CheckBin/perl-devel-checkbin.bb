SUMMARY = "Check That a Command Is Available"
DESCRIPTION = "Devel::CheckBin is a perl module that checks whether a particular command \
is available."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.04"

RPM_NAME = "perl-Devel-CheckBin-0.04-1.28.noarch.rpm"
RPM_HASH = "66f3092178318829e7fe580553667668566fe5747b07197c22055ff63cdc119a5cea980a0880bc775c26bdcf658e2d0e282a2be35eb683872a88e776ebf8af77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--CheckBin \
perl-Devel-CheckBin"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-ExtUtils--MakeMaker \
perl-parent"

inherit rpm
