SUMMARY = "LADSPA plugin for librubberband"
DESCRIPTION = "Package rubberband-ladspa is LADSPA plugin that can change the pitch of a sound in real-time."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.0"

RPM_NAME = "rubberband-ladspa-3.1.0-1.4.aarch64.rpm"
RPM_HASH = "07f4d721e53bba666de30165ed6960aaf0b45948475476f9b545ddb66195c8d1c4ff4283085cc126a97cdc5b7d191cf290c11cd46d45604cce951483a931a73d"

RPROVIDES:${PN} += "rubberband-ladspa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3.so.3 \
libgcc-s.so.1 \
libm.so.6 \
librubberband2 \
libstdc++.so.6"

inherit rpm
