SUMMARY = "Development files for the flatpak library"
DESCRIPTION = "flatpak is a system for building, distributing and running sandboxed desktop \
applications on Linux. See https://wiki.gnome.org/Projects/SandboxedApps for \
more information."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.4"

RPM_NAME = "flatpak-devel-1.14.4-1.2.aarch64.rpm"
RPM_HASH = "791c02d2f15cf50ea3f43c1dc8307d7f97398728b2773e2e6ce3d4d996ef9d5a2fd72cbe59d755ab5d8fc18a69c9d2d3407bb8b2fb755ff82c7ea6363af8b50b"

RPROVIDES:${PN} += "flatpak-devel flatpak-devel(aarch-64) pkgconfig(flatpak)"
RDEPENDS:${PN} += "/usr/bin/pkg-config /usr/bin/python3 flatpak libflatpak0 pkgconfig(gio-2.0) pkgconfig(gio-unix-2.0) pkgconfig(glib-2.0) pkgconfig(ostree-1) typelib(Flatpak) typelib(GLib) typelib-1_0-Flatpak-1_0"

inherit rpm
