SUMMARY = "Console-based Audio Visualizer for Alsa"
DESCRIPTION = "C.A.V.A. is a bar spectrum audio visualizer for the Linux terminal using ALSA, pulseaudio or fifo buffer for input."
LICENSE = "MIT"

PV = "0.8.3"

RPM_NAME = "cava-0.8.3-1.3.aarch64.rpm"
RPM_HASH = "17e4d9cffad4b811f259e39c51782b08a27964136f80a1b0a20bb3d6679d5aada4930498cbf79d942e4268b45396d4822a5e26ad73935351727e40c1a212f14e"

RPROVIDES:${PN} += "cava cava(aarch-64)"
RDEPENDS:${PN} += "kbd ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libasound.so.2(ALSA_0.9.0rc4)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfftw3.so.3()(64bit) libiniparser.so.1()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libncursesw.so.6()(64bit) libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) libpulse-simple.so.0()(64bit) libpulse-simple.so.0(PULSE_0)(64bit) libpulse.so.0()(64bit) libpulse.so.0(PULSE_0)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
