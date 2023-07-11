SUMMARY = "A py.test fixture for benchmarking code"
DESCRIPTION = "A py.test fixture for benchmarking code. It will group the tests into \
rounds that are calibrated to the chosen timer."
LICENSE = "BSD-2-Clause"

PV = "4.0.0"

RPM_NAME = "python311-pytest-benchmark-4.0.0-4.3.noarch.rpm"
RPM_HASH = "d31f06ff4f4529fd4ce0bedd73ad39b9c954c8a8923f37a20e94b94be78a00c78f521cab360bcb392f4898023ab71203f921ab86f893c294c60a90ccff33b620"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-benchmark \
python3.11dist-pytest-benchmark \
python311-pytest-benchmark \
python3dist-pytest-benchmark"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-py-cpuinfo \
python311-pytest \
update-alternatives"

inherit rpm
