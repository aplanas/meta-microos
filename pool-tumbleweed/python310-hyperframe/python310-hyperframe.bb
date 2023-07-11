SUMMARY = "HTTP/2 framing layer for Python"
DESCRIPTION = "This library contains the HTTP/2 framing code used in the hyper project. \
It provides a pure-Python codebase that is capable of decoding a binary \
stream into HTTP/2 frames."
LICENSE = "MIT"

PV = "6.0.1"

RPM_NAME = "python310-hyperframe-6.0.1-2.3.noarch.rpm"
RPM_HASH = "8d7ab68b059dd255b5521c317b044a4c3ec41e4ad7bec74278bdf52c2177af83d23866f9a5e90a2486fe3de67e5224aff0a1a5cb66d34efb7db32beb05d69c6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-hyperframe \
python310-hyperframe \
python3dist-hyperframe"

RDEPENDS:${PN} += "python-abi"

inherit rpm
