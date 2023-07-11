SUMMARY = "Test vectors for the cryptography package"
DESCRIPTION = "Vectors for testing of the python cryptography package."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "41.0.1"

RPM_NAME = "python39-cryptography-vectors-41.0.1-2.1.noarch.rpm"
RPM_HASH = "2cb10bdb07d43557f6bbbd5fa098f9c9bf53e020c817118789d08814578e9811af098b5a70ae2b953daec2a57c817629264037288e64f7d27fdc18ceb8accb24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cryptography-vectors \
python39-cryptography-vectors \
python3dist-cryptography-vectors"

RDEPENDS:${PN} += "/usr/bin/sh \
python-abi"

inherit rpm
