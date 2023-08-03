SUMMARY = "Improved build system generator for Python C/C++/Fortran/Cython extensions"
DESCRIPTION = "Improved build system generator for Python C/C++/Fortran/Cython extensions"
LICENSE = "MIT"

PV = "0.17.6"

RPM_NAME = "python310-scikit-build-0.17.6-1.2.noarch.rpm"
RPM_HASH = "175d5c3d1338759ad4743603632103511fb85987af2ba7a1877735f0b7049d17d54f4a1039fe9397f8c5f4d22037f9ebc9bf7bc1a45914574406b60aa74ace5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-scikit-build \
python310-scikit-build \
python3dist-scikit-build"

RDEPENDS:${PN} += "cmake \
python-abi \
python310-distro \
python310-packaging \
python310-setuptools \
python310-tomli \
python310-wheel"

inherit rpm
