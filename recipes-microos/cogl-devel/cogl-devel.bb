SUMMARY = "Development files for the cogl GL/GLES abstraction/utility layer"
DESCRIPTION = "This package contains the header files for developing \
applications that want to make use of cogl."
LICENSE = "MIT"

PV = "1.22.8"

RPM_NAME = "cogl-devel-1.22.8-2.11.aarch64.rpm"
RPM_HASH = "16e07b22425e9691a3ccc77ec50521b7f57d6d169f0ba198cb348135203c1aa136f7ac9e224b23ba38d0634b5968f4088603a455ff8852068131adc85562bdc9"

RPROVIDES:${PN} += "cogl-devel \
cogl-devel(aarch-64) \
pkgconfig(cogl-1.0) \
pkgconfig(cogl-2.0-experimental) \
pkgconfig(cogl-gl-1.0) \
pkgconfig(cogl-gles2-1.0) \
pkgconfig(cogl-gles2-2.0-experimental) \
pkgconfig(cogl-pango-1.0) \
pkgconfig(cogl-pango-2.0-experimental) \
pkgconfig(cogl-path-1.0) \
pkgconfig(cogl-path-2.0-experimental)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-devel \
libcogl-gles2-20 \
libcogl-pango20 \
libcogl20 \
pkgconfig(cairo) \
pkgconfig(cogl-1.0) \
pkgconfig(cogl-2.0-experimental) \
pkgconfig(egl) \
pkgconfig(gbm) \
pkgconfig(gdk-pixbuf-2.0) \
pkgconfig(gmodule-no-export-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(libdrm) \
pkgconfig(pangocairo) \
pkgconfig(wayland-client) \
pkgconfig(wayland-egl) \
pkgconfig(wayland-server) \
pkgconfig(x11) \
pkgconfig(xcomposite) \
pkgconfig(xdamage) \
pkgconfig(xext) \
pkgconfig(xfixes) \
pkgconfig(xrandr) \
typelib-1_0-Cogl-1_0 \
typelib-1_0-Cogl-2_0 \
typelib-1_0-CoglPango-1_0 \
typelib-1_0-CoglPango-2_0"

inherit rpm
