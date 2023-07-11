SUMMARY = "Development files for pycxx applications"
DESCRIPTION = "PyCXX is a set of classes to help create extensions of Python in the \
C++ language. The first part encapsulates the Python C API taking care \
of exceptions and ref counting. The second part supports the building \
of Python extension modules in C++."
LICENSE = "BSD-3-Clause"

PV = "7.1.7"

RPM_NAME = "python311-pycxx-devel-7.1.7-1.7.noarch.rpm"
RPM_HASH = "5d47347f2ddc0b5f0e2122f43991c2afa677aeae0fe6aeddcce0b9ceb6b8c613c3c055da678fdb28c095ea29855fc81895c96a2ebf8a3ea67b4be4e86f2274ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-CXX-devel \
python3-cxx-devel \
python3-pycxx-devel \
python311-CXX-devel \
python311-cxx-devel \
python311-pycxx-devel"

RDEPENDS:${PN} += "python311-pycxx"

inherit rpm
