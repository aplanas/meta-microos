SUMMARY = "Development files for the X11 protocol C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
This package contains the development headers for the library found \
in libxcb1."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libxcb-devel-1.15-2.2.aarch64.rpm"
RPM_HASH = "c452e22677fab7f9d909034cd354c11703bf1b8af733dba3c12750ac624d8b5341fe1fcbfcf719ffc50ad94516d4e65ccdb4fc4146f58bd654cc568b5cc7916e"

RPROVIDES:${PN} += "libxcb-devel \
libxcb-devel(aarch-64) \
pkgconfig(xcb) \
pkgconfig(xcb-composite) \
pkgconfig(xcb-damage) \
pkgconfig(xcb-dpms) \
pkgconfig(xcb-dri2) \
pkgconfig(xcb-dri3) \
pkgconfig(xcb-glx) \
pkgconfig(xcb-present) \
pkgconfig(xcb-randr) \
pkgconfig(xcb-record) \
pkgconfig(xcb-render) \
pkgconfig(xcb-res) \
pkgconfig(xcb-screensaver) \
pkgconfig(xcb-shape) \
pkgconfig(xcb-shm) \
pkgconfig(xcb-sync) \
pkgconfig(xcb-xf86dri) \
pkgconfig(xcb-xfixes) \
pkgconfig(xcb-xinerama) \
pkgconfig(xcb-xinput) \
pkgconfig(xcb-xkb) \
pkgconfig(xcb-xtest) \
pkgconfig(xcb-xv) \
pkgconfig(xcb-xvmc) \
xorg-x11-libxcb-devel"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxcb-composite0 \
libxcb-damage0 \
libxcb-dpms0 \
libxcb-dri2-0 \
libxcb-dri3-0 \
libxcb-glx0 \
libxcb-present0 \
libxcb-randr0 \
libxcb-record0 \
libxcb-render0 \
libxcb-res0 \
libxcb-screensaver0 \
libxcb-shape0 \
libxcb-shm0 \
libxcb-sync1 \
libxcb-xf86dri0 \
libxcb-xfixes0 \
libxcb-xinerama0 \
libxcb-xinput0 \
libxcb-xkb1 \
libxcb-xtest0 \
libxcb-xv0 \
libxcb-xvmc0 \
pkgconfig(xau) \
pkgconfig(xcb) \
pkgconfig(xcb-randr) \
pkgconfig(xcb-render) \
pkgconfig(xcb-shape) \
pkgconfig(xcb-shm) \
pkgconfig(xcb-sync) \
pkgconfig(xcb-xfixes) \
pkgconfig(xcb-xv)"

inherit rpm
