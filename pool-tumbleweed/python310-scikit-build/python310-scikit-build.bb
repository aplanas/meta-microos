SUMMARY = "Improved build system generator for Python C/C++/Fortran/Cython extensions"
DESCRIPTION = "Improved build system generator for Python C/C++/Fortran/Cython extensions"
LICENSE = "MIT"

PV = "0.17.5"

RPM_NAME = "python310-scikit-build-0.17.5-1.1.noarch.rpm"
RPM_HASH = "e3000f5ceb8d2772677580d57b7c18f1a306db62005c8ca1090d94da6f4e9d19c8cd382cb1bc86fe32c39b205cd1cdd5749793b82638ec75a1889f2ef3cea191"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-scikit-build \
python3.10dist-scikit-build \
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
