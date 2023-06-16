SUMMARY = "A morphing program"
DESCRIPTION = "This morphing program reads two images in Targa format and computes the \
transitions from one image to the other (arbitrarily many steps). To \
avoid a simple fading effect, the program needs information about the \
shapes contained in the two images. This is done by using a grid \
consisting of connected checkpoints. The source grid is then \
transformed into the destination grid during the morphing process."
LICENSE = "GPL-2.0-or-later"

PV = "20060817"

RPM_NAME = "xmorph-20060817-250.9.aarch64.rpm"
RPM_HASH = "0be3bc7284d58562cd95b81a143ff166b7e40ab0e5f539924df4ddae8f44afdaeb9033ea70ce3315e45da7ce336a9341667ee68a5d3cccecec4e6555fbd0e230"

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
