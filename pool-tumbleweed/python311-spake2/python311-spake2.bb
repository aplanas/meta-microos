SUMMARY = "Pure-Python SPAKE2"
DESCRIPTION = "SPAKE2 password-authenticated key exchange."
LICENSE = "MIT"

PV = "0.8"

RPM_NAME = "python311-spake2-0.8-2.18.noarch.rpm"
RPM_HASH = "5c7474fe01c27da0fbf5af76a1c7c94d3eac8ab6c2ed7e96cc186e2eea4ad271d9f4e2699b202d52403fc2bf546dc0f6e6444def820e0d31913965696cace359"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-spake2 \
python3.11dist-spake2 \
python311-spake2 \
python3dist-spake2"

RDEPENDS:${PN} += "python-abi"

inherit rpm
