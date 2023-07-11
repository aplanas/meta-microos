SUMMARY = "Simple library to encode/decode DNS wire-format packets"
DESCRIPTION = "Simple library to encode/decode DNS wire-format packets."
LICENSE = "BSD-2-Clause"

PV = "0.9.23"

RPM_NAME = "python311-dnslib-0.9.23-1.4.noarch.rpm"
RPM_HASH = "edba1694fd5c65831373019be446d6b3d86a10d708ef3431259ac82ab280cc08b2ff0a13ed89fbf96f7b4ea7d18bd1131d198163d76ee0c530e7996bb54ad4dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dnslib \
python3.11dist-dnslib \
python311-dnslib \
python3dist-dnslib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
