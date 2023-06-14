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

RPROVIDES:${PN} += "jack-/usr/bin/jack-connect \
jack-example-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libjack.so.0 \
libjacknet.so.0 \
libjackserver.so.0 \
libm.so.6 \
libopus.so.0 \
libreadline.so.8 \
libsamplerate.so.0 \
libsndfile.so.1 \
libstdc++.so.6"

inherit rpm
