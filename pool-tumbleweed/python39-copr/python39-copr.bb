SUMMARY = "Python client for copr service"
DESCRIPTION = "Python client for copr service."
LICENSE = "GPL-2.0-or-later"

PV = "1.129"

RPM_NAME = "python39-copr-1.129-1.1.noarch.rpm"
RPM_HASH = "35c9abe1741c19d81477777bd7616807a3d8524514459463574600753f5e53b43e8ea4ae8447cdb5ca4fece989d8894524e9c9f26c623c2d91c5820c6496487e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-copr \
python39-copr \
python3dist-copr"

RDEPENDS:${PN} += "python-abi \
python39-filelock \
python39-future \
python39-munch \
python39-requests \
python39-requests-toolbelt"

inherit rpm
