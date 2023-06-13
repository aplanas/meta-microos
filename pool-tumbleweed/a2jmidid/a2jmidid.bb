SUMMARY = "A modular multi-system emulator system"
DESCRIPTION = "a2jmidid is a daemon for exposing legacy ALSA sequencer applications in JACK \
MIDI systems."
LICENSE = "GPL-2.0-or-later"

PV = "9"

RPM_NAME = "a2jmidid-9-2.9.aarch64.rpm"
RPM_HASH = "85725d42f83b84b93a3117be77349e2cccde0f49f206b6c332f26c2ac28f85a4854ae2b6d0f495b5fceae610281e3070603001be3e2809f2e82e7b2e86510d92"

RPROVIDES:${PN} += "a2jmidid \
a2jmidid(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
ld-linux-aarch64.so.1()(64bit) \
libasound.so.2()(64bit) \
libc.so.6()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libjack.so.0()(64bit)"

inherit rpm
