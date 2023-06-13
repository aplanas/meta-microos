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

RPM_NAME = "python311-PyWavelets-1.4.1-1.5.aarch64.rpm"
RPM_HASH = "6c2050372e1e9eb40ea24f0e522dd909893e101103d3c574f131080e67eb3577f2e49dc8c02221cbc2d952a5006e4b2b4e1fe33dc27ab10263d5e70eaf3c8b9e"

RPROVIDES:${PN} += "python3.11dist(pywavelets) \
python311-PyWavelets \
python311-PyWavelets(aarch-64) \
python311-PyWavelets-doc \
python3dist(pywavelets)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi) \
python311-numpy"

inherit rpm
