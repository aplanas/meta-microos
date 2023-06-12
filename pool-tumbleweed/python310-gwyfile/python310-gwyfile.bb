SUMMARY = "Pure Python implementation of the Gwyddion file format"
DESCRIPTION = "Pure Python implementation of the Gwyddion file format."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python310-gwyfile-0.2.0-2.9.noarch.rpm"
RPM_HASH = "520c0efad1ba17baddc16c608e4bb49aad3625635de4faafb4caa6e726c613814a031a2fe045812be9f130623a591b71734806e0a5c27b5364eb6278eb0bd2e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gwyfile \
python3.10dist(gwyfile) \
python310-gwyfile \
python3dist(gwyfile)"
RDEPENDS:${PN} += "python(abi) \
python310-numpy \
python310-six"

inherit rpm
