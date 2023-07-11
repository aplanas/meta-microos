SUMMARY = "A Real-Time Software Synthesizer That Uses Soundfont(tm)"
DESCRIPTION = "FluidSynth (formerly IIWU Synth) is a real-time software synthesizer \
based on the SoundFont(tm) 2 specifications. It can read MIDI events \
from the MIDI input device and render them to the audio device. It \
can also play MIDI files."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.3"

RPM_NAME = "fluidsynth-2.3.3-1.1.aarch64.rpm"
RPM_HASH = "bc5cf6741ebc2c2eeff4c50be35c5ad2fce28fe075401063293e3569ed87dfda49ae79a77151270427897429f8bacb76f4f3d70f7dcd6bcafe36763455f22b5c"

RPROVIDES:${PN} += "fluidsynth"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libfluidsynth.so.3 \
libglib-2.0.so.0 \
libsystemd.so.0"

inherit rpm
