SUMMARY = "A morphing program"
DESCRIPTION = "This morphing program reads two images in Targa format and computes the \
transitions from one image to the other (arbitrarily many steps). To \
avoid a simple fading effect, the program needs information about the \
shapes contained in the two images. This is done by using a grid \
consisting of connected checkpoints. The source grid is then \
transformed into the destination grid during the morphing process."
LICENSE = "GPL-2.0-or-later"

PV = "20060817"

RPM_NAME = "xmorph-20060817-250.10.aarch64.rpm"
RPM_HASH = "4c0fc5769c6830a0a93f75ceaf6630e3326ea8321669a9579436049ce0e19abc3c025668fde6cb33277617ac841aee4f6489dd3f61224e810674019a2f79d616"

RPROVIDES:${PN} += "libmorph.so.1 \
xmorph"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXt.so.6 \
libc.so.6 \
libfftw3.so.3 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libstdc++.so.6 \
update-desktop-files"

inherit rpm
