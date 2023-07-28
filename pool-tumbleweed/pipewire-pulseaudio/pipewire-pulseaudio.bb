SUMMARY = "PipeWire PulseAudio implementation"
DESCRIPTION = "This package provides a PulseAudio implementation based on PipeWire"
LICENSE = "MIT"

PV = "0.3.74"

RPM_NAME = "pipewire-pulseaudio-0.3.74-1.1.aarch64.rpm"
RPM_HASH = "c513ab878cd173d2b63d2690d3849ca6d2c8e4ec7e092b5dd2e1df749b1c8f0b59ffb4bd53b133811c8f70889131e53b43274012f58320f192bf973ea727dcbd"

RPROVIDES:${PN} += "pipewire-pulseaudio \
pulseaudio-daemon"

RDEPENDS:${PN} += "/usr/bin/sh \
libpipewire-0-3-0 \
pipewire \
pulseaudio-setup \
pulseaudio-utils"

inherit rpm
