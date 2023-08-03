SUMMARY = "Improved build system generator for Python C/C++/Fortran/Cython extensions"
DESCRIPTION = "Improved build system generator for Python C/C++/Fortran/Cython extensions"
LICENSE = "MIT"

PV = "0.17.6"

RPM_NAME = "python311-scikit-build-0.17.6-1.2.noarch.rpm"
RPM_HASH = "eec41c756537fff26c6d5e0a12b907c2a65e423f9cdb653dd1a837c6dd2dfee38907e4cfc646c9848170702250ba949e328e3483dc4cebc16727cd41d7a68a62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-scikit-build \
python3.11dist-scikit-build \
python311-scikit-build \
python3dist-scikit-build"

RDEPENDS:${PN} += "cmake \
python-abi \
python311-distro \
python311-packaging \
python311-setuptools \
python311-wheel"

inherit rpm
