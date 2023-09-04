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

RPM_NAME = "perl-Module-Build-Tiny-0.046-1.2.noarch.rpm"
RPM_HASH = "8d6b34169e90367d9c43c02c38c345d0814ae2dec0471ba05c1908a8be93b3568e56bb05649eca4cb1d967e26b2af5d08bdc4a562219f2ebb12936c4b1f4adb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Build--Tiny \
perl-Module-Build-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
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
