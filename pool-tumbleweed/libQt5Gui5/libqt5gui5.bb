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

PV = "5.15.9+kde154"

RPM_NAME = "libQt5Gui5-5.15.9+kde154-1.2.aarch64.rpm"
RPM_HASH = "3af6f9a07cd6f9108210d5b73971517c0865f6db660591d78c9946b6c08847a9d54657af87b446786cc287ac0a6ae5a837dd4a5c98561f223839a2b1962e2d28"

RPROVIDES:${PN} += "libQt5EglFSDeviceIntegration.so.5()(64bit) \
libQt5EglFSDeviceIntegration.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5EglFsKmsSupport.so.5()(64bit) \
libQt5EglFsKmsSupport.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Gui.so.5(Qt_5.0)(64bit) \
libQt5Gui.so.5(Qt_5.1)(64bit) \
libQt5Gui.so.5(Qt_5.10)(64bit) \
libQt5Gui.so.5(Qt_5.11)(64bit) \
libQt5Gui.so.5(Qt_5.12)(64bit) \
libQt5Gui.so.5(Qt_5.13)(64bit) \
libQt5Gui.so.5(Qt_5.14)(64bit) \
libQt5Gui.so.5(Qt_5.15)(64bit) \
libQt5Gui.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Gui.so.5(Qt_5.2)(64bit) \
libQt5Gui.so.5(Qt_5.3)(64bit) \
libQt5Gui.so.5(Qt_5.4)(64bit) \
libQt5Gui.so.5(Qt_5.5)(64bit) \
libQt5Gui.so.5(Qt_5.6)(64bit) \
libQt5Gui.so.5(Qt_5.7)(64bit) \
libQt5Gui.so.5(Qt_5.8)(64bit) \
libQt5Gui.so.5(Qt_5.9)(64bit) \
libQt5Gui5 \
libQt5Gui5(aarch-64) \
libQt5XcbQpa.so.5()(64bit) \
libQt5XcbQpa.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libcomposeplatforminputcontextplugin.so()(64bit) \
libibusplatforminputcontextplugin.so()(64bit) \
libqeglfs-emu-integration.so()(64bit) \
libqeglfs-kms-egldevice-integration.so()(64bit) \
libqeglfs-kms-integration.so()(64bit) \
libqeglfs-x11-integration.so()(64bit) \
libqeglfs.so()(64bit) \
libqevdevkeyboardplugin.so()(64bit) \
libqevdevmouseplugin.so()(64bit) \
libqevdevtabletplugin.so()(64bit) \
libqevdevtouchplugin.so()(64bit) \
libqgif.so()(64bit) \
libqico.so()(64bit) \
libqjpeg.so()(64bit) \
libqlibinputplugin.so()(64bit) \
libqlinuxfb.so()(64bit) \
libqminimal.so()(64bit) \
libqminimalegl.so()(64bit) \
libqoffscreen.so()(64bit) \
libqt5-qtbase-platformtheme-gtk2 \
libqtslibplugin.so()(64bit) \
libqtuiotouchplugin.so()(64bit) \
libqvnc.so()(64bit) \
libqxcb-egl-integration.so()(64bit) \
libqxcb.so()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libEGL.so.1()(64bit) \
libGLESv2.so.2()(64bit) \
libICE.so.6()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Core5 \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5DBus5 \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libSM.so.6()(64bit) \
libX11-xcb.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdrm.so.2()(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libgbm.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libharfbuzz.so.0()(64bit) \
libinput.so.10()(64bit) \
libinput.so.10(LIBINPUT_0.12.0)(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmtdev.so.1()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.28)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libts.so.0()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
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
libxcb-xinerama.so.0()(64bit) \
libxcb-xinput.so.0()(64bit) \
libxcb-xkb.so.1()(64bit) \
libxcb.so.1()(64bit) \
libxkbcommon-x11.so.0()(64bit) \
libxkbcommon-x11.so.0(V_0.5.0)(64bit) \
libxkbcommon.so.0()(64bit) \
libxkbcommon.so.0(V_0.5.0)(64bit) \
libz.so.1()(64bit)"

inherit rpm
