SUMMARY = "PipeWire PulseAudio implementation"
DESCRIPTION = "This package provides a PulseAudio implementation based on PipeWire"
LICENSE = "MIT"

PV = "0.3.72"

RPM_NAME = "pipewire-pulseaudio-0.3.72-1.1.aarch64.rpm"
RPM_HASH = "2fab313ba841223060e4fcb9e4b4cacac4a6d2deac3a2335e8c84c7f2d1985d37b6ffc8a6f4c8770065123bec915cb7d6cdcb7dd8b96f48210c87c2600a11302"

RPROVIDES:${PN} += "pipewire-pulseaudio \
pulseaudio-daemon"

RDEPENDS:${PN} += "/usr/bin/sh \
libpipewire-0-3-0 \
pipewire \
pulseaudio-setup \
pulseaudio-utils"

inherit rpm
