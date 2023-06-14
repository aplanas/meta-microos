SUMMARY = "Zipfile generator"
DESCRIPTION = "zipstream.py is a ZIP archive generator based on Python 3.3's zipfile.py. \
zipstream can create archives on the fly, which is useful for streaming \
the archive to e.g. web clients without needing to store the archive on \
disk first."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.4"

RPM_NAME = "python310-zipstream-1.1.4-4.12.noarch.rpm"
RPM_HASH = "3c86c64a60919657d9c672822d613c2709895a432556f62430ac392aecbf244a67617b9503b3dab1edc1af6d38157f4cc2d9d852a3efe4f75c3e47ac8f7d9cc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zipstream \
python3.10dist-zipstream \
python310-zipstream \
python3dist-zipstream"

RDEPENDS:${PN} += "python-abi"

inherit rpm
