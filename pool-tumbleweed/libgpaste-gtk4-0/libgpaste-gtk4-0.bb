SUMMARY = "Library for managing clipboard history"
DESCRIPTION = "GPaste is a clipboard management daemon with DBus interface. \
 \
This package provides a library for managing clipboard history."
LICENSE = "BSD-2-Clause"

PV = "43.2+6"

RPM_NAME = "libgpaste-gtk4-0-43.2+6-2.2.aarch64.rpm"
RPM_HASH = "756e1bd553b08f0cbb216dae1912eb15f62053fcfe13c8963da046874d5db1c048e07cf820660e86f60a14545f6b98fc678cc2b3d3c0fd0964b0fe3c43ad678f"

RPROVIDES:${PN} += "libgpaste-gtk4-0 \
libgpaste-gtk4.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libadwaita-1.so.0 \
libcairo.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpaste-2.so.0 \
libgtk-4.so.1"

inherit rpm
