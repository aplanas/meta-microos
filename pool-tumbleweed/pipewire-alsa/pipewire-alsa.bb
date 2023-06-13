SUMMARY = "PipeWire media server ALSA support"
DESCRIPTION = "This package contains an ALSA plugin for the PipeWire media server."
LICENSE = "MIT"

PV = "0.3.71"

RPM_NAME = "pipewire-alsa-0.3.71-3.1.aarch64.rpm"
RPM_HASH = "4b4734a2e7729819e9a7af777aa43cbe642ebc00d16d6f446390233453048a215c5f3af07bf5dbe215b777f368e196ad44f432288b2ab30465104f55012090af"

RPROVIDES:${PN} += "config(pipewire-alsa) \
libasound_module_ctl_pipewire.so()(64bit) \
libasound_module_pcm_pipewire.so()(64bit) \
pipewire-alsa \
pipewire-alsa(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.0rc4)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libpipewire-0.3.so.0()(64bit) \
libpipewire-0_3-0"

inherit rpm
