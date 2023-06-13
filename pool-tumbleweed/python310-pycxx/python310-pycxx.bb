SUMMARY = "Python extensions in C++"
DESCRIPTION = "PyCXX is a set of classes to help create extensions of Python in the \
C++ language. The first part encapsulates the Python C API taking care \
of exceptions and ref counting. The second part supports the building \
of Python extension modules in C++."
LICENSE = "BSD-3-Clause"

PV = "7.1.7"

RPM_NAME = "python310-pycxx-7.1.7-1.6.noarch.rpm"
RPM_HASH = "49022a4a8ac03c52fa0ec9eea27c4b09d703362f157699421cf24cfc865b43cbec79609d7f5fbd7d0bd62d430f55d3d5e8354d673b81d7aa75c3c9f2518ef62d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-CXX \
python3-cxx \
python3-pycxx \
python3.10dist(cxx) \
python310-CXX \
python310-cxx \
python310-pycxx \
python3dist(cxx)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
