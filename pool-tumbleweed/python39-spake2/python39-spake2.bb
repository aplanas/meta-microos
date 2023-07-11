SUMMARY = "Pure-Python SPAKE2"
DESCRIPTION = "SPAKE2 password-authenticated key exchange."
LICENSE = "MIT"

PV = "0.8"

RPM_NAME = "python39-spake2-0.8-2.18.noarch.rpm"
RPM_HASH = "8cb76ebb4fee4ca3cce06e9772963e98aded89c82929a4195fb4833f814cb97b2ae27d643d8afe982dd28fc9c26814b6a8036109036041c6b2e77719a74aca03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-spake2 \
python39-spake2 \
python3dist-spake2"

RDEPENDS:${PN} += "python-abi"

inherit rpm
