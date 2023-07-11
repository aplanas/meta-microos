SUMMARY = "Development files for the XFree86-DGA extension library"
DESCRIPTION = "libXxf86dga provides the XFree86-DGA extension, which allows direct \
graphics access to a framebuffer-like region, and also allows \
relative mouse reporting, et al. It is mainly used by games and \
emulators for games. \
 \
This package contains the development headers for the library found \
in libXxf86dga1."
LICENSE = "MIT"

PV = "1.1.6"

RPM_NAME = "libXxf86dga-devel-1.1.6-1.3.aarch64.rpm"
RPM_HASH = "9f828772b1862603ce702946b39674f40d6c71ea5ac8c036df49dc0e34423e3847a2ec49eada59e40ff3a329d37374267eca5160598c5e59ef88e4ed2dafafd6"

RPROVIDES:${PN} += "libXxf86dga-devel \
pkgconfig-xxf86dga"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXxf86dga1 \
pkgconfig-x11 \
pkgconfig-xext \
pkgconfig-xf86dgaproto"

inherit rpm
