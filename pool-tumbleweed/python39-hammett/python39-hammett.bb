SUMMARY = "hammett is a fast python test runner"
DESCRIPTION = "hammett is a fast python test runner"
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python39-hammett-0.5.0-1.19.noarch.rpm"
RPM_HASH = "8cf663f93cc56095f63b9a827c14171fb5b1470e43b1a74e5cc55e9f1ee5237109b9523375a1eddeda9b436aa3a920a376aab855bedcaa4f8b6f3abb44061e33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-hammett \
python39-hammett \
python3dist-hammett"

RDEPENDS:${PN} += "python-abi \
python39-astunparse \
python39-colorama"

inherit rpm
