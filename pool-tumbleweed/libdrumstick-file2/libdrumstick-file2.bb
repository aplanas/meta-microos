SUMMARY = "MIDI Sequencer C++ Library"
DESCRIPTION = "MIDI Sequencer C++ Library Bindings for Qt5 and ALSA. \
This library includes classes providing file input and output in formats \
commonly used by MIDI programs. Currently, SMF (standard MIDI file) \
read/write and WRK (Cakewalk) file read are supported. This library does not \
depend on ALSA."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.7.2"

RPM_NAME = "libdrumstick-file2-2.7.2-1.4.aarch64.rpm"
RPM_HASH = "ececcd326d788ffc4d7ab9f1fffb28ac353330b7027709692fafc87c4693bb12aefc243dad147ae3fca2065cdd3e296c0d6ffb62f42c825635e2b67c745bf435"

RPROVIDES:${PN} += "libdrumstick-file.so.2 \
libdrumstick-file2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
