SUMMARY = "PipeWire PulseAudio implementation"
DESCRIPTION = "This package provides a PulseAudio implementation based on PipeWire"
LICENSE = "MIT"

PV = "0.3.71"

RPM_NAME = "pipewire-pulseaudio-0.3.71-3.1.aarch64.rpm"
RPM_HASH = "869e64eecec73dcad48d0d8830ddc7c2f2d98e5d30299817909e84f9ea07a8388756b00d691e85d710b1e6753604da7ade4f47da21ea06a6d920637a18347d60"

RPROVIDES:${PN} += "pipewire-pulseaudio \
pulseaudio-daemon"

RDEPENDS:${PN} += "/bin/sh \
libpipewire-0-3-0 \
pipewire \
pulseaudio-setup \
pulseaudio-utils"

inherit rpm
