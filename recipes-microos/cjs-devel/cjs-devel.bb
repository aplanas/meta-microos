SUMMARY = "Development Files for Cinnamon JS module"
DESCRIPTION = "JavaScript bindings based on GObject Introspection for the \
Cinnamon Desktop. \
 \
This package contains development files for cjs."
LICENSE = "(GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later) & MIT"

PV = "5.0.0"

RPM_NAME = "cjs-devel-5.0.0-1.10.aarch64.rpm"
RPM_HASH = "2a4be5a4c7acd552f45e4aa0f842ed6ec1fe1e0d8eb09cf417acf2245f8cb90d4a1cdefa8a82983a1dbe4aa971a73863d6d0fa9c2b3050209a261ed38ba2bd28"

RPROVIDES:${PN} += "cjs-devel cjs-devel(aarch-64) pkgconfig(cjs-1.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cjs libcjs0 pkgconfig(cairo) pkgconfig(cairo-gobject) pkgconfig(cairo-xlib) pkgconfig(gio-2.0) pkgconfig(glib-2.0) pkgconfig(gobject-2.0) pkgconfig(gobject-introspection-1.0) pkgconfig(gthread-2.0) pkgconfig(libffi) pkgconfig(mozjs-78) typelib-1_0-CjsPrivate-1_0"

inherit rpm
