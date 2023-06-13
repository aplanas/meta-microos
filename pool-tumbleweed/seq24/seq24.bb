SUMMARY = "A Small, Real-Time MIDI Sequencer"
DESCRIPTION = "Seq24 is a real-time midi sequencer. It was created to provide a very \
simple interface for editing and playing MIDI 'loops.'"
LICENSE = "GPL-2.0+"

PV = "0.9.3"

RPM_NAME = "seq24-0.9.3-1.29.aarch64.rpm"
RPM_HASH = "12333ddcfc517f7d4a2e71bb451eeb005e4d7a9fbc0bfced984e94f7f5aab0af67f997cd44433302b077bebd8b89c2d38ef8f928ac1fda827fbee4800918e0b4"

RPROVIDES:${PN} += "application() \
application(seq24.desktop) \
seq24 \
seq24(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libasound.so.2()(64bit) \
libatkmm-1.6.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdkmm-2.4.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libglibmm-2.4.so.1()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libgtkmm-2.4.so.1()(64bit) \
libjack.so.0()(64bit) \
libsigc-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
