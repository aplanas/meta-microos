SUMMARY = "Python extensions in C++"
DESCRIPTION = "PyCXX is a set of classes to help create extensions of Python in the \
C++ language. The first part encapsulates the Python C API taking care \
of exceptions and ref counting. The second part supports the building \
of Python extension modules in C++."
LICENSE = "BSD-3-Clause"

PV = "7.1.7"

RPM_NAME = "python39-pycxx-7.1.7-1.7.noarch.rpm"
RPM_HASH = "e4583f4db94a88e238f0a1e6e2059ddb648af76b0e655d8a40e8bfd863f6affc230ecefb598cfd5b8b5f4d188ecad65dcfc593bdb06ea6b4d33f22a005a7d985"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cxx \
python39-CXX \
python39-cxx \
python39-pycxx \
python3dist-cxx"

RDEPENDS:${PN} += "python-abi"

inherit rpm
