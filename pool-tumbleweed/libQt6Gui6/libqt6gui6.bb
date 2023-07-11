SUMMARY = "Qt 6 GUI related libraries"
DESCRIPTION = "The Qt GUI module provides classes for windowing system integration, \
event handling, OpenGL and OpenGL ES integration, 2D graphics, basic \
imaging, fonts and text. These classes are used internally by Qt's \
user interface code and can also be used directly, for instance, to \
write applications using low-level OpenGL ES graphics APIs. \
 \
For application developers writing user interfaces, Qt provides \
higher level APIs, like Qt Quick, which are much more suitable than \
the enablers found in the Qt GUI module."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6Gui6-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "e9d0d6d64d6c3e4b68473b04b43e54783a9e1f92f77f324433becb134d2d25f3dd631897a5b085b094237853b14b01c034d4a7ee2ce9e385bf870aa6e25a2af2"

RPROVIDES:${PN} += "libQt6EglFSDeviceIntegration.so.6 \
libQt6EglFsKmsGbmSupport.so.6 \
libQt6EglFsKmsSupport.so.6 \
libQt6Gui.so.6 \
libQt6Gui6 \
libQt6XcbQpa.so.6 \
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
libqtslibplugin.so \
libqtuiotouchplugin.so \
libqvkkhrdisplay.so \
libqvnc.so \
libqxcb-egl-integration.so \
libqxcb.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGLESv2.so.2 \
libICE.so.6 \
libQt6Core.so.6 \
libQt6Core6 \
libQt6DBus.so.6 \
libQt6DBus6 \
libQt6Network.so.6 \
libQt6OpenGL.so.6 \
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
libxcb-cursor.so.0 \
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
libxcb-xinput.so.0 \
libxcb-xkb.so.1 \
libxcb.so.1 \
libxkbcommon-x11.so.0 \
libxkbcommon.so.0 \
libz.so.1"

inherit rpm
