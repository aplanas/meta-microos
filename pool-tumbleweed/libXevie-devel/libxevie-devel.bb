SUMMARY = "Development files for the X Event Interception Extension library"
DESCRIPTION = "libXevie provides an X Window System client interface to the EvIE \
extension to the X protocol. The EvIE (Event Interception Extension) \
allows for clients to be able to intercept all events coming through \
the server and then decide what to do with them, including being able \
to modify or discard events. \
 \
This package contains the development headers for the library found \
in libXevie1."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "libXevie-devel-1.0.3-13.1.aarch64.rpm"
RPM_HASH = "def908e35010d42cdc004709dcd248d8dbee44b7c2ad128afae66a1a2948290712a5c53a9e66378c2edbf71f5d2ffd319f14a9204c5ddeb6da999b4104a19cae"

RPROVIDES:${PN} += "libXevie-devel \
libXevie-devel(aarch-64) \
pkgconfig(xevie)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXevie1 \
pkgconfig(x11) \
pkgconfig(xext) \
pkgconfig(xproto)"

inherit rpm
