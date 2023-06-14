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

RPM_NAME = "python39-resampy-0.4.2-2.1.noarch.rpm"
RPM_HASH = "7936381a3255cf26f6efc13aba1962c5da5658df2619d7a22b0556d6381c7fa9f6cbe0c1e67a23e01c175e7764a9acddfdbe781d28b2804e5396f444a8f072f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-resampy \
python39-resampy \
python3dist-resampy"

RDEPENDS:${PN} += "python-abi \
python39-numba \
python39-numpy"

inherit rpm
