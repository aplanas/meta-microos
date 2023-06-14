SUMMARY = "Fake file system that mocks the Python file system modules"
DESCRIPTION = "pyfakefs implements a fake file system that mocks the Python file system \
modules. Using pyfakefs, your tests operate on a fake file system in \
memory without touching the real disk. The software under test requires \
no modification to work with pyfakefs."
LICENSE = "Apache-2.0"

PV = "5.2.2"

RPM_NAME = "python39-pyfakefs-5.2.2-1.1.noarch.rpm"
RPM_HASH = "40309af372e20a185741f523db86f02d34544eaaa596d157d46dddf568a3809e34700f806cbfba0c3ea21423d6398a9bad1ba00de4b38ae1ab72687a48cccde6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyfakefs \
python39-pyfakefs \
python3dist-pyfakefs"

RDEPENDS:${PN} += "python-abi \
python39"

inherit rpm
