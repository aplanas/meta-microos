SUMMARY = "Real-time MIDI input/output audio library"
DESCRIPTION = "PortMidi -- real-time MIDI input/output. \
This package contains the development environment to build applications and \
other libraries that use PortMidi."
LICENSE = "MIT"

PV = "2.0.4"

RPM_NAME = "portmidi-devel-2.0.4-2.4.aarch64.rpm"
RPM_HASH = "17e3526517555d4fca605ab0d5389f49f5304c19520c32e00b466238301964a5b84785e653de839f53b6fffc48bd88285c7b72cbeebec1aadfcae4cd32cb7823"

RPROVIDES:${PN} += "cmake-PortMidi \
pkgconfig-portmidi \
portmidi-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libportmidi2 \
pkgconfig-alsa"

inherit rpm
