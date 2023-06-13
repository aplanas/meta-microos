SUMMARY = "Messaging application with a focus on speed and security"
DESCRIPTION = "Telegram is a non-profit cloud-based instant messaging service. \
Users can send messages and exchange photos, videos, stickers, audio and files of any type. \
Its client-side code is open-source software but the source code for recent versions is not \
always immediately published, whereas its server-side code is closed-source and proprietary. \
The service also provides APIs to independent developers."
LICENSE = "GPL-3.0-only"

PV = "4.8.1"

RPM_NAME = "telegram-desktop-4.8.1-1.3.aarch64.rpm"
RPM_HASH = "3e3ac810191852fdcc0940fb5bf3bb1a2d8b74be77d92fa1531e16afa71bab8b5e33b103a676a65ec09fb854c33e35c73dcc89efae1643d714bd66409b8bcda7"

RPROVIDES:${PN} += "application() \
application(org.telegram.desktop.desktop) \
metainfo() \
metainfo(org.telegram.desktop.metainfo.xml) \
mimehandler(x-scheme-handler/tg) \
telegram-desktop \
telegram-desktop(aarch-64)"

RDEPENDS:${PN} += "hicolor-icon-theme \
icu \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core5Compat.so.6()(64bit) \
libQt6Core5Compat.so.6(Qt_6)(64bit) \
libQt6DBus.so.6()(64bit) \
libQt6DBus.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Network.so.6()(64bit) \
libQt6Network.so.6(Qt_6)(64bit) \
libQt6OpenGL.so.6()(64bit) \
libQt6OpenGL.so.6(Qt_6)(64bit) \
libQt6OpenGLWidgets.so.6()(64bit) \
libQt6OpenGLWidgets.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6Quick.so.6()(64bit) \
libQt6Quick.so.6(Qt_6)(64bit) \
libQt6QuickWidgets.so.6()(64bit) \
libQt6QuickWidgets.so.6(Qt_6)(64bit) \
libQt6Svg.so.6()(64bit) \
libQt6Svg.so.6(Qt_6)(64bit) \
libQt6WaylandCompositor.so.6()(64bit) \
libQt6WaylandCompositor.so.6(Qt_6)(64bit) \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libX11.so.6()(64bit) \
libXcomposite.so.1()(64bit) \
libXdamage.so.1()(64bit) \
libXext.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libXrandr.so.2()(64bit) \
libXtst.so.6()(64bit) \
libavcodec.so.60()(64bit) \
libavfilter.so.9()(64bit) \
libavformat.so.60()(64bit) \
libavutil.so.58()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libgiomm-2.68.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libglibmm-2.68.so.1()(64bit) \
libgobject-2.0.so.0()(64bit) \
libhunspell-1.7.so.0()(64bit) \
libjemalloc.so.2()(64bit) \
libjpeg.so.8()(64bit) \
liblz4.so.1()(64bit) \
libm.so.6()(64bit) \
libminizip.so.1()(64bit) \
libopenal.so.1()(64bit) \
libopus.so.0()(64bit) \
libprotobuf-lite-3.21.12.so()(64bit) \
librnnoise.so.0()(64bit) \
libsigc-3.0.so.0()(64bit) \
libssl.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libswresample.so.4()(64bit) \
libswscale.so.7()(64bit) \
libvpx.so.8()(64bit) \
libwayland-client.so.0()(64bit) \
libxcb-keysyms.so.1()(64bit) \
libxcb-record.so.0()(64bit) \
libxcb-screensaver.so.0()(64bit) \
libxcb.so.1()(64bit) \
libxxhash.so.0()(64bit) \
libz.so.1()(64bit) \
qt6-imageformats"

inherit rpm
