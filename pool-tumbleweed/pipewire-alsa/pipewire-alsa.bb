SUMMARY = "PipeWire media server ALSA support"
DESCRIPTION = "This package contains an ALSA plugin for the PipeWire media server."
LICENSE = "MIT"

PV = "0.3.76"

RPM_NAME = "pipewire-alsa-0.3.76-1.1.aarch64.rpm"
RPM_HASH = "f7199b91c2f176cf7454d443fecb970fd7ae2b971c5367ce3941feb6738535e04c8bd0a896cc9dd85251bc252c60761f39db0ee39f7689f778fa672e1df92a95"

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
