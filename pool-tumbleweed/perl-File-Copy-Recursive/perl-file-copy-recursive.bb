SUMMARY = "Perl extension for recursively copying files and directories"
DESCRIPTION = "This module copies and moves directories recursively (or single files, \
well... singley) to an optional depth and attempts to preserve each file or \
directory's mode."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.45"

RPM_NAME = "perl-File-Copy-Recursive-0.45-1.16.noarch.rpm"
RPM_HASH = "fcafc260cf3a669e2924126d5f423bf5dc006f98af9ed07a6a14e2424225dda0780d418f9056ce655d5935b33d17e81ea5da71791e20581f825967b0434585cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Copy--Recursive \
perl-File-Copy-Recursive"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
