SUMMARY = "Tiny replacement for Module::Build"
DESCRIPTION = "Many Perl distributions use a Build.PL file instead of a Makefile.PL file \
to drive distribution configuration, build, test and installation. \
Traditionally, Build.PL uses Module::Build as the underlying build system. \
This module provides a simple, lightweight, drop-in replacement. \
 \
Whereas Module::Build has over 6,700 lines of code; this module has less \
than 200, yet supports the features needed by most distributions."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.046"

RPM_NAME = "perl-Module-Build-Tiny-0.046-1.1.noarch.rpm"
RPM_HASH = "c8cfd7a16dcc68f7ead229b09b0bf426120076d8c8655a2e41a67dcae320e0d206e1dfb5892208196ecb65769f9144686d0917a5e82cd5caa1252434ec940bf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Build--Tiny \
perl-Module-Build-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-CPAN--Meta \
perl-ExtUtils--CBuilder \
perl-ExtUtils--Config \
perl-ExtUtils--Helpers \
perl-ExtUtils--InstallPaths \
perl-ExtUtils--ParseXS \
perl-Getopt--Long \
perl-JSON--PP \
perl-TAP--Harness--Env"

inherit rpm
