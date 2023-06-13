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

RPM_NAME = "perl-Test-CPAN-Meta-0.25-2.14.noarch.rpm"
RPM_HASH = "69d6f85208ee9e5eee37a7017bb28f3d56d6490b9d3bdc39254ac8e67fd6722dcd1133f3f23bce58d7c922611690308fb611445d106b6d13c81c1d1b9b6a9cff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::CPAN::Meta) \
perl(Test::CPAN::Meta::Version) \
perl-Test-CPAN-Meta"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Parse::CPAN::Meta) \
perl(Test::More)"

inherit rpm
