SUMMARY = "Real-time MIDI input/output audio tools"
DESCRIPTION = "PortMidi -- real-time MIDI input/output. \
This package contains some command-line applications to test, configure and use \
midi devices through PortMidi."
LICENSE = "MIT"

PV = "2.0.4"

RPM_NAME = "portmidi-2.0.4-2.3.aarch64.rpm"
RPM_HASH = "6ab60aee45bd2a62b936249af1f152d039b0841fbcb0abf968a50a51f7cc7474b44534b997c3654a4c5590ceaff31a98407d869a9ec67afc98f6bf5c6d406c9e"

RPROVIDES:${PN} += "portmidi \
portmidi(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libportmidi.so.2()(64bit) \
libportmidi2"

inherit rpm
