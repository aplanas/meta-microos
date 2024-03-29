SUMMARY = "A language for scientific illustration"
DESCRIPTION = "Gri is a language for scientific graphics programming.  It is a \
command-driven application, as opposed to a click/point application. \
It is analogous to latex, and shares the property that extensive power \
is the reward for tolerating a modest learning curve.  Gri output is \
in industry-standard PostScript, suitable for incorporation in \
documents prepared by various text processors. \
 \
Gri can make x-y graphs, contour-graphs, and image graphs.  In \
addition to high-level capabilities, it has enough low-level \
capabilities to allow users to achieve a high degree of customization. \
Precise control is extended to all aspects of drawing, including \
line-widths, colors, and fonts.  Text includes a subset of the tex \
language, so that it is easy to incorporate Greek letters and \
mathematical symbols in labels."
LICENSE = "GPL-3.0-or-later"

PV = "2.12.23"

RPM_NAME = "gri-2.12.23-23.14.aarch64.rpm"
RPM_HASH = "0bc355c0ad60f6b6a758afbff48e283e2e827c6a96ce9a004564299a839135513e6926d38efc5034ccd4208e17fdcff81ecda82769da87f88401c92204274d66"

RPROVIDES:${PN} += "gri"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libreadline.so.8 \
libstdc++.so.6"

inherit rpm
