SUMMARY = "Library to write UTF-8 strings to Postscript stream"
DESCRIPTION = "libLASi is a library written that provides a C++ stream output \
interface for creating Postscript documents that can contain \
characters from any of the scripts and symbol blocks supported in \
Unicode and by the Pango layout engine. The library accomodates \
right-to-left scripts, Complex Text Layout scripts, as supported to \
the extent provided by Pango and by the OpenType fonts installed on \
your system. \
 \
This package provides the shared libraries for LASi."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.3"

RPM_NAME = "libLASi2-1.1.3-4.5.aarch64.rpm"
RPM_HASH = "4b603619736cf105b07002a199000a869e3e1f77bede3927964cb78a6d98eeb2d8ddd2f942846088b551573af1b8697ad29141afbbfbdda93637af45eefe8d76"

RPROVIDES:${PN} += "libLASi.so.2 \
libLASi2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpango-1.0.so.0 \
libpangoft2-1.0.so.0 \
libstdc++.so.6"

inherit rpm
