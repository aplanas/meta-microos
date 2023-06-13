SUMMARY = "Fast Fourier Transform library"
DESCRIPTION = "A Fast Fourier Transform based up on the principle, 'Keep It Simple, Stupid'. \
Kiss FFT is a very small, reasonably efficient, mixed radix FFT library that \
can use either fixed or floating point data types."
LICENSE = "BSD-3-Clause & Unlicense"

PV = "131.1.0"

RPM_NAME = "kissfft-devel-131.1.0-2.3.aarch64.rpm"
RPM_HASH = "2a5302a9637dcf78d99838ee2afc393e5d1c0291170c2630b7d8b7bf0cf4314fc837f3eee0447e17ffb793de08fc6135c1691127da0e5b327f77814373a2479f"

RPROVIDES:${PN} += "cmake(kissfft) \
kissfft-devel \
kissfft-devel(aarch-64) \
pkgconfig(kissfft-float)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libkissfft-float131"

inherit rpm
