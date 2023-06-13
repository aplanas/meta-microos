SUMMARY = "Small personal collection of python utility functions"
DESCRIPTION = "Small personal collection of python utility functions"
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "python39-littleutils-0.2.2-2.1.noarch.rpm"
RPM_HASH = "29cb3d4662065045ae6c68964188de8530e9d0cfb45f76c66abcb2b0cf166fc63c36295e74a807120db128c875f3f3a8d0922ce27e66008d26924967c3311e17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(littleutils) \
python39-littleutils \
python3dist(littleutils)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
