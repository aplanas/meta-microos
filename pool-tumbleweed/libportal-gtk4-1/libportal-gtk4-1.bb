SUMMARY = "Shared library for libportal"
DESCRIPTION = "A GIO-style async APIs for most Flatpak portals. \
This package contains the shared library of libportal."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6"

RPM_NAME = "libportal-gtk4-1-0.6-1.7.aarch64.rpm"
RPM_HASH = "1013ff139d8e99260c327765fdc416889601516ca6f8c695b3f957443feb8cdf0466b47b2067505600938d59f08a86bf7eadbaac468aa8e849a022361bcfa5a2"

RPROVIDES:${PN} += "libportal-gtk4-1 \
libportal-gtk4-1(aarch-64) \
libportal-gtk4.so.1()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-4.so.1()(64bit)"

inherit rpm
