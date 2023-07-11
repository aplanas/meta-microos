SUMMARY = "Development files for the flatpak library"
DESCRIPTION = "flatpak is a system for building, distributing and running sandboxed desktop \
applications on Linux. See https://wiki.gnome.org/Projects/SandboxedApps for \
more information."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.4"

RPM_NAME = "flatpak-devel-1.14.4-1.3.aarch64.rpm"
RPM_HASH = "9534cea21f58a74d9817eaaa4712c6bdb64bfd2642316a54400551671302d616fdf10258935cf425a2834ae5e774aeb152bf9cfc1f543eec7195360477dda960"

RPROVIDES:${PN} += "flatpak-devel \
pkgconfig-flatpak"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3 \
flatpak \
libflatpak0 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-ostree-1 \
typelib-1-0-Flatpak-1-0 \
typelib-Flatpak \
typelib-GLib"

inherit rpm
