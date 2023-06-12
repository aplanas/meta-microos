SUMMARY = "Real-time MIDI input/output audio library"
DESCRIPTION = "PortMidi -- real-time MIDI input/output. \
This package contains the development environment to build applications and \
other libraries that use PortMidi."
LICENSE = "MIT"

PV = "2.0.4"

RPM_NAME = "portmidi-devel-2.0.4-2.3.aarch64.rpm"
RPM_HASH = "a9d19188c1fb9cbc04780fc8197971c144a901002f2d509a6b4e0749c5bb4c08ad4c79a50d039bdb24427311c94af93d2737fcf3eec0b5e7a9b7323a30871cfa"

RPROVIDES:${PN} += "cmake(PortMidi) \
pkgconfig(portmidi) \
portmidi-devel \
portmidi-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libportmidi2 \
pkgconfig(alsa)"

inherit rpm
