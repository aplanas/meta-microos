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

RPM_NAME = "perl-Math-ConvexHull-MonotoneChain-0.01-3.36.aarch64.rpm"
RPM_HASH = "bd7a0de16095a5d343faa8ea70c51c23b7327cca137a7d0c4111fecb45217164258a81a7622a701016a36afd1ca74eaab788f009d1df7147f61928c38fa5a0d0"

RPROVIDES:${PN} += "perl(Math::ConvexHull::MonotoneChain) \
perl-Math-ConvexHull-MonotoneChain \
perl-Math-ConvexHull-MonotoneChain(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) \
perl(:MODULE_COMPAT_5.36.0) \
perl(Test::More)"

inherit rpm
