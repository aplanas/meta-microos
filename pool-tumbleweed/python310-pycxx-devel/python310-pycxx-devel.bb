SUMMARY = "Development files for pycxx applications"
DESCRIPTION = "PyCXX is a set of classes to help create extensions of Python in the \
C++ language. The first part encapsulates the Python C API taking care \
of exceptions and ref counting. The second part supports the building \
of Python extension modules in C++."
LICENSE = "BSD-3-Clause"

PV = "7.1.7"

RPM_NAME = "python310-pycxx-devel-7.1.7-1.6.noarch.rpm"
RPM_HASH = "c645bfaeb467a02eed65ffd438ab058d8e54f4739f14533a0a1c6aced1443a6a659f5c71264c226725d1f2e54e71408c8dd36d991ebd6f7b6f1640c81d2877f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-CXX-devel \
python3-cxx-devel \
python3-pycxx-devel \
python310-CXX-devel \
python310-cxx-devel \
python310-pycxx-devel"

RDEPENDS:${PN} += "python310-pycxx"

inherit rpm
