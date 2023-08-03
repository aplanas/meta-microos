SUMMARY = "Improved build system generator for Python C/C++/Fortran/Cython extensions"
DESCRIPTION = "Improved build system generator for Python C/C++/Fortran/Cython extensions"
LICENSE = "MIT"

PV = "0.17.6"

RPM_NAME = "python39-scikit-build-0.17.6-1.2.noarch.rpm"
RPM_HASH = "4c3d5c3800830e9167663a62ccac7f3f446bc92e5fcbc804222be5a977451ab91e33a68984aaf4b298bd5f13e15743be2ca016e36d938f54629c1dca134b46ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-scikit-build \
python39-scikit-build \
python3dist-scikit-build"

RDEPENDS:${PN} += "cmake \
python-abi \
python39-distro \
python39-packaging \
python39-setuptools \
python39-tomli \
python39-wheel"

inherit rpm
