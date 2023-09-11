SUMMARY = "Digital modem program (hamradio)"
DESCRIPTION = "Digital modem program. \
Supports the following modes: \
CW, Contestia, DominoEX, Hell, MFSK, MT63, Olivia, Psk, RTTY, Thor, Throb \
WEFAX, WWV calibration, Frequency Analysis, Tune"
LICENSE = "GPL-3.0-only"

PV = "4.2.00"

RPM_NAME = "fldigi-4.2.00-1.1.aarch64.rpm"
RPM_HASH = "d2572c865055faccfd3c196f15f985f1d56fc5b28e21f3ba07067d8255aa14fb9d68274888e9cafdc07642f34e0088cc43d99f8e448b95b19ebbbc653bab02e3"

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
