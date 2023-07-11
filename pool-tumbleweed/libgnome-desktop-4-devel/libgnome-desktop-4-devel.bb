SUMMARY = "Development files for the GNOME Desktop API library"
DESCRIPTION = "The libgnome-desktop library provides API shared by several applications \
on the desktop, but that cannot live in the platform for various \
reasons."
LICENSE = "LGPL-2.1-or-later"

PV = "44.0"

RPM_NAME = "libgnome-desktop-4-devel-44.0-1.2.aarch64.rpm"
RPM_HASH = "e12f81c83a4b8793cc129eca0f123c8bed6367a4eb7cbc740ac50d61a9d2a9a0ec2c9fdb95cbd4be841efcf6ebf60622bf1441d95d02c910cf7570072d7b8e2c"

RPROVIDES:${PN} += "libgnome-desktop-4-devel \
pkgconfig-gnome-bg-4 \
pkgconfig-gnome-desktop-4 \
pkgconfig-gnome-rr-4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgnome-desktop-4-2 \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gnome-desktop-4 \
pkgconfig-gsettings-desktop-schemas \
pkgconfig-gtk4 \
pkgconfig-iso-codes \
pkgconfig-libseccomp \
pkgconfig-libsystemd \
pkgconfig-libudev \
pkgconfig-xkbregistry \
pkgconfig-xkeyboard-config \
typelib-1-0-GnomeBG-4-0 \
typelib-1-0-GnomeDesktop-4-0 \
typelib-1-0-GnomeRR-4-0"

inherit rpm
