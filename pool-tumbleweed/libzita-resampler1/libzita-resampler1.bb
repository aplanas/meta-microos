SUMMARY = "A C++ library for resampling audio signals"
DESCRIPTION = "Zita resampler is a C++ library for resampling audio signals. It is \
designed to be used within a real-time processing context, to be \
fast, and to provide high-quality sample rate conversion."
LICENSE = "GPL-3.0-or-later"

PV = "1.11.2"

RPM_NAME = "libzita-resampler1-1.11.2-1.1.aarch64.rpm"
RPM_HASH = "ef92fad911930481c7c9457f2c45a485171cb69214e046fec444bbccec3931b0637fa55632dace1336b41064457524804bcbde680f61b9a9b8973c6b3b10f985"

RPROVIDES:${PN} += "libzita-resampler.so.1 \
libzita-resampler1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
