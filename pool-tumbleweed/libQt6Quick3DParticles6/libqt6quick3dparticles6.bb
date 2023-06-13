SUMMARY = "Qt 6 Quick3DParticles library"
DESCRIPTION = "The Qt 6 Quick3DParticles library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Quick3DParticles6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "31aa57c988c33a7d745daa70fa727144128c7d19a2697d8417d9e9e2d57e4253787d6db85707feb9c53894e4cc5ddc8b34d026e4eda2e3dc05045676677e93af"

RPROVIDES:${PN} += "libQt6Quick3DParticles.so.6()(64bit) \
libQt6Quick3DParticles.so.6(Qt_6)(64bit) \
libQt6Quick3DParticles6 \
libQt6Quick3DParticles6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6Quick3D.so.6()(64bit) \
libQt6Quick3D.so.6(Qt_6)(64bit) \
libQt6Quick3DRuntimeRender.so.6()(64bit) \
libQt6Quick3DUtils.so.6()(64bit) \
libQt6Quick3DUtils.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
