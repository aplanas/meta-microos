SUMMARY = "A py.test fixture for benchmarking code"
DESCRIPTION = "A py.test fixture for benchmarking code. It will group the tests into \
rounds that are calibrated to the chosen timer."
LICENSE = "BSD-2-Clause"

PV = "4.0.0"

RPM_NAME = "python39-pytest-benchmark-4.0.0-4.3.noarch.rpm"
RPM_HASH = "9727430b9b7816cf0271945b01d0b217f13137dcdf6d1f4cf3250fe6a7b8a9ae54c81140549b1ca890a2e17aad7296e91b1530c4133b9e7a0c3dcc8114788908"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-benchmark \
python39-pytest-benchmark \
python3dist-pytest-benchmark"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-py-cpuinfo \
python39-pytest \
update-alternatives"

inherit rpm
