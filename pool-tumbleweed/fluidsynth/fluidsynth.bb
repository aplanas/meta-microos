SUMMARY = "A Real-Time Software Synthesizer That Uses Soundfont(tm)"
DESCRIPTION = "FluidSynth (formerly IIWU Synth) is a real-time software synthesizer \
based on the SoundFont(tm) 2 specifications. It can read MIDI events \
from the MIDI input device and render them to the audio device. It \
can also play MIDI files."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.1"

RPM_NAME = "fluidsynth-2.3.1-2.3.aarch64.rpm"
RPM_HASH = "4d9358f75fc5c18df85308c469476d082a300c3b1c6ff65886c73cb26580a03f553d377f3cc8a042af1e950df3d14d9d637193c2da696e081235acded0f800ea"

RPROVIDES:${PN} += "fluidsynth \
fluidsynth(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL2-2.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfluidsynth.so.3()(64bit) \
libglib-2.0.so.0()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit)"

inherit rpm