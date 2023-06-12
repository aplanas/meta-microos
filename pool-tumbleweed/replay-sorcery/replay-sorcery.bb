SUMMARY = "Instant replay solution for Linux"
DESCRIPTION = "This program will constantly record the screen without using too much \
computer resources and, at the press of a key combination, will save \
the last 30 seconds."
LICENSE = "GPL-3.0-only"

PV = "0.6.0"

RPM_NAME = "replay-sorcery-0.6.0-2.6.aarch64.rpm"
RPM_HASH = "a64860bd3d370e6a3e951a178a3fbd632c66dd9e34663d11f07a582a22484419ff027e969d861ba523b6807971cd4490c57130a2344f9e9b8373fa3c9d8f564d"

RPROVIDES:${PN} += "replay-sorcery \
replay-sorcery(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libavcodec.so.58.134()(64bit) \
libavcodec.so.58.134(LIBAVCODEC_58)(64bit) \
libavdevice.so.58.13()(64bit) \
libavdevice.so.58.13(LIBAVDEVICE_58)(64bit) \
libavfilter.so.7.110()(64bit) \
libavfilter.so.7.110(LIBAVFILTER_7)(64bit) \
libavformat.so.58.76()(64bit) \
libavformat.so.58.76(LIBAVFORMAT_58)(64bit) \
libavutil.so.56.70()(64bit) \
libavutil.so.56.70(LIBAVUTIL_56)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdrm.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
permissions \
systemd"

inherit rpm
