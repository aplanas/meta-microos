SUMMARY = "Real-time MIDI input/output audio tools"
DESCRIPTION = "PortMidi -- real-time MIDI input/output. \
This package contains some command-line applications to test, configure and use \
midi devices through PortMidi."
LICENSE = "MIT"

PV = "2.0.4"

RPM_NAME = "portmidi-2.0.4-2.4.aarch64.rpm"
RPM_HASH = "a71230f46ea3a45609b7bf01256341abd842dd1855064c5816f41d99263a56c28e0a3b4c5c0ccbda602417c875ddbfe1ec75f3407257ae383d2c35a4d55b06a5"

RPROVIDES:${PN} += "portmidi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libportmidi.so.2 \
libportmidi2"

inherit rpm
