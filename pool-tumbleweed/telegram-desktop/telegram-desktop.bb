SUMMARY = "Messaging application with a focus on speed and security"
DESCRIPTION = "Telegram is a non-profit cloud-based instant messaging service. \
Users can send messages and exchange photos, videos, stickers, audio and files of any type. \
Its client-side code is open-source software but the source code for recent versions is not \
always immediately published, whereas its server-side code is closed-source and proprietary. \
The service also provides APIs to independent developers."
LICENSE = "GPL-3.0-only"

PV = "4.8.4"

RPM_NAME = "telegram-desktop-4.8.4-3.1.aarch64.rpm"
RPM_HASH = "8a0b78535ce450935ca0f019b4e63c0cebddc97e24673eab1a4c6275e09b1469831e2b793b45fdf53281ca39456f785e5a2ba1581a611eec7d0d7b8750a36963"

RPROVIDES:${PN} += "telegram-desktop"

RDEPENDS:${PN} += "hicolor-icon-theme \
icu \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6OpenGL.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6Svg.so.6 \
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
libcrypto.so.1.1 \
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
libprotobuf-lite.so.23.4.0 \
librnnoise.so.0 \
libsigc-3.0.so.0 \
libssl.so.1.1 \
libstdc++.so.6 \
libswresample.so.4 \
libswscale.so.7 \
libvpx.so.8 \
libxcb-keysyms.so.1 \
libxcb-record.so.0 \
libxcb-screensaver.so.0 \
libxcb.so.1 \
libxxhash.so.0 \
libz.so.1 \
qt6-imageformats"

inherit rpm
