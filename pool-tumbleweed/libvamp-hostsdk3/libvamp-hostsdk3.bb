SUMMARY = "Library for Vamp audio analysis plugin hosts"
DESCRIPTION = "Vamp is an API for C and C++ plugins that process sampled audio data \
to produce descriptive output (measurements or semantic observations)."
LICENSE = "MIT"

PV = "2.10.0"

RPM_NAME = "libvamp-hostsdk3-2.10.0-1.13.aarch64.rpm"
RPM_HASH = "0a762a974ccce2d6b6e4c7ebdcf5cf0b6c6738ee9894dff4d46c56092552970eaced185d6d1b27a780b251af383ca2a35c9b7683262644b0a73ef379b66c5abc"

RPROVIDES:${PN} += "libvamp-hostsdk.so.3 \
libvamp-hostsdk3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
