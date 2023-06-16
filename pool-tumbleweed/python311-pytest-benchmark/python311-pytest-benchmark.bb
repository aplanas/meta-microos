SUMMARY = "A py.test fixture for benchmarking code"
DESCRIPTION = "A py.test fixture for benchmarking code. It will group the tests into \
rounds that are calibrated to the chosen timer."
LICENSE = "BSD-2-Clause"

PV = "4.0.0"

RPM_NAME = "python311-pytest-benchmark-4.0.0-4.1.noarch.rpm"
RPM_HASH = "ab97ee3287e56a78d5f922a8246e6cc1337ba24d4e4dd02e9e0619fc65d7dfcc4f3fafeca7c55a49fe23f3115b9c1502be7f72788e3e606984a426e32ae0bc05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pytest-benchmark \
python311-pytest-benchmark \
python3dist-pytest-benchmark"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-py-cpuinfo \
python311-pytest \
update-alternatives"

inherit rpm
