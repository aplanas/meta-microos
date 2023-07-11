SUMMARY = "Framework to facilitate creation of command line applications"
DESCRIPTION = "App::Rad is a framework for developing \
command-line applications. It can transform Perl _one-liners_ \
into subroutines than can be called by the user of your \
program. \
 \
It also provides an interface for common command-line \
tasks."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.05"

RPM_NAME = "perl-App-Rad-1.05-1.24.noarch.rpm"
RPM_HASH = "d5f24b7e0b7db36c6ccac99dcadc362dbc86c5e704f4504cfc4f8cd6789df9a591fa0e2b7a74b339aed9b5d132e6ed7bf34bd602c37827c669c3d6ccdab34bd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-App--Rad \
perl-App--Rad--Config \
perl-App--Rad--Exclude \
perl-App--Rad--Help \
perl-App--Rad--Include \
perl-App-Rad"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Getopt--Long"

inherit rpm
