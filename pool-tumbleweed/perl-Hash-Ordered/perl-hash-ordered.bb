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

RPM_NAME = "perl-Hash-Ordered-0.014-1.2.noarch.rpm"
RPM_HASH = "9ce67d0ac420aba95a790ee60d3904ac1931a2b624f3f6f2dd95cb9beda85de050e39785605a210d57a6893a80a1704a8188f8db23c3891c7715b66cd031490a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Hash--Ordered \
perl-Hash-Ordered"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
