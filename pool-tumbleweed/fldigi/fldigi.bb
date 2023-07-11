SUMMARY = "Digital modem program (hamradio)"
DESCRIPTION = "Digital modem program. \
Supports the following modes: \
CW, Contestia, DominoEX, Hell, MFSK, MT63, Olivia, Psk, RTTY, Thor, Throb \
WEFAX, WWV calibration, Frequency Analysis, Tune"
LICENSE = "GPL-3.0-only"

PV = "4.1.26"

RPM_NAME = "fldigi-4.1.26-1.4.aarch64.rpm"
RPM_HASH = "da84672a50bb6f4828de81b5b8cfd082b3e9a0b73b0170da23fd7a4e2e17fac96b34be3172d628e6856eecf37dcad68588216fc911c34dea764a60a6f01e4fd0"

RPROVIDES:${PN} += "fldigi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libfltk-images.so.1.3 \
libfltk.so.1.3 \
libflxmlrpc.so.1 \
libgcc-s.so.1 \
libhamlib.so.4 \
libm.so.6 \
libpng16.so.16 \
libportaudio.so.2 \
libpulse-simple.so.0 \
libpulse.so.0 \
libsamplerate.so.0 \
libsndfile.so.1 \
libstdc++.so.6 \
libudev.so.1 \
update-desktop-files"

inherit rpm
