SUMMARY = "Improved build system generator for Python C/C++/Fortran/Cython extensions"
DESCRIPTION = "Improved build system generator for Python C/C++/Fortran/Cython extensions"
LICENSE = "MIT"

PV = "0.17.6"

RPM_NAME = "python39-scikit-build-0.17.6-1.1.noarch.rpm"
RPM_HASH = "cbbe0c7d682a12e87d2ec6fcb0516dedd109ce264e67b37b46ed90e7b7849b37142c2c178843f05fb2f749256e12bfaf007b8e43f737f3f38df7bce1ad981ab3"
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
