SUMMARY = "Pytest plugin for printing summary data as I want it"
DESCRIPTION = "Opinionated pytest plugin to make output slightly easier to read \
and errors easy to find and fix."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python310-pytest-pretty-1.2.0-1.3.noarch.rpm"
RPM_HASH = "21d8c38743ef47cc3605b4582134af3d2ff0031264868660eeb5dd81c283d0b3ff9725bc5a2c59eb2868110f11242f07601c5c3d12e84f3a2899521a2aa3d643"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-pretty \
python310-pytest-pretty \
python3dist-pytest-pretty"

RDEPENDS:${PN} += "python-abi \
python310-pytest \
python310-rich"

inherit rpm
