SUMMARY = "A C++ library for resampling audio signals"
DESCRIPTION = "Zita resampler is a C++ library for resampling audio signals. It is \
designed to be used within a real-time processing context, to be \
fast, and to provide high-quality sample rate conversion."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.0"

RPM_NAME = "libzita-resampler1-1.8.0-1.10.aarch64.rpm"
RPM_HASH = "08be185ea791b1d6264f106eeffc3fd6bc1b1754feaf0c8fd2074f71d53e83577177b3c39993ea361d10245756ca3536be22b77d2bb146e9972658355f444fd6"

RPROVIDES:${PN} += "libzita-resampler.so.1()(64bit) \
libzita-resampler1 \
libzita-resampler1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
