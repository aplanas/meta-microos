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

RPM_NAME = "perl-Filesys-Df-0.92-16.36.aarch64.rpm"
RPM_HASH = "ecea14d7bdcc89af34319ab2d12f95845b3a67294f8d8733d1dc4998d5df8f904b5eb523d5e813e560f937a7d1baf537c84fae1818d962cb28212ce491acaa7d"

RPROVIDES:${PN} += "perl(Filesys::Df) \
perl-Filesys-Df \
perl-Filesys-Df(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
