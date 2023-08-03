SUMMARY = "Digital modem program (hamradio)"
DESCRIPTION = "Digital modem program. \
Supports the following modes: \
CW, Contestia, DominoEX, Hell, MFSK, MT63, Olivia, Psk, RTTY, Thor, Throb \
WEFAX, WWV calibration, Frequency Analysis, Tune"
LICENSE = "GPL-3.0-only"

PV = "4.1.27"

RPM_NAME = "fldigi-4.1.27-1.1.aarch64.rpm"
RPM_HASH = "6ee3797fed9c1d29a59152e20c96536bab46d4acd467bdfccf681476d773c1447629199a4d7c19f8666e4683e425b47a182f212f902129b2bba027cada5d7eb4"

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
