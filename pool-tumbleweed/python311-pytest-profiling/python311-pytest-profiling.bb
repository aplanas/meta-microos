SUMMARY = "Profiling plugin for pytest"
DESCRIPTION = "Profiling plugin for py.test"
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python311-pytest-profiling-1.7.0-3.5.noarch.rpm"
RPM_HASH = "405f1d6c152a5d9123242debc606b00461ae11430575c80fd904d164f9f066688fda73381251e5c2ffb7dd62b37cedad755c6cc37163690e25fed857ce2095e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-profiling \
python3.11dist-pytest-profiling \
python311-pytest-profiling \
python3dist-pytest-profiling"

RDEPENDS:${PN} += "python-abi \
python311-gprof2dot \
python311-pytest"

inherit rpm
