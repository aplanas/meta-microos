SUMMARY = "Andrew's monotone chain algorithm for finding a convex hull in 2D"
DESCRIPTION = "This is somewhat experimental still. \
 \
This (XS) module optionally exports a single function 'convex_hull' which \
calculates the convex hull of the input points and returns it. The \
algorithm is 'O(n log n)' due to having to sort the input list, but should \
be somewhat faster than a plain Graham's scan (also 'O(n log n)') in \
practice since it avoids polar coordinates."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.01"

RPM_NAME = "perl-Math-ConvexHull-MonotoneChain-0.01-3.38.aarch64.rpm"
RPM_HASH = "2a78deb22e1b6955303b15b722666229dbaf8c304b5b80e6eebf7115d8facf29fa8de3e3d68996976a1d4541d870c6215cf1fd3805942806a148f1a573d688ed"

RPROVIDES:${PN} += "perl-Math--ConvexHull--MonotoneChain \
perl-Math-ConvexHull-MonotoneChain"

RDEPENDS:${PN} += "libc.so.6 \
perl--MODULE-COMPAT-5.38.0 \
perl-Test--More"

inherit rpm
