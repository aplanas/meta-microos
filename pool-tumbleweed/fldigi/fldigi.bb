SUMMARY = "Digital modem program (hamradio)"
DESCRIPTION = "Digital modem program. \
Supports the following modes: \
CW, Contestia, DominoEX, Hell, MFSK, MT63, Olivia, Psk, RTTY, Thor, Throb \
WEFAX, WWV calibration, Frequency Analysis, Tune"
LICENSE = "GPL-3.0-only"

PV = "4.1.26"

RPM_NAME = "fldigi-4.1.26-1.3.aarch64.rpm"
RPM_HASH = "7f50b6d6a00564d27ab43c8f528e315c82ce00799d0201bab5f52df8d7a2e3315da5a17f340c646dcedf6e157ada09185f08d2bae6f060bcbf7b239a9a905934"

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
