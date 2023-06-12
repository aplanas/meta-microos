SUMMARY = "Introspections files for libportal"
DESCRIPTION = "A GIO-style async APIs for most Flatpak portals. \
This package contains the introspection files of libportal."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6"

RPM_NAME = "typelib-1_0-Xdp-1_0-0.6-1.7.aarch64.rpm"
RPM_HASH = "90ffcd1892bd6924b6d568a736c3afde120a6f021cdb63fe0d196488cfe67747e61eecf9a18ad955e588afaa43a9a992d518b841a6eb172fd1dc4e0fc099639c"

RPROVIDES:${PN} += "typelib(Xdp) \
typelib-1_0-Xdp-1_0 \
typelib-1_0-Xdp-1_0(aarch-64)"
RDEPENDS:${PN} += "libportal.so.1()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio)"

inherit rpm
