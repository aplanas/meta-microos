SUMMARY = "The PipeWire SPA Tools"
DESCRIPTION = "SPA or Simple Plugin API is a plugin API. \
 \
This package provides spa-inspect and spa-monitor tools."
LICENSE = "MIT"

PV = "0.3.71"

RPM_NAME = "pipewire-spa-tools-0.3.71-3.1.aarch64.rpm"
RPM_HASH = "d191a88edf78963539a641f9feaa3693352ef75792c7cd01be8f1bc76e9e558edf09d85a3c0b7ffd7118a41b2e9d5d1dfe8677d05aeafcb1f59d26d111e72549"

RPROVIDES:${PN} += "pipewire-spa-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libm.so.6 \
libsndfile.so.1"

inherit rpm
