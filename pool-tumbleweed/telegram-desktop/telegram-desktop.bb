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

RPROVIDES:${PN} += "telegram-desktop"

RDEPENDS:${PN} += "hicolor-icon-theme \
icu \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6OpenGL.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickWidgets.so.6 \
libQt6Svg.so.6 \
libQt6WaylandCompositor.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libXcomposite.so.1 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXrandr.so.2 \
libXtst.so.6 \
libavcodec.so.60 \
libavfilter.so.9 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libgiomm-2.68.so.1 \
libglib-2.0.so.0 \
libglibmm-2.68.so.1 \
libgobject-2.0.so.0 \
libhunspell-1.7.so.0 \
libjemalloc.so.2 \
libjpeg.so.8 \
liblz4.so.1 \
libm.so.6 \
libminizip.so.1 \
libopenal.so.1 \
libopus.so.0 \
libprotobuf-lite-3.21.12.so \
librnnoise.so.0 \
libsigc-3.0.so.0 \
libssl.so.3 \
libstdc++.so.6 \
libswresample.so.4 \
libswscale.so.7 \
libvpx.so.8 \
libwayland-client.so.0 \
libxcb-keysyms.so.1 \
libxcb-record.so.0 \
libxcb-screensaver.so.0 \
libxcb.so.1 \
libxxhash.so.0 \
libz.so.1 \
qt6-imageformats"

inherit rpm
