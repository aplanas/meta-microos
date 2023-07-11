SUMMARY = "Perl extension for filesystem disk space information"
DESCRIPTION = "This module provides a way to obtain filesystem disk space information. \
This is a Unix only distribution. If you want to gather this information \
for Unix and Windows, use Filesys::DfPortable. The only major benefit of \
using Filesys::Df over Filesys::DfPortable, is that Filesys::Df supports \
the use of open filehandles as arguments. \
 \
Authors: \
    Ian Guthrie <IGuthrie@aol.com>"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.92"

RPM_NAME = "perl-Filesys-Df-0.92-16.37.aarch64.rpm"
RPM_HASH = "cb121bdef2c20a858b12eb3edf2747bfea7146cd4fb2e300e2229722b25ecafa69fa5110fc9d71286af452e2c2002d2f9fd68b07ceae20df7cc650fbe9dafe2e"

RPROVIDES:${PN} += "perl-Filesys--Df \
perl-Filesys-Df"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
