SUMMARY = "OSTree based application bundles management"
DESCRIPTION = "flatpak is a system for building, distributing and running sandboxed desktop \
applications on Linux. See https://wiki.gnome.org/Projects/SandboxedApps for \
more information."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.4"

RPM_NAME = "flatpak-1.14.4-1.2.aarch64.rpm"
RPM_HASH = "f7073440ae40573ba86f8752dfe0e03f58369554ff6ac1da2028a35795f4446b533950bbe94c4f31a0b6bd11fef7ed3ae3c935cbc2626476334041d2dd04b212"

RPROVIDES:${PN} += "config-flatpak \
flatpak \
xdg-app"

RDEPENDS:${PN} += "/bin/sh \
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
