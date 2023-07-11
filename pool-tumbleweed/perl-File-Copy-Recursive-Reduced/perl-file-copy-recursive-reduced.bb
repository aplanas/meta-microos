SUMMARY = "Recursive copying of files and directories within Perl 5 toolchain"
DESCRIPTION = "This library is intended as a not-quite-drop-in replacement for certain \
functionality provided by CPAN distribution \
File-Copy-Recursive|http://search.cpan.org/dist/File-Copy-Recursive/. The \
library provides methods similar enough to that distribution's 'fcopy()', \
'dircopy()' and 'rcopy()' functions to be usable in those CPAN \
distributions often described as being part of the Perl toolchain."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.006"

RPM_NAME = "perl-File-Copy-Recursive-Reduced-0.006-1.16.noarch.rpm"
RPM_HASH = "9e9677e28820c4a8b5d6b89e83f9becfffa34b58c3de4b8e7e56be1af30eab67bfb12fcf92b8c3f0c101d2739db2ebf0f5ae65689ac358fef90c1a85b81f2e89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Copy--Recursive--Reduced \
perl-File-Copy-Recursive-Reduced"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
