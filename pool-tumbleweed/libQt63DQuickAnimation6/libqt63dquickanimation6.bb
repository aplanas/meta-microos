SUMMARY = "Qt 6 3DQuickAnimation library"
DESCRIPTION = "The Qt 6 3DQuickAnimation library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt63DQuickAnimation6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "de5e48e76a2589bca75a310018d693122b0e34a62a7286e6cc665cdbdf47005f780f9d9a2f8aeb6bf9e540dec3c3b8b28885b7f63ddc9943f1b9b528f2aa3853"

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
