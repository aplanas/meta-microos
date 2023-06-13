SUMMARY = "Improved build system generator for Python C/C++/Fortran/Cython extensions"
DESCRIPTION = "Improved build system generator for Python C/C++/Fortran/Cython extensions"
LICENSE = "MIT"

PV = "0.17.5"

RPM_NAME = "python311-scikit-build-0.17.5-1.1.noarch.rpm"
RPM_HASH = "c8a39712d54bf1970e5d222125b2214c490fc469805e393938bfab7af6a6d1ee6882f004e4ef42adbc75b04ee5199545b4dc39a9b3d36408c61593158476e9ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(scikit-build) \
python311-scikit-build \
python3dist(scikit-build)"

RDEPENDS:${PN} += "cmake \
python(abi) \
python311-distro \
python311-packaging \
python311-setuptools \
python311-wheel"

inherit rpm
