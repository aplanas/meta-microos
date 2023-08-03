SUMMARY = "Qt 6 MultimediaQuick library - Development files"
DESCRIPTION = "Development files for the Qt 6 Multimedia private library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-multimediaquick-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "aa3ada0d148d419d29ed455c2133db045e52c8d003d96c8fd712327a4c8dfbafaf26b8c5aec8208e15bba3060c73122168c62610422f87e1746b0fa85efddabe"

RPROVIDES:${PN} += "cmake-Qt6MultimediaQuickPrivate \
qt6-multimediaquick-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Multimedia \
cmake-Qt6Quick \
libQt6MultimediaQuick6 \
qt6-multimedia-private-devel \
qt6-quick-private-devel"

inherit rpm
