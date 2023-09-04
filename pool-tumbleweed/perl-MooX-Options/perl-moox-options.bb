SUMMARY = "Explicit Options eXtension for Object Class"
DESCRIPTION = "Create a command line tool with your Moo, Moose objects. \
 \
Everything is explicit. You have an 'option' keyword to replace the usual \
'has' to explicitly use your attribute into the command line. \
 \
The 'option' keyword takes additional parameters and uses \
Getopt::Long::Descriptive to generate a command line tool."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "4.103"

RPM_NAME = "perl-MooX-Options-4.103-1.14.noarch.rpm"
RPM_HASH = "056f3b96efa6cb78f0bfb176bef8ac4f910fdde283cb5206e60da05013984af8d8a759bfe531cdca5318d7b9d9b3c4127f01ab7ba963a27c9bbab0104b45ce07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooX--Options \
perl-MooX--Options--Descriptive \
perl-MooX--Options--Descriptive--Usage \
perl-MooX--Options--Role \
perl-MooX-Options"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Getopt--Long \
perl-Getopt--Long--Descriptive \
perl-MRO--Compat \
perl-Module--Runtime \
perl-Moo \
perl-MooX--Locale--Passthrough \
perl-Path--Class \
perl-Text--LineFold \
perl-strictures"

inherit rpm
