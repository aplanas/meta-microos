SUMMARY = "The SoX Resampler library"
DESCRIPTION = "The SoX Resampler library performs one-dimensional sample-rate \
conversion – it may be used, for example, to resample PCM-encoded \
audio."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.3"

RPM_NAME = "libsoxr0-0.1.3-2.15.aarch64.rpm"
RPM_HASH = "ed6feddfc874fdc18afdb046d3dbe4357edf69318a1cd7b89c610db68907543ce2b9a10e91ada3d8b2d0c75ec60b0081ae629f7d8041496be601afb8e636ea6f"

RPROVIDES:${PN} += "libsoxr.so.0()(64bit) \
libsoxr0 \
libsoxr0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgomp.so.1()(64bit) \
libm.so.6()(64bit)"

inherit rpm
