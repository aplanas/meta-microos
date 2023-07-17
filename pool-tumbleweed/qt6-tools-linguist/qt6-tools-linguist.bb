SUMMARY = "Translation tool for Qt applications"
DESCRIPTION = "Qt Linguist can be used by translator to translate text in Qt applications."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-tools-linguist-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "3d969fe69e6791a7d61d44922e0ef22687b2e93864cf073f91f5fd2949c8a550493cb3769a25d93927a48b89ecfd07d4c511c4df3ddb8896a28800315af4b462"

RPROVIDES:${PN} += "qt6-tools-linguist"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLLVM.so.16 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Qml.so.6 \
libQt6UiTools.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libclang-cpp.so.16 \
libstdc++.so.6"

inherit rpm
