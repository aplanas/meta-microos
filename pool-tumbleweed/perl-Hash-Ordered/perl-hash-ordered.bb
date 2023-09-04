SUMMARY = "Fast, pure-Perl ordered hash class"
DESCRIPTION = "This module implements an ordered hash, meaning that it associates keys \
with values like a Perl hash, but keeps the keys in a consistent order. \
Because it is implemented as an object and manipulated with method calls, \
it is much slower than a Perl hash. This is the cost of keeping order. \
 \
However, compared to other *ordered* hash implementations, Hash::Ordered is \
optimized for getting and setting individual elements and is generally \
faster at most other tasks as well. For specific details, see \
Hash::Ordered::Benchmarks."
LICENSE = "Apache-2.0"

PV = "0.014"

RPM_NAME = "perl-Hash-Ordered-0.014-1.3.noarch.rpm"
RPM_HASH = "05f235d717123bb177cd63bc1c63dcdca2168b1c1e1e3aa7190d940f3413ac80a79ebec774726200677ab1b1e73a5fdd81ec3d024c6ae86d65a225f17d4091af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Hash--Ordered \
perl-Hash-Ordered"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
