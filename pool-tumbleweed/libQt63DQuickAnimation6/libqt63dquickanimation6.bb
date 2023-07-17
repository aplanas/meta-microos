SUMMARY = "Qt 6 3DQuickAnimation library"
DESCRIPTION = "The Qt 6 3DQuickAnimation library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt63DQuickAnimation6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "c15e339f2d705bdc612b42e906025f86f662acd73aa04b3ece6290a646b0b3d5cc5c9531e132abe9a31c83244511f8f8938ac4b32b455c23c1d1720403cd9884"

RPROVIDES:${PN} += "libQt63DQuickAnimation.so.6 \
libQt63DQuickAnimation6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt63DAnimation.so.6 \
libQt63DCore.so.6 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
