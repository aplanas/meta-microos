SUMMARY = "Auth Utils for International Gravitational-Wave Observatory Network (IGWN)"
DESCRIPTION = "Python library functions to simplify using International Gravitational-Wave \
Observatory Network (IGWN) authorisation credentials. \
 \
This project is primarily aimed at discovering X.509 credentials and \
SciTokens for use with HTTP(S) requests to IGWN-operated services."
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "python39-igwn-auth-utils-0.4.0-1.4.noarch.rpm"
RPM_HASH = "c64583e5fc82faca6120c3b1e573681508c2134c7fe9d77be5d646fc65d5135775fe1b36fa2de226390d813197854af3f74a1cd31f8d813c6bb11a9bfed7664b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-igwn-auth-utils \
python39-igwn-auth-utils \
python39-igwn-auth-utils-requests \
python3dist-igwn-auth-utils"

RDEPENDS:${PN} += "python-abi \
python39-cryptography \
python39-requests \
python39-safe-netrc \
python39-scitokens"

inherit rpm
