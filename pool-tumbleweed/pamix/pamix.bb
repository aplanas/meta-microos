SUMMARY = "'alsamixer' for pulseaudio"
DESCRIPTION = "ncurses pulseaudio mixer similar to pavucontrol and alsamixer"
LICENSE = "MIT"

PV = "1.6"

RPM_NAME = "pamix-1.6-1.25.aarch64.rpm"
RPM_HASH = "7515fdb0937f9d7890df0ad2ce3f1c5b7897b0019cf06aa747455008c1a559c41f39cce8b1581f130ceb01875837632ded86b8142991533c06554476705b9cf8"

RPROVIDES:${PN} += "config(pamix) \
pamix \
pamix(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libncursesw.so.6()(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libstdc++.so.6()(64bit) \
libtinfo.so.6()(64bit)"

inherit rpm
