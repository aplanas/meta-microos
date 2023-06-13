SUMMARY = "A tiny replacement for Module::Build"
DESCRIPTION = "Many Perl distributions use a Build.PL file instead of a Makefile.PL file \
to drive distribution configuration, build, test and installation. \
Traditionally, Build.PL uses Module::Build as the underlying build system. \
This module provides a simple, lightweight, drop-in replacement. \
 \
Whereas Module::Build has over 6,700 lines of code; this module has less \
than 120, yet supports the features needed by most distributions."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.039"

RPM_NAME = "perl-Module-Build-Tiny-0.039-1.24.noarch.rpm"
RPM_HASH = "2dc40276ab8d67fcad359d9a25107b5edc4fb2b6d0f0321d5cd07369ef71ce2291a2c7dc448173b8ae1e457732e363df3f623abc42d526602146727a525d2e88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Module::Build::Tiny) \
perl-Module-Build-Tiny"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(CPAN::Meta) \
perl(ExtUtils::CBuilder) \
perl(ExtUtils::Config) \
perl(ExtUtils::Helpers) \
perl(ExtUtils::InstallPaths) \
perl(ExtUtils::ParseXS) \
perl(Getopt::Long) \
perl(JSON::PP) \
perl(TAP::Harness::Env)"

inherit rpm
