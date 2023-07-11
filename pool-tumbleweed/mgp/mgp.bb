SUMMARY = "MagicPoint, an X Window System Presentation Tool"
DESCRIPTION = "MagicPoint is an X Window System presentation tool. It is designed to \
make simple presentations easy while making complicated presentations \
possible. Its presentation file (the suffix is typically .mgp) is plain \
text so that you can create presentation files quickly with your \
favorite editor (Emacs, for example). The package also includes the \
tools mgp2html, mgp2ps, and mgp2latex, which convert mgp presentations \
into other file formats."
LICENSE = "BSD-3-Clause"

PV = "1.13a"

RPM_NAME = "mgp-1.13a-121.11.aarch64.rpm"
RPM_HASH = "ae04141c44ebaafbb954107866db4bd338bc20887f27766a2f4868a89986d052ab4631ff799b2d2048e61184fb19d1ea6b6127598590906c4879081dc9b130a2"

RPROVIDES:${PN} += "magicpoint \
mgp"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libImlib2.so.1 \
libX11.so.6 \
libXft.so.2 \
libc.so.6 \
libm.so.6 \
perl \
sharutils"

inherit rpm
