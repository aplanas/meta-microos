SUMMARY = "Development files for the cogl GL/GLES abstraction/utility layer"
DESCRIPTION = "This package contains the header files for developing \
applications that want to make use of cogl."
LICENSE = "MIT"

PV = "1.22.8"

RPM_NAME = "cogl-devel-1.22.8-2.12.aarch64.rpm"
RPM_HASH = "d3d7ea5ad12987c16d18c726c6137e88f158f0a7f89493de56e8204fc84bef506d06f6595619fbb9fdb80e60efdb50a8f6efa8b3704c3e34d245fe85ac9b84d9"

RPROVIDES:${PN} += "cogl-devel \
pkgconfig-cogl-1.0 \
pkgconfig-cogl-2.0-experimental \
pkgconfig-cogl-gl-1.0 \
pkgconfig-cogl-gles2-1.0 \
pkgconfig-cogl-gles2-2.0-experimental \
pkgconfig-cogl-pango-1.0 \
pkgconfig-cogl-pango-2.0-experimental \
pkgconfig-cogl-path-1.0 \
pkgconfig-cogl-path-2.0-experimental"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-devel \
libcogl-gles2-20 \
libcogl-pango20 \
libcogl20 \
pkgconfig-cairo \
pkgconfig-cogl-1.0 \
pkgconfig-cogl-2.0-experimental \
pkgconfig-egl \
pkgconfig-gbm \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-gmodule-no-export-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libdrm \
pkgconfig-pangocairo \
pkgconfig-wayland-client \
pkgconfig-wayland-egl \
pkgconfig-wayland-server \
pkgconfig-x11 \
pkgconfig-xcomposite \
pkgconfig-xdamage \
pkgconfig-xext \
pkgconfig-xfixes \
pkgconfig-xrandr \
typelib-1-0-Cogl-1-0 \
typelib-1-0-Cogl-2-0 \
typelib-1-0-CoglPango-1-0 \
typelib-1-0-CoglPango-2-0"

inherit rpm
