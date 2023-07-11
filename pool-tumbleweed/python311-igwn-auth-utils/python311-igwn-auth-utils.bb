SUMMARY = "Auth Utils for International Gravitational-Wave Observatory Network (IGWN)"
DESCRIPTION = "Python library functions to simplify using International Gravitational-Wave \
Observatory Network (IGWN) authorisation credentials. \
 \
This project is primarily aimed at discovering X.509 credentials and \
SciTokens for use with HTTP(S) requests to IGWN-operated services."
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "python311-igwn-auth-utils-0.4.0-1.4.noarch.rpm"
RPM_HASH = "620fb8c9ab6932eafdbd7a4d74bae9045794f2343cac8273ef55f88f937ac0b83871da83e44b932abc83fa3c703273b3c3da315241d82d76dd5bc387821860f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-igwn-auth-utils \
python3-igwn-auth-utils-requests \
python3.11dist-igwn-auth-utils \
python311-igwn-auth-utils \
python311-igwn-auth-utils-requests \
python3dist-igwn-auth-utils"

RDEPENDS:${PN} += "python-abi \
python311-cryptography \
python311-requests \
python311-safe-netrc \
python311-scitokens"

inherit rpm
