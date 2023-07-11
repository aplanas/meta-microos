SUMMARY = "A 2D-Plot-Program for Visualisation of Scientific Data"
DESCRIPTION = "Grace is a WYSIWYG 2D plotting tool for the X Window System and M*tif. \
Grace is a descendant of ACE/gr, also known as Xmgr. It knows a lot of \
different graph types and supports a lot of output formats. \
 \
For examples, see /usr/lib/xmgrace/examples."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.25"

RPM_NAME = "xmgrace-5.1.25-4.7.aarch64.rpm"
RPM_HASH = "0cf0166194d55c0f7aa24df90d52c26f5e5b814894a4eff76735f3c5d7273d3d0b5983b6262a8ade916ee4c4d24b376b2c15c1bbb58c608241e53e28b42d918e"

RPROVIDES:${PN} += "xmgrace"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXm.so.4 \
libXt.so.6 \
libc.so.6 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16"

inherit rpm
