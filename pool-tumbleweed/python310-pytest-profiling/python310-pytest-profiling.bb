SUMMARY = "Profiling plugin for pytest"
DESCRIPTION = "Profiling plugin for py.test"
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python310-pytest-profiling-1.7.0-3.3.noarch.rpm"
RPM_HASH = "7629c1948de538ab6a1426ef9f62ae9b2a2523f71bf15ddbd8f913ef98e5674ab56586510be377c1f780c6685a27936690f46c62fb3ba5a240ae56911a3ca6bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-profiling \
python3.10dist-pytest-profiling \
python310-pytest-profiling \
python3dist-pytest-profiling"

RDEPENDS:${PN} += "python-abi \
python310-gprof2dot \
python310-pytest"

inherit rpm
