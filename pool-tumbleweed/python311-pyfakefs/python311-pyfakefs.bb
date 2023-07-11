SUMMARY = "Fake file system that mocks the Python file system modules"
DESCRIPTION = "pyfakefs implements a fake file system that mocks the Python file system \
modules. Using pyfakefs, your tests operate on a fake file system in \
memory without touching the real disk. The software under test requires \
no modification to work with pyfakefs."
LICENSE = "Apache-2.0"

PV = "5.2.2"

RPM_NAME = "python311-pyfakefs-5.2.2-1.2.noarch.rpm"
RPM_HASH = "104f4b5443c11ff28b8c8c91836c99d1cd5a5795c5c7894e26352c061369d0c40774b4040b22a1db07c863a8198cc1fb60e3672276ea5b33f22f2ac7c9704eea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyfakefs \
python3.11dist-pyfakefs \
python311-pyfakefs \
python3dist-pyfakefs"

RDEPENDS:${PN} += "python-abi \
python311"

inherit rpm
