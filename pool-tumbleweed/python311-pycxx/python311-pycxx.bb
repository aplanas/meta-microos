SUMMARY = "Python extensions in C++"
DESCRIPTION = "PyCXX is a set of classes to help create extensions of Python in the \
C++ language. The first part encapsulates the Python C API taking care \
of exceptions and ref counting. The second part supports the building \
of Python extension modules in C++."
LICENSE = "BSD-3-Clause"

PV = "7.1.7"

RPM_NAME = "python311-pycxx-7.1.7-1.7.noarch.rpm"
RPM_HASH = "00e3b3d5de25a098f124452259105aab8c8e452df7da03470d9a156fda22d506da18fdd38237bceb996a1107f5b560bd825452f739ffd0e7b1162df7a36cd21d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-CXX \
python3-cxx \
python3-pycxx \
python3.11dist-cxx \
python311-CXX \
python311-cxx \
python311-pycxx \
python3dist-cxx"

RDEPENDS:${PN} += "python-abi"

inherit rpm
