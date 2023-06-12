SUMMARY = "Common utilities for Synapse, Sydent and Sygnal"
DESCRIPTION = "Common utilities for Synapse, Sydent and Sygnal."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python311-matrix_common-1.3.0-1.3.noarch.rpm"
RPM_HASH = "93ad7e1e058664d59de7deea8a36f988d69da125997a5fe4b0084d7a04f8694461f1399275b942582321ad2516083eeb79fde84f1aed9d59ed1dd848ecc29ebd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(matrix-common) \
python311-matrix-common \
python311-matrix_common \
python3dist(matrix-common)"
RDEPENDS:${PN} += "python(abi) \
python311-attrs"

inherit rpm
