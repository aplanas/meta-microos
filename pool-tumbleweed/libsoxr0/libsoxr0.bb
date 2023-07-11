SUMMARY = "The SoX Resampler library"
DESCRIPTION = "The SoX Resampler library performs one-dimensional sample-rate \
conversion – it may be used, for example, to resample PCM-encoded \
audio."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.3"

RPM_NAME = "libsoxr0-0.1.3-2.16.aarch64.rpm"
RPM_HASH = "e3977bc02ac47655d01c225493f591f2eefd97a9d5316e979df819c2447d565c40a9ddda35624ae6d852041b4d3df8b2daa33e19a28f46c7b3e25d25e1b6786e"

RPROVIDES:${PN} += "libsoxr.so.0 \
libsoxr0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
libm.so.6"

inherit rpm
