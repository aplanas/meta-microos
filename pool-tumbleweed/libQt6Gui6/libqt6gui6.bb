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

RPM_NAME = "libQt6Gui6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "6ddb233db262a3b98cd5227f7cb5ad89cab95ab6e0b582ae2ed1ba1903c2dd7d3a94ff6d2ff16408d66268bd328ce3f47e8f0d84e4c7aaa014939626884389b9"

RPROVIDES:${PN} += "libQt6EglFSDeviceIntegration.so.6()(64bit) \
libQt6EglFSDeviceIntegration.so.6(Qt_6)(64bit) \
libQt6EglFsKmsGbmSupport.so.6()(64bit) \
libQt6EglFsKmsGbmSupport.so.6(Qt_6)(64bit) \
libQt6EglFsKmsSupport.so.6()(64bit) \
libQt6EglFsKmsSupport.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Gui6 \
libQt6Gui6(aarch-64) \
libQt6XcbQpa.so.6()(64bit) \
libcomposeplatforminputcontextplugin.so()(64bit) \
libcomposeplatforminputcontextplugin.so(Qt_6)(64bit) \
libibusplatforminputcontextplugin.so()(64bit) \
libibusplatforminputcontextplugin.so(Qt_6)(64bit) \
libqeglfs-emu-integration.so()(64bit) \
libqeglfs-emu-integration.so(Qt_6)(64bit) \
libqeglfs-kms-egldevice-integration.so()(64bit) \
libqeglfs-kms-egldevice-integration.so(Qt_6)(64bit) \
libqeglfs-kms-integration.so()(64bit) \
libqeglfs-kms-integration.so(Qt_6)(64bit) \
libqeglfs-x11-integration.so()(64bit) \
libqeglfs-x11-integration.so(Qt_6)(64bit) \
libqeglfs.so()(64bit) \
libqeglfs.so(Qt_6)(64bit) \
libqevdevkeyboardplugin.so()(64bit) \
libqevdevkeyboardplugin.so(Qt_6)(64bit) \
libqevdevmouseplugin.so()(64bit) \
libqevdevmouseplugin.so(Qt_6)(64bit) \
libqevdevtabletplugin.so()(64bit) \
libqevdevtabletplugin.so(Qt_6)(64bit) \
libqevdevtouchplugin.so()(64bit) \
libqevdevtouchplugin.so(Qt_6)(64bit) \
libqgif.so()(64bit) \
libqgif.so(Qt_6)(64bit) \
libqico.so()(64bit) \
libqico.so(Qt_6)(64bit) \
libqjpeg.so()(64bit) \
libqjpeg.so(Qt_6)(64bit) \
libqlibinputplugin.so()(64bit) \
libqlibinputplugin.so(Qt_6)(64bit) \
libqlinuxfb.so()(64bit) \
libqlinuxfb.so(Qt_6)(64bit) \
libqminimal.so()(64bit) \
libqminimal.so(Qt_6)(64bit) \
libqminimalegl.so()(64bit) \
libqminimalegl.so(Qt_6)(64bit) \
libqoffscreen.so()(64bit) \
libqoffscreen.so(Qt_6)(64bit) \
libqtslibplugin.so()(64bit) \
libqtslibplugin.so(Qt_6)(64bit) \
libqtuiotouchplugin.so()(64bit) \
libqtuiotouchplugin.so(Qt_6)(64bit) \
libqvkkhrdisplay.so()(64bit) \
libqvkkhrdisplay.so(Qt_6)(64bit) \
libqvnc.so()(64bit) \
libqvnc.so(Qt_6)(64bit) \
libqxcb-egl-integration.so()(64bit) \
libqxcb-egl-integration.so(Qt_6)(64bit) \
libqxcb.so()(64bit) \
libqxcb.so(Qt_6)(64bit)"

RDEPENDS:${PN} += "(qt6-wayland if xwayland) \
/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libEGL.so.1()(64bit) \
libGLESv2.so.2()(64bit) \
libICE.so.6()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core6 \
libQt6DBus.so.6()(64bit) \
libQt6DBus.so.6(Qt_6)(64bit) \
libQt6DBus6 \
libQt6Network.so.6()(64bit) \
libQt6Network.so.6(Qt_6)(64bit) \
libQt6OpenGL.so.6()(64bit) \
libQt6OpenGL.so.6(Qt_6)(64bit) \
libSM.so.6()(64bit) \
libX11-xcb.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libdrm.so.2()(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libgbm.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libharfbuzz.so.0()(64bit) \
libinput.so.10()(64bit) \
libjpeg.so.8()(64bit) \
libm.so.6()(64bit) \
libmtdev.so.1()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit) \
libts.so.0()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libxcb-cursor.so.0()(64bit) \
libxcb-icccm.so.4()(64bit) \
libxcb-image.so.0()(64bit) \
libxcb-keysyms.so.1()(64bit) \
libxcb-randr.so.0()(64bit) \
libxcb-render-util.so.0()(64bit) \
libxcb-render.so.0()(64bit) \
libxcb-shape.so.0()(64bit) \
libxcb-shm.so.0()(64bit) \
libxcb-sync.so.1()(64bit) \
libxcb-xfixes.so.0()(64bit) \
libxcb-xinput.so.0()(64bit) \
libxcb-xkb.so.1()(64bit) \
libxcb.so.1()(64bit) \
libxkbcommon-x11.so.0()(64bit) \
libxkbcommon.so.0()(64bit) \
libz.so.1()(64bit)"

inherit rpm
