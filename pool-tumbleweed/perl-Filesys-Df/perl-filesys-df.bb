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

RPM_NAME = "perl-Filesys-Df-0.92-16.38.aarch64.rpm"
RPM_HASH = "3813a717ae6c1f82b8f7828b99a907bbf6d96b3aac2f1a671fb69f4486fd7aa97944237daf5abb01bbdf9688766266c7e12430b6e78d25e23d18411406d2530b"

RPROVIDES:${PN} += "perl-Filesys--Df \
perl-Filesys-Df"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
