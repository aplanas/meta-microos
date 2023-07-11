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

RPM_NAME = "python310-pyFFTW-0.13.1-1.6.aarch64.rpm"
RPM_HASH = "0523948dd092af642273139d9a8c33d72146b4f54b55a5c8496b4cc67ec97031610206f13142382d9e6e9874969a3a8613b0dcec84089c72ce38b4ed5b2a848f"

RPROVIDES:${PN} += "python3.10dist-pyfftw \
python310-pyFFTW \
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
python310-dask \
python310-numpy \
python310-scipy"

inherit rpm
