SUMMARY = "Improved build system generator for Python C/C++/Fortran/Cython extensions"
DESCRIPTION = "Improved build system generator for Python C/C++/Fortran/Cython extensions"
LICENSE = "MIT"

PV = "0.17.6"

RPM_NAME = "python310-scikit-build-0.17.6-1.1.noarch.rpm"
RPM_HASH = "d10bac990d74d767f035d37a0101ec3bb6ab03aa2a8d6045aa3a70fc94cc3b7fb376f68f4736f339057ac1fef45af9c6f7e04f9f5c7a605bf94885b977682ccd"
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
