SUMMARY = "Signal resampling in Python"
DESCRIPTION = "This package implements the band-limited sinc interpolation method \
in Python for sampling rate conversion as described by: \
 \
Smith, Julius O. Digital Audio Resampling Home Page Center for \
Computer Research in Music and Acoustics (CCRMA), Stanford \
University, 2015-02-23. Web published at \
http://ccrma.stanford.edu/~jos/resample/."
LICENSE = "ISC"

PV = "0.4.2"

RPM_NAME = "python39-resampy-0.4.2-3.1.noarch.rpm"
RPM_HASH = "d9c13eb52937ba516b10000a0c593a75fa7be86065a7a90c8031f31acc2c1e07a2ee13ef3e8ba4c9100ebfcee77f68415bbdbf9be9804bc880c07b026f95427c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-resampy \
python39-resampy \
python3dist-resampy"

RDEPENDS:${PN} += "python-abi \
python39-numba \
python39-numpy"

inherit rpm
