SUMMARY = "Python extensions in C++"
DESCRIPTION = "PyCXX is a set of classes to help create extensions of Python in the \
C++ language. The first part encapsulates the Python C API taking care \
of exceptions and ref counting. The second part supports the building \
of Python extension modules in C++."
LICENSE = "BSD-3-Clause"

PV = "7.1.7"

RPM_NAME = "python310-pycxx-7.1.7-1.7.noarch.rpm"
RPM_HASH = "2d27a70b1625701529938efd21d8e163cdf793dd7537e2ec4b00ee9dd594d6d55bd7fcc7b4bc30678e4b9612526958648faa5dc4c4d747d637b5942508cac52d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cxx \
python310-CXX \
python310-cxx \
python310-pycxx \
python3dist-cxx"

RDEPENDS:${PN} += "python-abi"

inherit rpm
