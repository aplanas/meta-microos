SUMMARY = "PyWavelets is a Python wavelet transforms module"
DESCRIPTION = "PyWavelets is a Python wavelet transforms module that can do: \
 \
  * 1D and 2D Forward and Inverse Discrete Wavelet Transform (DWT and IDWT) \
  * 1D and 2D Stationary Wavelet Transform (Undecimated Wavelet Transform) \
  * 1D and 2D Wavelet Packet decomposition and reconstruction \
  * Computing Approximations of wavelet and scaling functions \
  * Over seventy built-in wavelet filters and support for custom wavelets \
  * Single and double precision calculations \
  * Results compatibility with Matlab Wavelet Toolbox"
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "python310-PyWavelets-1.4.1-1.5.aarch64.rpm"
RPM_HASH = "20e79234adb02135e60a151633958795ffe683f0025eb41f1f3f378f1e3eadee460e07f64a1bd35d665dec429f4b4da7f9033e9bfcf532af8215cb3c1bd0b86b"

RPROVIDES:${PN} += "python3-PyWavelets \
python3-PyWavelets-doc \
python3.10dist(pywavelets) \
python310-PyWavelets \
python310-PyWavelets(aarch-64) \
python310-PyWavelets-doc \
python3dist(pywavelets)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi) \
python310-numpy"

inherit rpm
