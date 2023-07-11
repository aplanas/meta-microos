SUMMARY = "A pythonic wrapper around FFTW, the FFT library"
DESCRIPTION = "pyFFTW is a pythonic wrapper around the FFTW libary. \
An interface for all the possible transforms that FFTW can perform is provided. \
 \
Both the complex DFT and the real DFT are supported, as well as arbitrary \
axes of abitrary shaped and strided arrays, which makes it almost \
feature equivalent to standard and real FFT functions of ``numpy.fft`` \
(indeed, it supports the ``clongdouble`` dtype which ``numpy.fft`` does not). \
 \
Operating FFTW in multithreaded mode is supported. \
 \
A comprehensive unittest suite can be found with the source on the github \
repository."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "0.13.1"

RPM_NAME = "python311-pyFFTW-0.13.1-1.6.aarch64.rpm"
RPM_HASH = "3208f928d5698d2a71a6b8eb0d0428749b551cc8378ec7657a1529555c804ec9c2e8a94d8fee38a0b09f6b722f274ab789fe99bfbc673189b3c1d2497f949698"

RPROVIDES:${PN} += "python3-pyFFTW \
python3.11dist-pyfftw \
python311-pyFFTW \
python3dist-pyfftw"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3-threads.so.3 \
libfftw3.so.3 \
libfftw3f-threads.so.3 \
libfftw3f.so.3 \
libfftw3l-threads.so.3 \
libfftw3l.so.3 \
python-abi \
python311-dask \
python311-numpy \
python311-scipy"

inherit rpm
