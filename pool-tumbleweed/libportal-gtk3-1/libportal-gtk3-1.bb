SUMMARY = "Shared library for libportal"
DESCRIPTION = "A GIO-style async APIs for most Flatpak portals. \
This package contains the shared library of libportal."
LICENSE = "LGPL-3.0-or-later"

PV = "0.7"

RPM_NAME = "libportal-gtk3-1-0.7-1.1.aarch64.rpm"
RPM_HASH = "5eeebb0f20923ab59505e1b78d22e86c27221c7868c88d36b3dcd7cc7e607e9bae5e90b15d758a883cf2714757c3d4ef3c55ce462d6b6bb8acd9b0b266030c52"

RPROVIDES:${PN} += "libportal-gtk3-1 \
libportal-gtk3.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
