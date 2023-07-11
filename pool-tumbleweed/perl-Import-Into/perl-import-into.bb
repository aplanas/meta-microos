SUMMARY = "Import packages into other packages"
DESCRIPTION = "Writing exporters is a pain. Some use the Exporter manpage, some use the \
Sub::Exporter manpage, some use the Moose::Exporter manpage, some use the \
Exporter::Declare manpage ... and some things are pragmas. \
 \
Exporting on someone else's behalf is harder. The exporters don't provide a \
consistent API for this, and pragmas need to have their import method \
called directly, since they effect the current unit of compilation. \
 \
'Import::Into' provides global methods to make this painless."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.002005"

RPM_NAME = "perl-Import-Into-1.002005-1.25.noarch.rpm"
RPM_HASH = "f4d4c3e68ebd9e448f57288d2274e6188b9e1b27e2594821d0fb5f9d1da5717e844c9a19e7c9562c77e026db394869e33dc407bed4897123386d231338543d49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Import--Into \
perl-Import-Into"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Module--Runtime"

inherit rpm
