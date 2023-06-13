SUMMARY = "Fake file system that mocks the Python file system modules"
DESCRIPTION = "pyfakefs implements a fake file system that mocks the Python file system \
modules. Using pyfakefs, your tests operate on a fake file system in \
memory without touching the real disk. The software under test requires \
no modification to work with pyfakefs."
LICENSE = "Apache-2.0"

PV = "5.2.2"

RPM_NAME = "python310-pyfakefs-5.2.2-1.1.noarch.rpm"
RPM_HASH = "06f5571ccd2eb4c599c15084051ef81d1ba385cf17fa930260bd1dbf33719615c2d2115413bd1939db028d130cb96251e13ddcdffb208d04f7c4e90bcb68daa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyfakefs \
python3.10dist(pyfakefs) \
python310-pyfakefs \
python3dist(pyfakefs)"

RDEPENDS:${PN} += "python(abi) \
python310"

inherit rpm
