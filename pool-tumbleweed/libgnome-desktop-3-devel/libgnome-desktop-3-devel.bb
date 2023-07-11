SUMMARY = "Development files for the GNOME Desktop API library"
DESCRIPTION = "The libgnome-desktop library provides API shared by several applications \
on the desktop, but that cannot live in the platform for various \
reasons."
LICENSE = "LGPL-2.1-or-later"

PV = "44.0"

RPM_NAME = "libgnome-desktop-3-devel-44.0-1.2.aarch64.rpm"
RPM_HASH = "8e5d182930784a2c2744050ac26cf1a036a3766707bc32a468cee8bdc6c7766ed5dc72435186ce7e9bfbdbf0581d561013ce2bca8229a9157b0b15767a2684af"

RPROVIDES:${PN} += "gnome-desktop-devel \
gnome-desktop-doc \
libgnome-desktop-3-devel \
pkgconfig-gnome-desktop-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgnome-desktop-3-20 \
libxkbfile-devel \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gsettings-desktop-schemas \
pkgconfig-gtk+-3.0 \
pkgconfig-iso-codes \
pkgconfig-libseccomp \
pkgconfig-libsystemd \
pkgconfig-libudev \
pkgconfig-xkbregistry \
pkgconfig-xkeyboard-config \
typelib-1-0-GnomeDesktop-3-0"

inherit rpm
