SUMMARY = "A Python wrapper library for subprocess module"
DESCRIPTION = "A Python wrapper library for subprocess module."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-subprocrunner-2.0.0-2.3.noarch.rpm"
RPM_HASH = "31dd4337954a8e05d86773a42ab86d1d00b8f5289567b34496e15f1671c806b8923da1e2115d1111e26399831dffd71f2e927cdb5e8c9a71b2df301504365647"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-subprocrunner \
python39-subprocrunner \
python3dist-subprocrunner"

RDEPENDS:${PN} += "python-abi \
python39-loguru \
python39-mbstrdecoder \
python39-typepy"

inherit rpm
