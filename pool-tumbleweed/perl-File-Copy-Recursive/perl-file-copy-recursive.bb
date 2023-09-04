SUMMARY = "Perl extension for recursively copying files and directories"
DESCRIPTION = "This module copies and moves directories recursively (or single files, \
well... singley) to an optional depth and attempts to preserve each file or \
directory's mode."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.45"

RPM_NAME = "perl-File-Copy-Recursive-0.45-1.17.noarch.rpm"
RPM_HASH = "4f8081f7786114cf02990ce14cf4cbf94f0af979afd2ab253f968eef1bd460ca5424f957071a649bb58611375ad47b4033b39184d4d6372ca72e480e6a2bacf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Copy--Recursive \
perl-File-Copy-Recursive"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
