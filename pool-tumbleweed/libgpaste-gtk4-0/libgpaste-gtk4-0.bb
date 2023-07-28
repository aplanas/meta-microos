SUMMARY = "Library for managing clipboard history"
DESCRIPTION = "GPaste is a clipboard management daemon with DBus interface. \
 \
This package provides a library for managing clipboard history."
LICENSE = "BSD-2-Clause"

PV = "44.1"

RPM_NAME = "libgpaste-gtk4-0-44.1-1.1.aarch64.rpm"
RPM_HASH = "3e2a4a67ce4a0546f63daae8bb2988b3a53cd1fea2e912b7d89b562fceaac2d6953cc0004d16e3a65925e640233d7814b64c99daa428b33ef397429e722d72b1"

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
