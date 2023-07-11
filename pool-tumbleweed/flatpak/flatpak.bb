SUMMARY = "OSTree based application bundles management"
DESCRIPTION = "flatpak is a system for building, distributing and running sandboxed desktop \
applications on Linux. See https://wiki.gnome.org/Projects/SandboxedApps for \
more information."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.4"

RPM_NAME = "flatpak-1.14.4-1.3.aarch64.rpm"
RPM_HASH = "8a5a4d0fc0a3aa241cc986176a86c47533cad35ebfb6c557d8a6b6b1e7f9a635a7f41ffc78b89f328181779223f39fff269b4bfd3010bf1173c6fdcaa4324a9d"

RPROVIDES:${PN} += "config-flatpak \
flatpak \
xdg-app"

RDEPENDS:${PN} += "/usr/bin/sh \
bubblewrap \
ld-linux-aarch64.so.1 \
libXau.so.6 \
libappstream.so.4 \
libarchive.so.13 \
libc.so.6 \
libcurl.so.4 \
libdconf.so.1 \
libflatpak0 \
libfuse3.so.3 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libostree-1.so.1 \
libpolkit-agent-1.so.0 \
libpolkit-gobject-1.so.0 \
libseccomp.so.2 \
libsystemd.so.0 \
libxml2.so.2 \
libzstd.so.1 \
ostree \
user-flatpak \
xdg-dbus-proxy \
xdg-desktop-portal"

inherit rpm
