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

RPM_NAME = "python311-resampy-0.4.2-3.1.noarch.rpm"
RPM_HASH = "a04c452550f7160d6ae1d680910371f7e2afcd3a5ff2705a04aa62434ff2c1582d94bd8df6f87cc55411f07a077bd54c0def2eead3233e94aaae410deb97f380"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-resampy \
python3.11dist-resampy \
python311-resampy \
python3dist-resampy"

RDEPENDS:${PN} += "python-abi \
python311-numba \
python311-numpy"

inherit rpm
