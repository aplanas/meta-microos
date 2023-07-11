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

RPM_NAME = "librtaudio6-5.1.0-1.16.aarch64.rpm"
RPM_HASH = "089fba5f7af39961253859b00f502171290b4db9ac2a0194ed707d3f0b4d0a9c89890cb51bd2fb48ee7994817375c765705ef7c5d7b8fbf856d73b3c878b5c18"

RPROVIDES:${PN} += "librtaudio.so.6 \
librtaudio6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libjack.so.0 \
libpulse-simple.so.0 \
libstdc++.so.6"

inherit rpm
