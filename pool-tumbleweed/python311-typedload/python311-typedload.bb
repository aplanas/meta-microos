SUMMARY = "Load and dump data from json-like format into typed data structures"
DESCRIPTION = "Load and dump data from json-like format into typed data structures"
LICENSE = "GPL-3.0-only"

PV = "2.19"

RPM_NAME = "python311-typedload-2.19-1.5.noarch.rpm"
RPM_HASH = "a2d8f3b560b3d36c7988cd159ff147544371597c4e736dbaf3d368d4b45e414e257f3c77922f989fb01ac536011b9081dd3577d1c3fb52650bbbf4df1ec57894"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-typedload \
python3.11dist-typedload \
python311-typedload \
python3dist-typedload"

RDEPENDS:${PN} += "python-abi"

inherit rpm
