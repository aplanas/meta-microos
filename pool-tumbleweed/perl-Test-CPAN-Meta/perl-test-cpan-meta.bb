SUMMARY = "Validate your CPAN META.yml files"
DESCRIPTION = "This distribution was written to ensure that a META.yml file, provided with \
a standard distribution uploaded to CPAN, meets the specifications that are \
slowly being introduced to module uploads, via the use of package makers \
and installers such as the ExtUtils::MakeMaker manpage, the Module::Build \
manpage and the Module::Install manpage. \
 \
See the CPAN::Meta manpage for further details of the CPAN Meta \
Specification."
LICENSE = "Artistic-2.0"

PV = "0.25"

RPM_NAME = "perl-Test-CPAN-Meta-0.25-2.15.noarch.rpm"
RPM_HASH = "09ff2c73c2e1e8288d9ce4562e8eab0fabfd5a70943020616dbd8db0d4f8bdb94a52d31b4f031bc661bc1c388a7f18575e36c47fc747f15a968b5baf44c21efc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--CPAN--Meta \
perl-Test--CPAN--Meta--Version \
perl-Test-CPAN-Meta"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Parse--CPAN--Meta \
perl-Test--More"

inherit rpm
