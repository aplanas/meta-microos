SUMMARY = "A py.test fixture for benchmarking code"
DESCRIPTION = "A py.test fixture for benchmarking code. It will group the tests into \
rounds that are calibrated to the chosen timer."
LICENSE = "BSD-2-Clause"

PV = "4.0.0"

RPM_NAME = "python39-pytest-benchmark-4.0.0-4.1.noarch.rpm"
RPM_HASH = "69dd80a87ba6d996637d89bc6073b279fc20bc6e03e1f24901d65367f032734651769c54b07a0784dff824767665d60b89a6bf488777f9ce9c5abbb4d53b2034"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-benchmark \
python39-pytest-benchmark \
python3dist-pytest-benchmark"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-py-cpuinfo \
python39-pytest \
update-alternatives"

inherit rpm
