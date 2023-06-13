SUMMARY = "Official examples and tools from the JACK project"
DESCRIPTION = "JACK is system for handling real-time, low latency audio \
(and MIDI). It runs on GNU/Linux, Solaris, FreeBSD, OS X and \
Windows (and can be ported to other POSIX-conformant \
platforms). It can connect a number of different \
applications to an audio device, as well as allowing them to \
share audio between themselves. \
 \
This package contains the the official JACK example clients \
and tools."
LICENSE = "GPL-2.0"

PV = "1"

RPM_NAME = "jack-example-tools-1-1.6.aarch64.rpm"
RPM_HASH = "8f02ead8e4d2a6acfe1aded73f5dcdb00028b83354b0abc71198e64571edadb7ae45df4c65e1d00bd312af2fe4f1f056f86bdfb7ab594f6b6278867142084bb7"

RPROVIDES:${PN} += "jack-example-tools \
jack-example-tools(aarch-64) \
jack:/usr/bin/jack_connect"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.0rc4)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libjack.so.0()(64bit) \
libjacknet.so.0()(64bit) \
libjackserver.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libopus.so.0()(64bit) \
libreadline.so.8()(64bit) \
libsamplerate.so.0()(64bit) \
libsamplerate.so.0(libsamplerate.so.0.0)(64bit) \
libsndfile.so.1()(64bit) \
libsndfile.so.1(libsndfile.so.1.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit)"

inherit rpm
