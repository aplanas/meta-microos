SUMMARY = "A py.test fixture for benchmarking code"
DESCRIPTION = "A py.test fixture for benchmarking code. It will group the tests into \
rounds that are calibrated to the chosen timer."
LICENSE = "BSD-2-Clause"

PV = "4.0.0"

RPM_NAME = "python310-pytest-benchmark-4.0.0-4.1.noarch.rpm"
RPM_HASH = "fe42d7c55763b28cb26c28ded0d520d2350969df10f643d8bac10570abe19b3eabf78c121bdb8877c0b79dc6d88e41edc23b473d59ba4f493f0677a4200034c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-benchmark \
python3.10dist-pytest-benchmark \
python310-pytest-benchmark \
python3dist-pytest-benchmark"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-py-cpuinfo \
python310-pytest \
update-alternatives"

inherit rpm
