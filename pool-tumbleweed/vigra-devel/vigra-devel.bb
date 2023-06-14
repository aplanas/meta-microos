SUMMARY = "Development files for VIGRA Library"
DESCRIPTION = "VIGRA stands for 'Vision with Generic Algorithms'. It is a novel \
computer vision library that puts its main emphasis on customizable \
algorithms and data structures. By using template techniques similar to \
those in the C++ Standard Template Library, you can easily adapt any \
VIGRA component to the needs of your application, without giving up \
execution speed."
LICENSE = "MIT"

PV = "1.11.1"

RPM_NAME = "vigra-devel-1.11.1-4.5.aarch64.rpm"
RPM_HASH = "bf5c62e37f4b2ff09d8c6f73c00b793eba96b6244b093c998bf171cc3fc1e38cfd01d46a10079227eb9610f0b907c1579320f278c38ec972adbd39181b0516e0"

RPROVIDES:${PN} += "vigra-devel"

RDEPENDS:${PN} += "/usr/bin/python3 \
fftw3-devel \
hdf5-devel \
libjpeg-devel \
libpng-devel \
libstdc++-devel \
libtiff-devel \
libvigraimpex11 \
openexr-devel \
python3-base \
zlib-devel"

inherit rpm
