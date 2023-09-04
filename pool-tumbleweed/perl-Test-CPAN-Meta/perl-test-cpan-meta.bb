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

RPM_NAME = "perl-Test-CPAN-Meta-0.25-2.16.noarch.rpm"
RPM_HASH = "aa0c2dec15e9e21ac62a2e6ee630f42227d5797f60517e5540b229c3f1b6f592d2c5efd9223ab7039d848bc5b6eb63b1e5709c088d4d85db1b6f495726ebfdd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--CPAN--Meta \
perl-Test--CPAN--Meta--Version \
perl-Test-CPAN-Meta"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Parse--CPAN--Meta \
perl-Test--More"

inherit rpm
