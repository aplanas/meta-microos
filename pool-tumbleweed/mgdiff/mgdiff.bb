SUMMARY = "Compare Files Side by Side"
DESCRIPTION = "Mgdiff is a graphical front-end to the Unix diff command based on X11 \
and the Motif widget set. It allows the user to select two files for \
comparison, runs the diff command, parses the output and presents the \
results graphically. \
 \
 \
 \
Authors: \
-------- \
    Daniel Williams <dan@sass.com>"
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "mgdiff-1.0.1-7.27.aarch64.rpm"
RPM_HASH = "c881db214a0f05f2980b081c36cacb31dcec622a44777237e6f23dc4b8039386eb2d272faba0a61fb44a7b83c3cefe8e32b5de1d511daa987ddff6cb8e219d17"

RPROVIDES:${PN} += "application() \
application(mgdiff.desktop) \
mgdiff \
mgdiff(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXm.so.4()(64bit) \
libXt.so.6()(64bit) \
libc.so.6()(64bit)"

inherit rpm
