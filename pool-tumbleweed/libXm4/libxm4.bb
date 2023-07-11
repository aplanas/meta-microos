SUMMARY = "Motif runtime library"
DESCRIPTION = "This package provides the main Motif shared library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.8"

RPM_NAME = "libXm4-2.3.8-2.5.aarch64.rpm"
RPM_HASH = "da486c6506b6b7c5554fecd45f74e66fb2b6a8c6d463071f05dd263525d975c3597bad25a5a908db39102c30f76f593168353618929813260ae82a19425a3dab"

RPROVIDES:${PN} += "libXm.so.4 \
libXm4 \
openmotif-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXft.so.2 \
libXmu.so.6 \
libXp.so.6 \
libXt.so.6 \
libc.so.6 \
libfontconfig.so.1 \
libjpeg.so.8 \
libpng16.so.16"

inherit rpm
