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

RPM_NAME = "perl-Import-Into-1.002005-1.26.noarch.rpm"
RPM_HASH = "f8c3ff957cdaa7bc8ed2c15bfcf9070a0a8b774f3b8d890e143dabf2e8498b50ff36fd071919eaaba86b99e440ba1eb9a5f59d9584d61ec578438531775877f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Import--Into \
perl-Import-Into"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Module--Runtime"

inherit rpm
