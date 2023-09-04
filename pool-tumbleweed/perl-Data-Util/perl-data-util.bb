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

RPM_NAME = "perl-Data-Util-0.67-1.10.aarch64.rpm"
RPM_HASH = "2db8e803813a6f59c88712d3fc62613f2592c0fc55f8346fe3a1cc397b6b8828f86ed9417f5ba5a6020019dba68918e672f7184ac3adaa53a7080de5edfa9130"

RPROVIDES:${PN} += "perl-Data--Util \
perl-Data--Util--Error \
perl-Data--Util--PurePerl \
perl-Data-Util"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
