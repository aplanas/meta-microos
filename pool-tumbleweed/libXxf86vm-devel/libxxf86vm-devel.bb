SUMMARY = "Development files for the XFree86-VidMode X extension library"
DESCRIPTION = "These functions provide aninterface to the server extension \
XFree86-VidModeExtension which allows the video modes to be queried \
and adjusted dynamically and mode switching to be controlled. \
 \
This package contains the development headers for the library found \
in libXxf86vm1."
LICENSE = "MIT"

PV = "1.1.5"

RPM_NAME = "libXxf86vm-devel-1.1.5-1.2.aarch64.rpm"
RPM_HASH = "8ef4979b8d8214c4d2ca166b831e345f9f2494dfd195135ecac315a31a7782cd4846ffc85121d89260d873001238952c2b2771c70f001a0981d278f48d2916a0"

RPROVIDES:${PN} += "libXxf86vm-devel \
libXxf86vm-devel(aarch-64) \
pkgconfig(xxf86vm)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXxf86vm1 \
pkgconfig(x11) \
pkgconfig(xext) \
pkgconfig(xf86vidmodeproto)"

inherit rpm
