SUMMARY = "Pure-Python SPAKE2"
DESCRIPTION = "SPAKE2 password-authenticated key exchange."
LICENSE = "MIT"

PV = "0.8"

RPM_NAME = "python310-spake2-0.8-2.18.noarch.rpm"
RPM_HASH = "4cc577ab8de0d0303beb892d576482133e2535780597af4543781a8352141625baea17bedf752c57127fd95dd3bf9d2cc969e6a8c1896bb41e1a0bbf2827214a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-spake2 \
python310-spake2 \
python3dist-spake2"

RDEPENDS:${PN} += "python-abi"

inherit rpm
