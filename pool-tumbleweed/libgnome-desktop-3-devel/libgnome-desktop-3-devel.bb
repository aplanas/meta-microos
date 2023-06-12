SUMMARY = "Development files for the GNOME Desktop API library"
DESCRIPTION = "The libgnome-desktop library provides API shared by several applications \
on the desktop, but that cannot live in the platform for various \
reasons."
LICENSE = "LGPL-2.1-or-later"

PV = "44.0"

RPM_NAME = "libgnome-desktop-3-devel-44.0-1.1.aarch64.rpm"
RPM_HASH = "a7f09e579eb3c055a2b6d3d0030b9673d6972690210c86c11f666bf6cbe678c1d4a3becd3143b912699c647752cc50e10ab6b87cf2fc0852ec6ab80495caee66"

RPROVIDES:${PN} += "gnome-desktop-devel \
gnome-desktop-doc \
libgnome-desktop-3-devel \
libgnome-desktop-3-devel(aarch-64) \
pkgconfig(gnome-desktop-3.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgnome-desktop-3-20 \
libxkbfile-devel \
pkgconfig(gdk-pixbuf-2.0) \
pkgconfig(gio-2.0) \
pkgconfig(gio-unix-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gsettings-desktop-schemas) \
pkgconfig(gtk+-3.0) \
pkgconfig(iso-codes) \
pkgconfig(libseccomp) \
pkgconfig(libsystemd) \
pkgconfig(libudev) \
pkgconfig(xkbregistry) \
pkgconfig(xkeyboard-config) \
typelib-1_0-GnomeDesktop-3_0"

inherit rpm
