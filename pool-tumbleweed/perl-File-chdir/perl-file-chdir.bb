SUMMARY = "More sensible way to change directories"
DESCRIPTION = "Perl's 'chdir()' has the unfortunate problem of being very, very, very \
global. If any part of your program calls 'chdir()' or if any library you \
use calls 'chdir()', it changes the current working directory for the \
*whole* program. \
 \
This sucks. \
 \
File::chdir gives you an alternative, '$CWD' and '@CWD'. These two \
variables combine all the power of 'chdir()', File::Spec and Cwd."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.1011"

RPM_NAME = "perl-File-chdir-0.1011-1.11.noarch.rpm"
RPM_HASH = "3d8497eeb78b4de5dca2a7ab724a09d3c9a4a322c707dedc872049804beaddf86cf0a231809381d5bee8fe3fbca8d78597d0a60193a834690cfd7fd4c6aa12f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--chdir \
perl-File--chdir--ARRAY \
perl-File--chdir--SCALAR \
perl-File-chdir"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Cwd \
perl-File--Spec--Functions"

inherit rpm
