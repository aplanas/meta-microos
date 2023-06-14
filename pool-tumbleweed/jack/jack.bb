SUMMARY = "Jack-Audio Connection Kit"
DESCRIPTION = "JACK is system for handling real-time, low latency audio \
(and MIDI). It runs on GNU/Linux, Solaris, FreeBSD, OS X and \
Windows (and can be ported to other POSIX-conformant \
platforms). It can connect a number of different \
applications to an audio device, as well as allowing them to \
share audio between themselves. Its clients can run in their \
own processes (ie. as normal applications), or can they can \
run within the JACK server (ie. as a 'plugin'). JACK also \
has support for distributing audio processing across a \
network, both fast & reliable LANs as well as slower, less \
reliable WANs."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.9.22"

RPM_NAME = "jack-1.9.22-2.1.aarch64.rpm"
RPM_HASH = "b38e97c59fa468bc92c7dfd10b70a2c0624751e733fe3703738f4ab1b3d91f65c1e56ac837c372c9b87f5281abcb92e8bfd6a97618cf3db4791bd6c34e152038"

RPROVIDES:${PN} += "jack \
jack-audio-connection-kit \
jack-daemon \
jack2"

RDEPENDS:${PN} += "jack-dbus \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libcelt0.so.2 \
libdbus-1.so.3 \
libffado.so.2 \
libgcc-s.so.1 \
libjackserver.so.0 \
libm.so.6 \
libopus.so.0 \
libsamplerate.so.0 \
libstdc++.so.6 \
libsystemd.so.0"

inherit rpm
