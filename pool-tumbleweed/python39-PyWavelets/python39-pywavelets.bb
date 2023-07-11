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

RPM_NAME = "python39-PyWavelets-1.4.1-1.7.aarch64.rpm"
RPM_HASH = "a77aa80278589bf32b202a66f608e49da304a12f06b4ac51980268f41415557996d3728b97b7c8b0a24168bf5895d8dbd79910bc1ec0364a79b5e29a40f6c4db"

RPROVIDES:${PN} += "python3.9dist-pywavelets \
python39-PyWavelets \
python39-PyWavelets-doc \
python3dist-pywavelets"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-numpy"

inherit rpm
