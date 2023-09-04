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

RPM_NAME = "perl-Math-ConvexHull-1.04-3.28.noarch.rpm"
RPM_HASH = "ac4612d62e25071ebd250a01b1e7e062958b706c1d705847bbf8e19e492add00ab6045b8a62ae29637adad5e99b6d9862f15b452e215e9a1c4fe23b6b401112f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Math--ConvexHull \
perl-Math-ConvexHull"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
