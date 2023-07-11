SUMMARY = "Tool for Composing Images"
DESCRIPTION = "Enblend is a tool for compositing images using a Burt & Adelson \
multiresolution spline. This technique tries to make the seams between \
the input images invisible. The basic idea is that image features \
should be blended across a transition zone, proportional in size to the \
spatial frequency of the features. For example, objects like trees and \
window panes have rapid changes in color. By blending these features in \
a narrow zone, you cannot see the seam because the eye already expects \
to see color changes at the edge of these features. Clouds and sky are \
the opposite. These features must be blended across a wide transition \
zone because any sudden change in color is immediately noticeable."
LICENSE = "GPL-2.0-or-later"

PV = "4.2"

RPM_NAME = "enblend-enfuse-4.2-6.15.aarch64.rpm"
RPM_HASH = "dd2d56b47375b75a5d7ef5a75738799176c306df6e6963c6b8568bc99bb340320cb797411fb0da4793590aaf7324320492f739069d29725e6485d97639692f60"

RPROVIDES:${PN} += "enblend \
enblend-enfuse \
enfuse"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libgsl.so.27 \
libgslcblas.so.0 \
liblcms2.so.2 \
libm.so.6 \
libstdc++.so.6 \
libtiff.so.6 \
libvigraimpex.so.11"

inherit rpm
