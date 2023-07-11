SUMMARY = "PolicyKit Library Qt Bindings"
DESCRIPTION = "Polkit-qt aims to make it easy for Qt developers to take advantage of \
PolicyKit API. It is a convenience wrapper around QAction and \
QAbstractButton that lets you integrate those two components easily \
with PolicyKit."
LICENSE = "LGPL-2.1-or-later"

PV = "0.114.0"

RPM_NAME = "libpolkit-qt5-1-devel-0.114.0-2.10.aarch64.rpm"
RPM_HASH = "c526e60740d1a369658cd44c5e84648ccc2be4eb50c26f7dcff2f3d3762151448dda66ae76c2e02ca82f97d8c4db459eaf10aa1ece6f62cafb3bbbbc2650e3ec"

RPROVIDES:${PN} += "cmake-PolkitQt5-1 \
libpolkit-qt5-1-devel \
pkgconfig-polkit-qt5-1 \
pkgconfig-polkit-qt5-agent-1 \
pkgconfig-polkit-qt5-core-1 \
pkgconfig-polkit-qt5-gui-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpolkit-qt5-1-1 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Widgets \
pkgconfig-polkit-qt5-agent-1 \
pkgconfig-polkit-qt5-core-1 \
pkgconfig-polkit-qt5-gui-1 \
polkit-devel"

inherit rpm
