SUMMARY = "A Small, Real-Time MIDI Sequencer"
DESCRIPTION = "Seq24 is a real-time midi sequencer. It was created to provide a very \
simple interface for editing and playing MIDI 'loops.'"
LICENSE = "GPL-2.0+"

PV = "0.9.3"

RPM_NAME = "seq24-0.9.3-1.30.aarch64.rpm"
RPM_HASH = "39c468c5c6e33751ced7c793207f041e182ccaf3dc9b7fc92b2853715d01e4c5ede7533d9779f7c6e261c61b6fe32be33010d7843dc110f6c08a099c26d61ffd"

RPROVIDES:${PN} += "seq24"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libatkmm-1.6.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-x11-2.0.so.0 \
libgdkmm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgtk-x11-2.0.so.0 \
libgtkmm-2.4.so.1 \
libjack.so.0 \
libsigc-2.0.so.0 \
libstdc++.so.6"

inherit rpm
