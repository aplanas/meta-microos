SUMMARY = "Audible beat generator"
DESCRIPTION = "A program for Elementary OS that produces an audible beat — a click \
or other sound — at regular intervals that the user can set in beats \
per minute (BPM)."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "metronome-1.0.0-1.20.aarch64.rpm"
RPM_HASH = "776c795250dde9b6ee93fd7657406b25a908ada58d5b4dd16396fb1746503d4a16883926a40dca44d5766a7b42d0532e974bde5817d74b59956a02e1aa4332cb"

RPROVIDES:${PN} += "metronome"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0"

inherit rpm
