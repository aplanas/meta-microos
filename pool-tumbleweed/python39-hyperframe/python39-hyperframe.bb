SUMMARY = "HTTP/2 framing layer for Python"
DESCRIPTION = "This library contains the HTTP/2 framing code used in the hyper project. \
It provides a pure-Python codebase that is capable of decoding a binary \
stream into HTTP/2 frames."
LICENSE = "MIT"

PV = "6.0.1"

RPM_NAME = "python39-hyperframe-6.0.1-2.3.noarch.rpm"
RPM_HASH = "304536aab6fa25e813258766d52ef0cfc7fc1d577857687a85ce0ac6e278cdbca8b9a02a4bc5e653b4af5df37a09314b0552b82a7af1d46abe7616ac2a7eaf2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-hyperframe \
python39-hyperframe \
python3dist-hyperframe"

RDEPENDS:${PN} += "python-abi"

inherit rpm
