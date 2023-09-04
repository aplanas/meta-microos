SUMMARY = "Recursive copying of files and directories within Perl 5 toolchain"
DESCRIPTION = "This library is intended as a not-quite-drop-in replacement for certain \
functionality provided by CPAN distribution \
File-Copy-Recursive|http://search.cpan.org/dist/File-Copy-Recursive/. The \
library provides methods similar enough to that distribution's 'fcopy()', \
'dircopy()' and 'rcopy()' functions to be usable in those CPAN \
distributions often described as being part of the Perl toolchain."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.006"

RPM_NAME = "perl-File-Copy-Recursive-Reduced-0.006-1.17.noarch.rpm"
RPM_HASH = "230986390597bad8da54e6c04f63972657e4031c09874137ea190b63b45669c13e21274ec795b0117c80b2056bc400a6cd4be267beb3934fc4b544b374b2a940"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Copy--Recursive--Reduced \
perl-File-Copy-Recursive-Reduced"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
