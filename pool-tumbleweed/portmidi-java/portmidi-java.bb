SUMMARY = "Java native bindings for portmidi"
DESCRIPTION = "PortMidi -- real-time MIDI input/output. \
This package contains bindings to use portmidi from Java."
LICENSE = "MIT"

PV = "2.0.4"

RPM_NAME = "portmidi-java-2.0.4-2.3.aarch64.rpm"
RPM_HASH = "f044338e967853f4f3bebba13bda91f12916420d2e286ececb07b9536f154e4e7f3734aa93cd881c94f2edb7a034bcf47e963fb3e96a38df6beb8d934ca42986"

RPROVIDES:${PN} += "libpmjni.so.2()(64bit) \
portmidi-java \
portmidi-java(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/sbin/ldconfig \
java \
ld-linux-aarch64.so.1()(64bit) \
libasound.so.2()(64bit) \
libc.so.6()(64bit) \
libportmidi2"

inherit rpm
