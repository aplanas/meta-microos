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

RPM_NAME = "python39-pyFFTW-0.13.1-1.6.aarch64.rpm"
RPM_HASH = "daa682acf62eda77827783429df33615fb7e9cc6760418eca17aa81884d6e65be0bdc730ba9fb5e04770704b48d7eb302e4e181169678dcaf50949758d39feb7"

RPROVIDES:${PN} += "python3.9dist-pyfftw \
python39-pyFFTW \
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
python39-dask \
python39-numpy \
python39-scipy"

inherit rpm
