SUMMARY = "Fake file system that mocks the Python file system modules"
DESCRIPTION = "pyfakefs implements a fake file system that mocks the Python file system \
modules. Using pyfakefs, your tests operate on a fake file system in \
memory without touching the real disk. The software under test requires \
no modification to work with pyfakefs."
LICENSE = "Apache-2.0"

PV = "5.2.4"

RPM_NAME = "python310-pyfakefs-5.2.4-1.1.noarch.rpm"
RPM_HASH = "b7a66eccb56e56fa1a1008e6c955f9d2d09b9aa6012014eb2d7c0b1e1d022bc8b66b286212acad6804ae93f4d1991d164818500e5de4ead743a6219e8505b8c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyfakefs \
python310-pyfakefs \
python3dist-pyfakefs"

RDEPENDS:${PN} += "python-abi \
python310"

inherit rpm
