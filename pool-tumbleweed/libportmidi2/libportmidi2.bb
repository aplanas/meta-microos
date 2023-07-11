SUMMARY = "Real-time MIDI input/output audio library"
DESCRIPTION = "PortMidi -- a library for real-time MIDI input/output audio. \
This package contains the shared library that is required at runtime for every \
application that uses PortMidi."
LICENSE = "MIT"

PV = "2.0.4"

RPM_NAME = "libportmidi2-2.0.4-2.4.aarch64.rpm"
RPM_HASH = "192811204b19cfd222e60f4bbe5302de0f90a1bcada12d9db506a4d16abbe1ba70ca8fcfa6a752f540953ef7dba9ff88fe556e1b4b2a9bd4297d684559e73212"

RPROVIDES:${PN} += "libportmidi.so.2 \
libportmidi2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6"

inherit rpm
