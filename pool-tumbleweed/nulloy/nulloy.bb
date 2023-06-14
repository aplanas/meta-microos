SUMMARY = "Music player with a Waveform Progress Bar"
DESCRIPTION = "Nulloy is a opensource, simple and clean music player with a Waveform \
Progressbar. It is written in C++ using QT."
LICENSE = "GPL-3.0-only"

PV = "0.9.5"

RPM_NAME = "nulloy-0.9.5-1.9.aarch64.rpm"
RPM_HASH = "0060c8453d6bf8aa9635cb2a380805d03b342ad77a1322c523ba4165a90294054ea5f65e6ed2cb4c785befeeffab603063fd70892afe6be1809190081aa4cdde"

RPROVIDES:${PN} += "nulloy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Script.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libxcb.so.1 \
libz.so.1"

inherit rpm
