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

RPM_NAME = "python310-resampy-0.4.2-2.1.noarch.rpm"
RPM_HASH = "f68d81eb4ca879ce9eea2514167ae17cbfd7aa65f5987aceaf1cc6028d62ccb6594ee635ee11697c410e692aba8fbb46d4f67da255a4854e0c297bd39518d410"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-resampy \
python3.10dist(resampy) \
python310-resampy \
python3dist(resampy)"

RDEPENDS:${PN} += "python(abi) \
python310-numba \
python310-numpy"

inherit rpm
