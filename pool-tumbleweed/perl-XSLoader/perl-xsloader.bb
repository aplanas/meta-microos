SUMMARY = "Dynamically load C libraries into Perl code"
DESCRIPTION = "This module defines a standard _simplified_ interface to the dynamic \
linking mechanisms available on many platforms. Its primary purpose is to \
implement cheap automatic dynamic loading of Perl modules. \
 \
For a more complicated interface, see DynaLoader. Many (most) features of \
'DynaLoader' are not implemented in 'XSLoader', like for example the \
'dl_load_flags', not honored by 'XSLoader'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.24"

RPM_NAME = "perl-XSLoader-0.24-1.27.aarch64.rpm"
RPM_HASH = "c806677b008ac1a13a41d0cb47c9d075705884fd7425cea23d7eb7acb8d52c574ee4d3f733796adee70df159e18ea5a241598d58e5f22c4f1a6b8dc212dd9bc6"

RPROVIDES:${PN} += "perl-DynaLoader \
perl-XSLoader"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
