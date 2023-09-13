SUMMARY = "Fake file system that mocks the Python file system modules"
DESCRIPTION = "pyfakefs implements a fake file system that mocks the Python file system \
modules. Using pyfakefs, your tests operate on a fake file system in \
memory without touching the real disk. The software under test requires \
no modification to work with pyfakefs."
LICENSE = "Apache-2.0"

PV = "5.2.4"

RPM_NAME = "python311-pyfakefs-5.2.4-1.1.noarch.rpm"
RPM_HASH = "fa3b960d209530dc5d626c06da26f42a0154e028dde11a00e679a0bf215c340093d1c0cf1dfed659629c05949fe3eb1905ec01f64562f8e182487c3a9de14140"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyfakefs \
python3.11dist-pyfakefs \
python311-pyfakefs \
python3dist-pyfakefs"

RDEPENDS:${PN} += "python-abi \
python311"

inherit rpm
