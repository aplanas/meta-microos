SUMMARY = "Qt 6 QuickParticles library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickParticles library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-quickparticles-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "130595d606f2764061b755ef331401cb0d28ebd9426e4df54312f47f85bb5f3c1a51df75b422882df84b6e46f65aa797846ff10579ac15eca8af2f8917776668"

RPROVIDES:${PN} += "cmake-Qt6QuickParticlesPrivate \
qt6-quickparticles-devel \
qt6-quickparticles-private-devel"

RDEPENDS:${PN} += "libQt6QuickParticles6 \
qt6-core-private-devel \
qt6-gui-private-devel \
qt6-qml-private-devel \
qt6-quick-private-devel"

inherit rpm
