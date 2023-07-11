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

RPM_NAME = "perl-Math-ConvexHull-MonotoneChain-0.01-3.37.aarch64.rpm"
RPM_HASH = "070936327442e53bbd58b62dc85b0baabc5dab3b08517c1cf2bc5c2506bd49215bb72fa9c8ab8dc8d91ee2d0d199ef6e982f3ead65df73a8b225e12cc4b21b1c"

RPROVIDES:${PN} += "perl-Math--ConvexHull--MonotoneChain \
perl-Math-ConvexHull-MonotoneChain"

RDEPENDS:${PN} += "libc.so.6 \
perl--MODULE-COMPAT-5.36.1 \
perl-Test--More"

inherit rpm
