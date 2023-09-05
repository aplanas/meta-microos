SUMMARY = "Development files for the X11 protocol C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
This package contains the development headers for the library found \
in libxcb1."
LICENSE = "MIT"

PV = "1.16"

RPM_NAME = "libxcb-devel-1.16-1.1.aarch64.rpm"
RPM_HASH = "6f21229463d342d80cdf1e3bfcb754c978632eace77718bd194a52fd5b264646eb7a955bc3ac8b0e77e284d288746c700a0c1e85650b9a4794a176db09769802"

RPROVIDES:${PN} += "libxcb-devel \
pkgconfig-xcb \
pkgconfig-xcb-composite \
pkgconfig-xcb-damage \
pkgconfig-xcb-dbe \
pkgconfig-xcb-dpms \
pkgconfig-xcb-dri2 \
pkgconfig-xcb-dri3 \
pkgconfig-xcb-glx \
pkgconfig-xcb-present \
pkgconfig-xcb-randr \
pkgconfig-xcb-record \
pkgconfig-xcb-render \
pkgconfig-xcb-res \
pkgconfig-xcb-screensaver \
pkgconfig-xcb-shape \
pkgconfig-xcb-shm \
pkgconfig-xcb-sync \
pkgconfig-xcb-xf86dri \
pkgconfig-xcb-xfixes \
pkgconfig-xcb-xinerama \
pkgconfig-xcb-xinput \
pkgconfig-xcb-xkb \
pkgconfig-xcb-xtest \
pkgconfig-xcb-xv \
pkgconfig-xcb-xvmc \
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
pkgconfig-xau \
pkgconfig-xcb \
pkgconfig-xcb-randr \
pkgconfig-xcb-render \
pkgconfig-xcb-shape \
pkgconfig-xcb-shm \
pkgconfig-xcb-sync \
pkgconfig-xcb-xfixes \
pkgconfig-xcb-xv"

inherit rpm
