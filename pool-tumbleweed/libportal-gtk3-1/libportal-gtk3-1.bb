SUMMARY = "Shared library for libportal"
DESCRIPTION = "A GIO-style async APIs for most Flatpak portals. \
This package contains the shared library of libportal."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6"

RPM_NAME = "libportal-gtk3-1-0.6-1.8.aarch64.rpm"
RPM_HASH = "c4963af47c96f3d1a467c243261f8d30a959ecd705973c8794c770f51f6bbee805ff2fed6f3c710a98d63113a178d5fb002ae43c4821b9bf2cf982a6545af823"

RPROVIDES:${PN} += "libportal-gtk3-1 \
libportal-gtk3.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
