SUMMARY = "Profiling plugin for pytest"
DESCRIPTION = "Profiling plugin for py.test"
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python39-pytest-profiling-1.7.0-3.3.noarch.rpm"
RPM_HASH = "28c267d8785254a407449211d95ce1dec544ab7cc93d131eb888ab34bd18feaa70e425abba1b7fecef5d0d8913e98537fe1d599790f9017d8ae2a8c0870131c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-profiling) \
python39-pytest-profiling \
python3dist(pytest-profiling)"

RDEPENDS:${PN} += "python(abi) \
python39-gprof2dot \
python39-pytest"

inherit rpm
