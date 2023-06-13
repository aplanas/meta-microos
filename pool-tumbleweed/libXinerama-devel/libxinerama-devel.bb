SUMMARY = "Development files for the X11 Xinerama extension"
DESCRIPTION = "Xinerama is an extension to the X Window System which enables \
multi-headed X applications and window managers to use two or more \
physical displays as one large virtual display. \
 \
This package contains the development headers for the library found \
in libXinerama1."
LICENSE = "MIT"

PV = "1.1.5"

RPM_NAME = "libXinerama-devel-1.1.5-1.2.aarch64.rpm"
RPM_HASH = "e633d7edc0c5a57024d1b9986f2d38546737964b7bce69ac54c4423e0929dfff0178d12c9066c8d280fc950698075892fecd03737ba883da3c4abba5fe1d86ea"

RPROVIDES:${PN} += "libXinerama-devel \
libXinerama-devel(aarch-64) \
pkgconfig(xinerama)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXinerama1 \
pkgconfig(x11) \
pkgconfig(xext) \
pkgconfig(xineramaproto)"

inherit rpm
