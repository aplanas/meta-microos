SUMMARY = "Qt 6 3DQuickRender library"
DESCRIPTION = "The Qt 6 3DQuickRender library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt63DQuickRender6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "fc40c9795ad3b7d25c488f38a1bf6de1e015c0698b331fe258c970243438a1b0f6345a22a7a607c7834e2bc79510908986157f41dab65d06b47964c82a753ef6"

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
