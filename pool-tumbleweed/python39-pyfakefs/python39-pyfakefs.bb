SUMMARY = "Fake file system that mocks the Python file system modules"
DESCRIPTION = "pyfakefs implements a fake file system that mocks the Python file system \
modules. Using pyfakefs, your tests operate on a fake file system in \
memory without touching the real disk. The software under test requires \
no modification to work with pyfakefs."
LICENSE = "Apache-2.0"

PV = "5.2.4"

RPM_NAME = "python39-pyfakefs-5.2.4-1.1.noarch.rpm"
RPM_HASH = "b75b782571b73a493da52e309630cd6a79a32e4245645ebfcd248331d5770f45ff43c144563ebb78a9690b52572e71e54d148e308f1376caf080e683d2076d9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyfakefs \
python39-pyfakefs \
python3dist-pyfakefs"

RDEPENDS:${PN} += "python-abi \
python39"

inherit rpm
