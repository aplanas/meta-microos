SUMMARY = "Development files for the X11 authorization protocol library"
DESCRIPTION = "libXau provides mechanisms for individual access to an X Window \
System display. It uses existing core protocol and library hooks for \
specifying authorization data in the connection setup block to \
restrict use of the display to only those clients that show that they \
know a server-specific key called a 'magic cookie'. \
 \
This package contains the development headers for the library found \
in libXau6."
LICENSE = "MIT"

PV = "1.0.11"

RPM_NAME = "libXau-devel-1.0.11-1.2.aarch64.rpm"
RPM_HASH = "38ef74131b41ad7f58269620ff52aae0961c2922843a12273add0053bc3cd48cb07d6100e94ac9af33d8ebc4fad2bc23ce502d9b5843b472d694d65e8b86c15c"

RPROVIDES:${PN} += "libXau-devel \
pkgconfig-xau \
xorg-x11-libXau-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXau6 \
pkgconfig-xproto"

inherit rpm
