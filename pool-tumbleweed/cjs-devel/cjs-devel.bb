SUMMARY = "Development Files for Cinnamon JS module"
DESCRIPTION = "JavaScript bindings based on GObject Introspection for the \
Cinnamon Desktop. \
 \
This package contains development files for cjs."
LICENSE = "(GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later) & MIT"

PV = "5.0.0"

RPM_NAME = "cjs-devel-5.0.0-1.11.aarch64.rpm"
RPM_HASH = "6ea212f1ec58149b282c71d9738e5a02bef4af795381cd001bd292c036a111847e182a167a197f692ad337b1339ce2d68c3a847f134eea8142f0287eb11f84fe"

RPROVIDES:${PN} += "cjs-devel \
pkgconfig-cjs-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cjs \
libcjs0 \
pkgconfig-cairo \
pkgconfig-cairo-gobject \
pkgconfig-cairo-xlib \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gobject-introspection-1.0 \
pkgconfig-gthread-2.0 \
pkgconfig-libffi \
pkgconfig-mozjs-78 \
typelib-1-0-CjsPrivate-1-0"

inherit rpm
