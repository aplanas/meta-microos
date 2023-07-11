SUMMARY = "Profiling plugin for pytest"
DESCRIPTION = "Profiling plugin for py.test"
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python310-pytest-profiling-1.7.0-3.5.noarch.rpm"
RPM_HASH = "67dec15fa55947a9a1aa41eb8d9b67d909df3c90be10e73cbde4883d9b7db5db6fc902bd4ca5745185f026d8ce3e76e715ef61cc20767748deca60bb29ab8376"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-profiling \
python310-pytest-profiling \
python3dist-pytest-profiling"

RDEPENDS:${PN} += "python-abi \
python310-gprof2dot \
python310-pytest"

inherit rpm
