SUMMARY = "Shared library for libportal"
DESCRIPTION = "A GIO-style async APIs for most Flatpak portals. \
This package contains the shared library of libportal."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6"

RPM_NAME = "libportal-gtk3-1-0.6-1.7.aarch64.rpm"
RPM_HASH = "165d25edef117b8e053a709c3d3a55e8f4124f2f6f73949989adb608d9ce16f44ba633e968c8b6587a148d33effc7c8abd0ecdcca12c2e4b6c23100ab8e64668"

RPROVIDES:${PN} += "libportal-gtk3-1 \
libportal-gtk3-1(aarch-64) \
libportal-gtk3.so.1()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libgdk-3.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit)"

inherit rpm
