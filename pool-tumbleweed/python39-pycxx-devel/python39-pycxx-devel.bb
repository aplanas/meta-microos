SUMMARY = "Development files for pycxx applications"
DESCRIPTION = "PyCXX is a set of classes to help create extensions of Python in the \
C++ language. The first part encapsulates the Python C API taking care \
of exceptions and ref counting. The second part supports the building \
of Python extension modules in C++."
LICENSE = "BSD-3-Clause"

PV = "7.1.7"

RPM_NAME = "python39-pycxx-devel-7.1.7-1.7.noarch.rpm"
RPM_HASH = "617b65912bacc42ff2001e7e23d678442b23fa6dfd1fc9672d1052f16f9b398c3e5d4a3557a79d4bf76c0343084edeb22eb0bdd1f9c7da2073c4f9f7b9c638e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-CXX-devel \
python39-cxx-devel \
python39-pycxx-devel"

RDEPENDS:${PN} += "python39-pycxx"

inherit rpm
