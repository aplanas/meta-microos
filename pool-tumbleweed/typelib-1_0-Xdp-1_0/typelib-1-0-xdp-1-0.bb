SUMMARY = "Introspections files for libportal"
DESCRIPTION = "A GIO-style async APIs for most Flatpak portals. \
This package contains the introspection files of libportal."
LICENSE = "LGPL-3.0-or-later"

PV = "0.7"

RPM_NAME = "typelib-1_0-Xdp-1_0-0.7-1.1.aarch64.rpm"
RPM_HASH = "69ade1eaf57ebbe5eafd0ef704012d8295cbeb86b45816659e6b00b763eb028cc82024940a1530f39969217ad6ff245e80836f37dbe501cc79473abc861ce530"

RPROVIDES:${PN} += "typelib-1-0-Xdp-1-0 \
typelib-Xdp"

RDEPENDS:${PN} += "libportal.so.1 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
