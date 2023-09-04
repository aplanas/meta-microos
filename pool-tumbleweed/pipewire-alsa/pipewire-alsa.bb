SUMMARY = "PipeWire media server ALSA support"
DESCRIPTION = "This package contains an ALSA plugin for the PipeWire media server."
LICENSE = "MIT"

PV = "0.3.77"

RPM_NAME = "pipewire-alsa-0.3.77-2.1.aarch64.rpm"
RPM_HASH = "cdac1dfaecfbee982f52306653d5faf4e8d520ed545f202a2cc6299689633d85f2d4d3eff9253cf99dc9a77bf87b3c97d352c7f3660e08787b719d7dc5c4eb66"

RPROVIDES:${PN} += "config-pipewire-alsa \
libasound-module-ctl-pipewire.so \
libasound-module-pcm-pipewire.so \
pipewire-alsa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libm.so.6 \
libpipewire-0-3-0 \
libpipewire-0.3.so.0"

inherit rpm
