SUMMARY = "C++ library for realtime MIDI input/ouput"
DESCRIPTION = "RtMidi is a set of C++ classes (RtMidiIn, RtMidiOut and API-specific \
classes) that provides a common API (Application Programming Interface) for \
realtime MIDI input/output across ALSA & JACK. \
 \
This package provides the shared library."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "librtmidi6-5.0.0-1.8.aarch64.rpm"
RPM_HASH = "782216fa89e5d14128043c32dfbbd4995be2721ecc198edd0d987033bbfa4ff2007336dd6e62e8affea5b2956ba469aa8f81a30195c1ef053ac090b8a32e10cc"

RPROVIDES:${PN} += "librtmidi.so.6 \
librtmidi6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libjack.so.0 \
libstdc++.so.6"

inherit rpm
