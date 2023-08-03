SUMMARY = "Qt 6 3DQuickRender library"
DESCRIPTION = "The Qt 6 3DQuickRender library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt63DQuickRender6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "aac752d8feb027d1371dc868e8bfbb1479867aad404401f3bcff12ad629a489048e20be7190e2bf3d11abfc9e6dc2f9763f24c8afac24cf9b19ec29257d45fbb"

RPROVIDES:${PN} += "libQt63DQuickRender.so.6 \
libQt63DQuickRender6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt63DCore.so.6 \
libQt63DRender.so.6 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
