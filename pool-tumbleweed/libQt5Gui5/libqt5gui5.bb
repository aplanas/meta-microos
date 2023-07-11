SUMMARY = "Qt 5 GUI related libraries"
DESCRIPTION = "The Qt GUI module provides classes for windowing system integration, \
event handling, OpenGL and OpenGL ES integration, 2D graphics, basic \
imaging, fonts and text. These classes are used internally by Qt's \
user interface code and can also be used directly, for instance, to \
write applications using low-level OpenGL ES graphics APIs. \
 \
For application developers writing user interfaces, Qt provides \
higher level APIs, like Qt Quick, which are much more suitable than \
the enablers found in the Qt GUI module."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Gui5-5.15.10+kde129-1.1.aarch64.rpm"
RPM_HASH = "89272bea78d50148fc3e8b7ff72fc85b04b7c33a2b01c329f374cb0851c4f2615181b80bb44128136f256c4ac3cd7257d4a1de58c5c936e7bc3a9bc195f1a916"

RPROVIDES:${PN} += "libQt5EglFSDeviceIntegration.so.5 \
libQt5EglFsKmsSupport.so.5 \
libQt5Gui.so.5 \
libQt5Gui5 \
libQt5XcbQpa.so.5 \
libcomposeplatforminputcontextplugin.so \
libibusplatforminputcontextplugin.so \
libqeglfs-emu-integration.so \
libqeglfs-kms-egldevice-integration.so \
libqeglfs-kms-integration.so \
libqeglfs-x11-integration.so \
libqeglfs.so \
libqevdevkeyboardplugin.so \
libqevdevmouseplugin.so \
libqevdevtabletplugin.so \
libqevdevtouchplugin.so \
libqgif.so \
libqico.so \
libqjpeg.so \
libqlibinputplugin.so \
libqlinuxfb.so \
libqminimal.so \
libqminimalegl.so \
libqoffscreen.so \
libqt5-qtbase-platformtheme-gtk2 \
libqtslibplugin.so \
libqtuiotouchplugin.so \
libqvnc.so \
libqxcb-egl-integration.so \
libqxcb.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGLESv2.so.2 \
libICE.so.6 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5DBus.so.5 \
libQt5DBus5 \
libQt5Network.so.5 \
libSM.so.6 \
libX11-xcb.so.1 \
libX11.so.6 \
libc.so.6 \
libdrm.so.2 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgbm.so.1 \
libglib-2.0.so.0 \
libharfbuzz.so.0 \
libinput.so.10 \
libjpeg.so.8 \
libm.so.6 \
libmtdev.so.1 \
libpng16.so.16 \
libstdc++.so.6 \
libts.so.0 \
libudev.so.1 \
libxcb-icccm.so.4 \
libxcb-image.so.0 \
libxcb-keysyms.so.1 \
libxcb-randr.so.0 \
libxcb-render-util.so.0 \
libxcb-render.so.0 \
libxcb-shape.so.0 \
libxcb-shm.so.0 \
libxcb-sync.so.1 \
libxcb-xfixes.so.0 \
libxcb-xinerama.so.0 \
libxcb-xinput.so.0 \
libxcb-xkb.so.1 \
libxcb.so.1 \
libxkbcommon-x11.so.0 \
libxkbcommon.so.0 \
libz.so.1"

inherit rpm
