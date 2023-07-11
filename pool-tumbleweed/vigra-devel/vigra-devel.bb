SUMMARY = "Development files for VIGRA Library"
DESCRIPTION = "VIGRA stands for 'Vision with Generic Algorithms'. It is a novel \
computer vision library that puts its main emphasis on customizable \
algorithms and data structures. By using template techniques similar to \
those in the C++ Standard Template Library, you can easily adapt any \
VIGRA component to the needs of your application, without giving up \
execution speed."
LICENSE = "MIT"

PV = "1.11.1"

RPM_NAME = "vigra-devel-1.11.1-4.6.aarch64.rpm"
RPM_HASH = "0b3f66e6edda49105c4628d582a0bc425a207d384a1591b625f9e276557694f6d8b6ed848cef98db92fffabdade30066ab175533763c4d53cdd6d7c856459612"

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
