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

RPM_NAME = "perl-Module-Build-Tiny-0.039-1.25.noarch.rpm"
RPM_HASH = "3b84e21e2de80fd0482fb3a8e5692c6f3ef935693cebfbc1ec9d519159c7af3a7dd46ed9ec47f9f928463c5211dcc37a308f4b50f105ee0ad286020c6884baef"
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
