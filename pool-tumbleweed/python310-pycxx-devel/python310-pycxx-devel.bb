SUMMARY = "Development files for pycxx applications"
DESCRIPTION = "PyCXX is a set of classes to help create extensions of Python in the \
C++ language. The first part encapsulates the Python C API taking care \
of exceptions and ref counting. The second part supports the building \
of Python extension modules in C++."
LICENSE = "BSD-3-Clause"

PV = "7.1.7"

RPM_NAME = "python310-pycxx-devel-7.1.7-1.7.noarch.rpm"
RPM_HASH = "3bdf151f7248c589d0d36dcb9553837afb5eece2b3985dd993b9e52b2feb87cf870954432207b647dfbdc21d853f8de6e6884c964065ea4d1450595a720f6c47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-CXX-devel \
python310-cxx-devel \
python310-pycxx-devel"

RDEPENDS:${PN} += "python310-pycxx"

inherit rpm
