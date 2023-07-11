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

RPM_NAME = "python310-PyWavelets-1.4.1-1.7.aarch64.rpm"
RPM_HASH = "05cb94860e14aae5dc430556a112da970368f63cef581728ad9bc6d8237c521dab641e2792a3ca9feb52e33a36380053b78c9f7b1ca9a74809c0b593312c6c02"

RPROVIDES:${PN} += "python3.10dist-pywavelets \
python310-PyWavelets \
python310-PyWavelets-doc \
python3dist-pywavelets"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-numpy"

inherit rpm
