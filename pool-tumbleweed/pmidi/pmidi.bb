SUMMARY = "A Command Line MIDI Player for ALSA"
DESCRIPTION = "pmidi is a command line MIDI player for ALSA."
LICENSE = "GPL-2.0-only"

PV = "1.7.1"

RPM_NAME = "pmidi-1.7.1-1.12.aarch64.rpm"
RPM_HASH = "f4a4bc4b5b89d0f396f341bd5d63066387e40674b3ef5d504025a82f171a1f27dfbd627b1caf8b0a28a34f2d9b5bb3e0b1cecc1ba0d0be57dde16d487d669dc3"

RPROVIDES:${PN} += "pmidi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6"

inherit rpm
