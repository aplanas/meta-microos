SUMMARY = "Pytest plugin for printing summary data as I want it"
DESCRIPTION = "Opinionated pytest plugin to make output slightly easier to read \
and errors easy to find and fix."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python39-pytest-pretty-1.2.0-1.1.noarch.rpm"
RPM_HASH = "727e9239f6b252dc604a791aca46460dc54522c8f77c7e573c45b813934e69aed0031ffcf218379ef8c9f662bee24ca49b63563b005457226865e43ff77cc34e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-pretty) \
python39-pytest-pretty \
python3dist(pytest-pretty)"

RDEPENDS:${PN} += "python(abi) \
python39-pytest \
python39-rich"

inherit rpm
