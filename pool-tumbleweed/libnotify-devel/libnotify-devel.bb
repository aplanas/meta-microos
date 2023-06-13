SUMMARY = "Notifications Library"
DESCRIPTION = "D-BUS notifications library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.2"

RPM_NAME = "libnotify-devel-0.8.2-1.3.aarch64.rpm"
RPM_HASH = "afeb1b285eb0638219caf6311b69042e4ae8c1023fedb90955dd3514119ff8c0d55c6f6886894b649a80dcbb44ee39634fecb467f6535e0db00ed5502f86b63d"

RPROVIDES:${PN} += "libnotify-devel \
libnotify-devel(aarch-64) \
libnotify-doc \
pkgconfig(libnotify)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnotify4 \
pkgconfig(gdk-pixbuf-2.0) \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
typelib-1_0-Notify-0_7"

inherit rpm
