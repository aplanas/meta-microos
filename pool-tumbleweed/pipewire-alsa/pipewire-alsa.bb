SUMMARY = "PipeWire media server ALSA support"
DESCRIPTION = "This package contains an ALSA plugin for the PipeWire media server."
LICENSE = "MIT"

PV = "0.3.74"

RPM_NAME = "pipewire-alsa-0.3.74-1.1.aarch64.rpm"
RPM_HASH = "79742278fd3d37f77614b4daf70b185871f461bac442e4c91e577869ace63d3dc8692862a43d02eb739a0119942081f864da7114ebfec5e13d912fa4989ea76e"

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
