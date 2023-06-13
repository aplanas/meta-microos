SUMMARY = "Real-time audio I/O library"
DESCRIPTION = "RtAudio is a set of C++ classes that provide a common API for \
realtime audio input/output across different operating systems. \
RtAudio allows simultaneous multi API support, supports dynamic \
connection of devices, provides extensive audio device parameter \
control, allows audio device capability probing, and has automatic \
internal conversion for data format, channel number compensation, \
(de)interleaving, and byte-swapping."
LICENSE = "MIT"

PV = "5.1.0"

RPM_NAME = "librtaudio6-5.1.0-1.15.aarch64.rpm"
RPM_HASH = "f619324ce36209602d642dd2e9a18184426b22f00d048e8d8ffc7f58a081bcb2397d4106da7931d7d52edf46fd5a7832f67d567ba9d3ba68e2debe4b7a3bc08b"

RPROVIDES:${PN} += "librtaudio.so.6()(64bit) \
librtaudio6 \
librtaudio6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.0rc4)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libjack.so.0()(64bit) \
libpulse-simple.so.0()(64bit) \
libpulse-simple.so.0(PULSE_0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
