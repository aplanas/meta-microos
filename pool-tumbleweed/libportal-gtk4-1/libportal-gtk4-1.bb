SUMMARY = "Shared library for libportal"
DESCRIPTION = "A GIO-style async APIs for most Flatpak portals. \
This package contains the shared library of libportal."
LICENSE = "LGPL-3.0-or-later"

PV = "0.7"

RPM_NAME = "libportal-gtk4-1-0.7-1.1.aarch64.rpm"
RPM_HASH = "98d8334c10c6a35603e2ddffdb776e88ec4faaec31beea10fa48617743d1a50c0c06935beb95b2853af17344596de22f0ea18ba52ebe5a9a7950d2505490690e"

RPROVIDES:${PN} += "libportal-gtk4-1 \
libportal-gtk4.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1"

inherit rpm
