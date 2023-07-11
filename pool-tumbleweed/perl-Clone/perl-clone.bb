SUMMARY = "Recursively copy Perl datatypes"
DESCRIPTION = "This module provides a 'clone()' method which makes recursive copies of \
nested hash, array, scalar and reference types, including tied variables \
and objects. \
 \
'clone()' takes a scalar argument and duplicates it. To duplicate lists, \
arrays or hashes, pass them in by reference, e.g. \
 \
    my $copy = clone (\\@array); \
 \
     \
 \
    my %copy = %{ clone (\\%hash) };"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.46"

RPM_NAME = "perl-Clone-0.46-1.3.aarch64.rpm"
RPM_HASH = "a8cd24726298b213873d54883c9423fb5416bd7d21ef344a29e54489b13560298adf8c8fb385838a484da71117ccb239d4f095736b3ddab7283cd7a1d12b9327"

RPROVIDES:${PN} += "perl-Clone"

RDEPENDS:${PN} += "libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
