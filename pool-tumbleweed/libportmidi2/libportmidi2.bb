SUMMARY = "Real-time MIDI input/output audio library"
DESCRIPTION = "PortMidi -- a library for real-time MIDI input/output audio. \
This package contains the shared library that is required at runtime for every \
application that uses PortMidi."
LICENSE = "MIT"

PV = "2.0.4"

RPM_NAME = "libportmidi2-2.0.4-2.3.aarch64.rpm"
RPM_HASH = "7f5b5ddb9e95b9c63c07c8bf42665287233958a64d96fc21423e907bc7dba56f0d215d447036807958283e56c1f3ff0244129600b5f2cbd48130d3189578ae0c"

RPROVIDES:${PN} += "libportmidi.so.2()(64bit) \
libportmidi2 \
libportmidi2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libasound.so.2()(64bit) \
libc.so.6()(64bit)"

inherit rpm
