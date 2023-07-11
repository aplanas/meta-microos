SUMMARY = "A py.test fixture for benchmarking code"
DESCRIPTION = "A py.test fixture for benchmarking code. It will group the tests into \
rounds that are calibrated to the chosen timer."
LICENSE = "BSD-2-Clause"

PV = "4.0.0"

RPM_NAME = "python310-pytest-benchmark-4.0.0-4.3.noarch.rpm"
RPM_HASH = "0a02a3d85c86f80efddf08ef7a17cbea6e74c353ab3e717e22106f272eb7b690b425e224d28573c35601abadcff14250c3e583ec92af8c67e644f09ac9c2a73d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-benchmark \
python310-pytest-benchmark \
python3dist-pytest-benchmark"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-py-cpuinfo \
python310-pytest \
update-alternatives"

inherit rpm
