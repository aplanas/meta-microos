SUMMARY = "Fake file system that mocks the Python file system modules"
DESCRIPTION = "pyfakefs implements a fake file system that mocks the Python file system \
modules. Using pyfakefs, your tests operate on a fake file system in \
memory without touching the real disk. The software under test requires \
no modification to work with pyfakefs."
LICENSE = "Apache-2.0"

PV = "5.2.2"

RPM_NAME = "python310-pyfakefs-5.2.2-1.2.noarch.rpm"
RPM_HASH = "55da33399bfd0e784a1a5706af191805dc6d2feca0f4bc10f8f29759b5b8e944d86cb8682d3f2d79e516fdc3d1655f4f3210a317ead57d1e4ff4324e69378fb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyfakefs \
python310-pyfakefs \
python3dist-pyfakefs"

RDEPENDS:${PN} += "python-abi \
python310"

inherit rpm
