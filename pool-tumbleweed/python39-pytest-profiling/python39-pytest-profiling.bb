SUMMARY = "Profiling plugin for pytest"
DESCRIPTION = "Profiling plugin for py.test"
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python39-pytest-profiling-1.7.0-3.5.noarch.rpm"
RPM_HASH = "a7de072cbac2658214abf89578cdd01bd05ed08b9365de4ad86e4d8b40d030f3fc452907b031c8873007d8324dc4f9bf00534670e1f0c4c7915b93abc6d408c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-profiling \
python39-pytest-profiling \
python3dist-pytest-profiling"

RDEPENDS:${PN} += "python-abi \
python39-gprof2dot \
python39-pytest"

inherit rpm
