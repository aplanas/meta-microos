SUMMARY = "Java native bindings for portmidi"
DESCRIPTION = "PortMidi -- real-time MIDI input/output. \
This package contains bindings to use portmidi from Java."
LICENSE = "MIT"

PV = "2.0.4"

RPM_NAME = "portmidi-java-2.0.4-2.4.aarch64.rpm"
RPM_HASH = "70211a3a8615741d36d9180c01c8c4f0d1e9a198f5d522c5a2c0439867a57ac5389d2891e12c40e9e02d00f37ff0945f283927cc1381f414b3ce9238740e4236"

RPROVIDES:${PN} += "libpmjni.so.2 \
portmidi-java"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/bash \
java \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libportmidi2"

inherit rpm
