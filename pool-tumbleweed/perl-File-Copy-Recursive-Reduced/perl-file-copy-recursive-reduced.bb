SUMMARY = "Recursive copying of files and directories within Perl 5 toolchain"
DESCRIPTION = "This library is intended as a not-quite-drop-in replacement for certain \
functionality provided by CPAN distribution \
File-Copy-Recursive|http://search.cpan.org/dist/File-Copy-Recursive/. The \
library provides methods similar enough to that distribution's 'fcopy()', \
'dircopy()' and 'rcopy()' functions to be usable in those CPAN \
distributions often described as being part of the Perl toolchain."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.006"

RPM_NAME = "perl-File-Copy-Recursive-Reduced-0.006-1.15.noarch.rpm"
RPM_HASH = "bf389556ec6001babdba436a21906a021cbef6a2221989b01066fcc19b2e91a98eacb5aa64a3c2286249f311730c321e3f481a1d4e11b763112b41dc35abd262"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Copy--Recursive--Reduced \
perl-File-Copy-Recursive-Reduced"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
