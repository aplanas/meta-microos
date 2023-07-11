SUMMARY = "Check That a Command Is Available"
DESCRIPTION = "Devel::CheckBin is a perl module that checks whether a particular command \
is available."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.04"

RPM_NAME = "perl-Devel-CheckBin-0.04-1.27.noarch.rpm"
RPM_HASH = "a2129f957f5acbf58736ea657088819f44ff3e23446214be153bcac470b2e9a8a9f0a80f5c6d2c15b3af5b2dcdd0098d052cd9a8d56d5e44a0db25f4dc7c9035"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--CheckBin \
perl-Devel-CheckBin"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-ExtUtils--MakeMaker \
perl-parent"

inherit rpm
