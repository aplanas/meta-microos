SUMMARY = "GNOME Keyboard Library"
DESCRIPTION = "This package contains the header files for developing \
applications that want to make use of libgnomekbd."
LICENSE = "LGPL-2.1-or-later"

PV = "3.28.1"

RPM_NAME = "libgnomekbd-devel-3.28.1-1.3.aarch64.rpm"
RPM_HASH = "39368e243bc9d8c388f1963f03597504c7e3e74905abd6b058115cb6b3bef59df61c09f6141b001a0bcd21274a18186c7d301c76105f3409c9981d9a7efb8ed7"

RPROVIDES:${PN} += "libgnomekbd-devel \
libgnomekbd-devel(aarch-64) \
pkgconfig(libgnomekbd) \
pkgconfig(libgnomekbdui)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnomekbd-tools \
libgnomekbd8 \
pkgconfig(gdk-3.0) \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(gtk+-3.0) \
pkgconfig(libgnomekbd) \
pkgconfig(libxklavier) \
pkgconfig(x11) \
typelib-1_0-Gkbd-3_0"

inherit rpm
