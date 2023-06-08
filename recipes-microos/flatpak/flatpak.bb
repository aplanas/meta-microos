SUMMARY = "OSTree based application bundles management"
DESCRIPTION = "flatpak is a system for building, distributing and running sandboxed desktop \
applications on Linux. See https://wiki.gnome.org/Projects/SandboxedApps for \
more information."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.4"

RPM_NAME = "flatpak-1.14.4-1.2.aarch64.rpm"
RPM_HASH = "f7073440ae40573ba86f8752dfe0e03f58369554ff6ac1da2028a35795f4446b533950bbe94c4f31a0b6bd11fef7ed3ae3c935cbc2626476334041d2dd04b212"

RPROVIDES:${PN} += "config(flatpak) flatpak flatpak(aarch-64) xdg-app"
RDEPENDS:${PN} += "/bin/sh bubblewrap ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libXau.so.6()(64bit) libappstream.so.4()(64bit) libarchive.so.13()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcurl.so.4()(64bit) libdconf.so.1()(64bit) libflatpak0 libfuse3.so.3()(64bit) libfuse3.so.3(FUSE_3.0)(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libjson-glib-1.0.so.0()(64bit) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) libostree-1.so.1()(64bit) libostree-1.so.1(LIBOSTREE_2016.14)(64bit) libostree-1.so.1(LIBOSTREE_2016.3)(64bit) libostree-1.so.1(LIBOSTREE_2016.4)(64bit) libostree-1.so.1(LIBOSTREE_2016.5)(64bit) libostree-1.so.1(LIBOSTREE_2016.6)(64bit) libostree-1.so.1(LIBOSTREE_2016.7)(64bit) libostree-1.so.1(LIBOSTREE_2016.8)(64bit) libostree-1.so.1(LIBOSTREE_2017.10)(64bit) libostree-1.so.1(LIBOSTREE_2017.12)(64bit) libostree-1.so.1(LIBOSTREE_2017.15)(64bit) libostree-1.so.1(LIBOSTREE_2017.2)(64bit) libostree-1.so.1(LIBOSTREE_2017.6)(64bit) libostree-1.so.1(LIBOSTREE_2018.6)(64bit) libostree-1.so.1(LIBOSTREE_2018.9)(64bit) libostree-1.so.1(LIBOSTREE_2019.4)(64bit) libostree-1.so.1(LIBOSTREE_2020.8)(64bit) libpolkit-agent-1.so.0()(64bit) libpolkit-gobject-1.so.0()(64bit) libseccomp.so.2()(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libzstd.so.1()(64bit) ostree user(flatpak) xdg-dbus-proxy xdg-desktop-portal"

inherit rpm
