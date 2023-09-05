SUMMARY = "PipeWire media server ALSA support"
DESCRIPTION = "This package contains an ALSA plugin for the PipeWire media server."
LICENSE = "MIT"

PV = "0.3.79"

RPM_NAME = "pipewire-alsa-0.3.79-1.2.aarch64.rpm"
RPM_HASH = "30d2216a3ca1f495e2814de982a74e0b6e7ec7b8a18cc4de803ce732e23ef8cd0903b8bbeedc8120b6279f39d6fde4ee8b81a42554e35b1dd9f579a0da54d222"

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
