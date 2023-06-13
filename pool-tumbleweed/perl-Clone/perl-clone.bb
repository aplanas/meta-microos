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

RPM_NAME = "perl-Clone-0.46-1.2.aarch64.rpm"
RPM_HASH = "e02ed0232f2bb62cb709f716c6671f39f757e22619daa2a0b9082bd62a68e65d8aa21e67e5b3fa5481e3b7177cf707cbd29289b07e758920ee36158987232bc4"

RPROVIDES:${PN} += "perl(Clone) \
perl-Clone \
perl-Clone(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
