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
