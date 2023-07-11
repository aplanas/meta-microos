SUMMARY = "PipeWire media server ALSA support"
DESCRIPTION = "This package contains an ALSA plugin for the PipeWire media server."
LICENSE = "MIT"

PV = "0.3.72"

RPM_NAME = "pipewire-alsa-0.3.72-1.1.aarch64.rpm"
RPM_HASH = "4f5406d9ede02494ef64b4e9651538f6ea52ec2a759e20181eed440bdd7364849b8f2cf7d0208484e0b71f73bd7cf88b801cf06cfff6cb7488961255a891edfc"

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
