SUMMARY = "PipeWire PulseAudio implementation"
DESCRIPTION = "This package provides a PulseAudio implementation based on PipeWire"
LICENSE = "MIT"

PV = "0.3.79"

RPM_NAME = "pipewire-pulseaudio-0.3.79-1.2.aarch64.rpm"
RPM_HASH = "d8bc78285af5c58dbe956f477cf0957dff83071b9e06b9142493de1cf71edcf437d04903accb6cd53fd91ca18aad81082864241c4f4e92ec4eb6d4d0509d7530"

RPROVIDES:${PN} += "pipewire-pulseaudio \
pulseaudio-daemon"

RDEPENDS:${PN} += "/usr/bin/sh \
libpipewire-0-3-0 \
pipewire \
pulseaudio-setup \
pulseaudio-utils"

inherit rpm
