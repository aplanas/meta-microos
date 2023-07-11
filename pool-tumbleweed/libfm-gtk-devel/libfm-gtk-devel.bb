SUMMARY = "GTK devel files for libfm"
DESCRIPTION = "GTK libfm libraries for development"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "libfm-gtk-devel-1.3.2-1.13.aarch64.rpm"
RPM_HASH = "fb4e430ba0f991f703caabdb36f6416de9a58f1e57432dc8095c5d793a87ebb3f41c91bbc48c7f836426c2bd74dd71c687af559f4e4d75b003b65742a3910e29"

RPROVIDES:${PN} += "libfm-gtk-devel \
pkgconfig-libfm-gtk"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gtk2-devel \
libfm \
libfm-gtk4 \
libfm4 \
pkgconfig \
pkgconfig-gio-unix-2.0 \
pkgconfig-gthread-2.0 \
pkgconfig-gtk+-2.0 \
pkgconfig-libfm"

inherit rpm
