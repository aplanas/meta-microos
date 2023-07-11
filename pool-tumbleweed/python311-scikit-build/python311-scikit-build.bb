SUMMARY = "Improved build system generator for Python C/C++/Fortran/Cython extensions"
DESCRIPTION = "Improved build system generator for Python C/C++/Fortran/Cython extensions"
LICENSE = "MIT"

PV = "0.17.6"

RPM_NAME = "python311-scikit-build-0.17.6-1.1.noarch.rpm"
RPM_HASH = "2599588281cd64dee1fdcc610ed63b0010b074e1f8d709820f7dbaa8879c852987db0dcf2ebc7f5427b1e88a8678825f41bc2c6e7d5a3bed138b69aa842a78b5"
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
