SUMMARY = "PipeWire media server ALSA support"
DESCRIPTION = "This package contains an ALSA plugin for the PipeWire media server."
LICENSE = "MIT"

PV = "0.3.71"

RPM_NAME = "pipewire-alsa-0.3.71-3.1.aarch64.rpm"
RPM_HASH = "4b4734a2e7729819e9a7af777aa43cbe642ebc00d16d6f446390233453048a215c5f3af07bf5dbe215b777f368e196ad44f432288b2ab30465104f55012090af"

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
