SUMMARY = "Introspections files for libportal"
DESCRIPTION = "A GIO-style async APIs for most Flatpak portals. \
This package contains the introspection files of libportal."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6"

RPM_NAME = "typelib-1_0-Xdp-1_0-0.6-1.8.aarch64.rpm"
RPM_HASH = "74d7465ea032ec181f86239c1ad0fc8c8e16305253e1406b1aac318dc4c7e3154f9f9a02c30f9109cd64991f4132d9446f7be8ad1e646aadcf22b3ee4795445b"

RPROVIDES:${PN} += "typelib-1-0-Xdp-1-0 \
typelib-Xdp"

RDEPENDS:${PN} += "libportal.so.1 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
