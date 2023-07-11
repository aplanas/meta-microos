SUMMARY = "A Program to View PostScript Files"
DESCRIPTION = "GV offers you an X Window System GUI for viewing PostScript files. This \
is an X Window System interface to ghostscript. \
 \
 \
 \
Authors: \
-------- \
    Tim Theisen <tim@cs.wisc.edu> \
    Johannes Plass <plass@dipmza.physik.uni-mainz.de>"
LICENSE = "GPL-3.0-or-later"

PV = "3.7.4"

RPM_NAME = "gv-3.7.4-5.21.aarch64.rpm"
RPM_HASH = "01ed3175a655458fb8495e96f5a5e01b33d988d33d710b57b490d444f2fb782549dc991f50f1e5a6e61bebf498f4f30ca2296d012318267b764f1cb6e631cf5e"

RPROVIDES:${PN} += "config-gv \
gv"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
ghostscript-x11 \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw3d.so.8 \
libXinerama.so.1 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6 \
libm.so.6 \
libzio.so.1"

inherit rpm
