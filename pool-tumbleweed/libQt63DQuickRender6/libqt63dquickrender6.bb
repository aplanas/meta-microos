SUMMARY = "Qt 6 3DQuickRender library"
DESCRIPTION = "The Qt 6 3DQuickRender library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt63DQuickRender6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "3d39b4a4e7bf9bbb1bde9d2fead7a725c48a0686492688028ab7d88cc466fe648d8d8ddced34a0c628ec1c355ae6a21e280ee9f749af167b93e58afc1a7e807a"

RPROVIDES:${PN} += "libQt63DQuickRender.so.6()(64bit) \
libQt63DQuickRender.so.6(Qt_6)(64bit) \
libQt63DQuickRender6 \
libQt63DQuickRender6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt63DCore.so.6()(64bit) \
libQt63DCore.so.6(Qt_6)(64bit) \
libQt63DRender.so.6()(64bit) \
libQt63DRender.so.6(Qt_6)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
