SUMMARY = "Calculate convex hulls using Graham's scan (n*log(n))"
DESCRIPTION = "'Math::ConvexHull' is a simple module that calculates convex hulls from a \
set of points in 2D space. It is a straightforward implementation of the \
algorithm known as Graham's scan which, with complexity of O(n*log(n)), is \
the fastest known method of finding the convex hull of an arbitrary set of \
points. There are some methods of eliminating points that cannot be part of \
the convex hull. These may or may not be implemented in a future version. \
 \
The implementation cannot deal with duplicate points. Therefore, points \
which are very, very close (think floating point close) to the previous \
point are dropped since version 1.02 of the module. However, if you pass in \
randomly ordered data which contains duplicate points, this safety measure \
might not help you. In that case, you will have to remove duplicates \
yourself."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.04"

RPM_NAME = "perl-Math-ConvexHull-1.04-3.27.noarch.rpm"
RPM_HASH = "a1ee692ff14518bd0f841d2b7c71d437df95e7ad755e3bfe9edd89915ded38dca223b876a80eefab24052eba819b4bba5967aad0a1e2c77c53ad664a1513958e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Math--ConvexHull \
perl-Math-ConvexHull"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
