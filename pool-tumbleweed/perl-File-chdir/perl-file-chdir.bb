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

RPM_NAME = "perl-File-chdir-0.1011-1.12.noarch.rpm"
RPM_HASH = "31fe15d4f41bb629c0df28a80c5292e55c70702672b3701549f8f6d05972ac09962ae77f5bcc740814fe6e5e20d5c7f2678b863eb38139e47ff06fbee252b6ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--chdir \
perl-File--chdir--ARRAY \
perl-File--chdir--SCALAR \
perl-File-chdir"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Cwd \
perl-File--Spec--Functions"

inherit rpm
