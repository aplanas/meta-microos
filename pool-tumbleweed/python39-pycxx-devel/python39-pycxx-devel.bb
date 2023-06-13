SUMMARY = "Development files for pycxx applications"
DESCRIPTION = "PyCXX is a set of classes to help create extensions of Python in the \
C++ language. The first part encapsulates the Python C API taking care \
of exceptions and ref counting. The second part supports the building \
of Python extension modules in C++."
LICENSE = "BSD-3-Clause"

PV = "7.1.7"

RPM_NAME = "python39-pycxx-devel-7.1.7-1.6.noarch.rpm"
RPM_HASH = "54255bbe1ae3e7987a69f8709e8867a209ed0446b7dad892f60ccd8a32c3912fa837fff419e67f431e8f5cf83ced714411664be33506d94330aa6e4e3b58d981"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-CXX-devel \
python39-cxx-devel \
python39-pycxx-devel"

RDEPENDS:${PN} += "python39-pycxx"

inherit rpm
