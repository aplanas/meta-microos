SUMMARY = "Fake file system that mocks the Python file system modules"
DESCRIPTION = "pyfakefs implements a fake file system that mocks the Python file system \
modules. Using pyfakefs, your tests operate on a fake file system in \
memory without touching the real disk. The software under test requires \
no modification to work with pyfakefs."
LICENSE = "Apache-2.0"

PV = "5.2.2"

RPM_NAME = "python39-pyfakefs-5.2.2-1.2.noarch.rpm"
RPM_HASH = "8b9b131b7de36ea7bda044c624360ddebe5192494ffe4f03ae43875d66b6192d2b3273a132d7f6ed2efda9769448ab20845494c5b6ef942bb7f4ac0d50fd9775"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyfakefs \
python39-pyfakefs \
python3dist-pyfakefs"

RDEPENDS:${PN} += "python-abi \
python39"

inherit rpm
