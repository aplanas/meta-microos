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

RPM_NAME = "perl-Clone-0.46-1.4.aarch64.rpm"
RPM_HASH = "3e5e6eef3f3f73742ce7fd760ef774bb3d3f9f57f0a91fde2eb11741b2c56b87085365e7eb8b097457c5a262bf8addea5e8f0471e63eefadb178a86c659995b0"

RPROVIDES:${PN} += "perl-Clone"

RDEPENDS:${PN} += "libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
