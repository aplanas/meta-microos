SUMMARY = "PipeWire PulseAudio implementation"
DESCRIPTION = "This package provides a PulseAudio implementation based on PipeWire"
LICENSE = "MIT"

PV = "0.3.77"

RPM_NAME = "pipewire-pulseaudio-0.3.77-2.1.aarch64.rpm"
RPM_HASH = "f558024d0997bac6c0f32ef0ada555332ddf3d08e3331ca8015dadd30ce91c0080b8ddef6b1acd33813d8af0dadb1e5ee053282c4679eaa2d1ca8e70e5b2647e"

RPROVIDES:${PN} += "pipewire-pulseaudio \
pulseaudio-daemon"

RDEPENDS:${PN} += "/usr/bin/sh \
libpipewire-0-3-0 \
pipewire \
pulseaudio-setup \
pulseaudio-utils"

inherit rpm
