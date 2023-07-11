SUMMARY = "Human-readable representations of digests"
DESCRIPTION = "humanhash provides human-readable representations of digests."
LICENSE = "Unlicense"

PV = "0.0.6"

RPM_NAME = "python311-humanhash3-0.0.6-2.18.noarch.rpm"
RPM_HASH = "d5a451cd9633227178e43be2c3b5f4437c3b2b5112231c02bb912f6a79071001630598baede56e2a20b1245e5e9e44d9cc7198c0833f0ca49cb5a047c2a9a0b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-humanhash3 \
python3.11dist-humanhash3 \
python311-humanhash3 \
python3dist-humanhash3"

RDEPENDS:${PN} += "python-abi"

inherit rpm
