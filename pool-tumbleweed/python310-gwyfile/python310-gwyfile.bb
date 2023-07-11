SUMMARY = "Pure Python implementation of the Gwyddion file format"
DESCRIPTION = "Pure Python implementation of the Gwyddion file format."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python310-gwyfile-0.2.0-2.11.noarch.rpm"
RPM_HASH = "aa7f72d643589cd1f2a7ab4c16f6694b9df067be24b90dd4f38b6f98a918a67473defaa8f01625baf4005c83633ce1b39322a030decb27c7fb7b34d04c338ea8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-gwyfile \
python310-gwyfile \
python3dist-gwyfile"

RDEPENDS:${PN} += "python-abi \
python310-numpy \
python310-six"

inherit rpm
