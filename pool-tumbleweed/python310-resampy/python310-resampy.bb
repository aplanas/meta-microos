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

RPM_NAME = "python310-resampy-0.4.2-3.1.noarch.rpm"
RPM_HASH = "7f3647dc9c9ee119824b061201ef1d59fca736af98659b57d127360ecc8b2a813a56f275037b99854d92fbb4810c87bfdb753426ccdfce71490167f6dc08bf47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-resampy \
python310-resampy \
python3dist-resampy"

RDEPENDS:${PN} += "python-abi \
python310-numba \
python310-numpy"

inherit rpm
