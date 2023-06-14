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

RPM_NAME = "perl-Hash-Ordered-0.014-1.1.noarch.rpm"
RPM_HASH = "fca61b0bca8774f491ca8660728e88f78a6bbfa39313cab10eb9ae237a6ccb825167de2f4de15f6e8c60e085618c1e026972e09fb3c347eeccd85d432b30ac88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Hash--Ordered \
perl-Hash-Ordered"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
