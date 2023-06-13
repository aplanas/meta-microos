SUMMARY = "Profiling plugin for pytest"
DESCRIPTION = "Profiling plugin for py.test"
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python311-pytest-profiling-1.7.0-3.3.noarch.rpm"
RPM_HASH = "b1bb7855b8c174bc200aeb676ac3b716953fad9631a0c5ec42fc26f4a38c9f5d09c1dc9d32ed4760be06177199e50fdee6ac11e00eb824849d48e7395f6a2079"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-profiling) \
python311-pytest-profiling \
python3dist(pytest-profiling)"

RDEPENDS:${PN} += "python(abi) \
python311-gprof2dot \
python311-pytest"

inherit rpm
