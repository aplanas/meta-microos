SUMMARY = "Python tool to find and list requirements of a Python project"
DESCRIPTION = "Requirements-detector is a Python tool which attempts to find and list \
the requirements of a Python project. \
 \
When run from the root of a Python project, it will try to ascertain \
which libraries and the versions of those libraries that the project \
depends on."
LICENSE = "MIT"

PV = "0.7"

RPM_NAME = "python310-requirements-detector-0.7-2.11.noarch.rpm"
RPM_HASH = "d901dbb3749e446471274e6d01895d38733c22b16587364bc40d2fe7b3d280c8401616703952680d1929f929643df87c6582f7db9d08f900eca8a6ac3de0b04c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requirements-detector \
python3.10dist(requirements-detector) \
python310-requirements-detector \
python3dist(requirements-detector)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-astroid \
update-alternatives"

inherit rpm
