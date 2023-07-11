SUMMARY = "Selection of utilities for data and data types"
DESCRIPTION = "This module provides utility functions for data and data types, including \
functions for subroutines and symbol table hashes (stashes). \
 \
This module makes for a pure Perl and XS implementation. \
 \
However, if you want to use the full capacity of it, we recommend you to \
opt for the XS backend. \
 \
There are many benchmarks in the _DIST-DIR/benchmark/_ directory."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.67"

RPM_NAME = "perl-Data-Util-0.67-1.9.aarch64.rpm"
RPM_HASH = "e0e3eb039858e280c47dfbb1f502391d65d54029f140e575fb28e58eb6030f6d797365a8bb35e2a45951a9e5f2e69ff28592c552e35a8eea0b3750422e3c370a"

RPROVIDES:${PN} += "perl-Data--Util \
perl-Data--Util--Error \
perl-Data--Util--PurePerl \
perl-Data-Util"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
