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

RPM_NAME = "python311-PyWavelets-1.4.1-1.7.aarch64.rpm"
RPM_HASH = "721487eb5b6a8dd6b5f3e64efc6d55c167980cc55d60d1d1defbc8bc23eb6f8de412fe2a0f82571a145cb5929256559410b4c7d0d8ce237fc7cc33d9513fa70d"

RPROVIDES:${PN} += "python3-PyWavelets \
python3-PyWavelets-doc \
python3.11dist-pywavelets \
python311-PyWavelets \
python311-PyWavelets-doc \
python3dist-pywavelets"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-numpy"

inherit rpm
