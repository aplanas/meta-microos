SUMMARY = "Music player with a Waveform Progress Bar"
DESCRIPTION = "Nulloy is a opensource, simple and clean music player with a Waveform \
Progressbar. It is written in C++ using QT."
LICENSE = "GPL-3.0-only"

PV = "0.9.5"

RPM_NAME = "nulloy-0.9.5-1.11.aarch64.rpm"
RPM_HASH = "8a59a960f463b11bbda1c0ffaeaf7691e83b290f7b99fe393fdb282d89b5429978e5818c1ed6370b74fd8bf83a6f9307d2ab48f4ad351e78abc0b06ff270489d"

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
