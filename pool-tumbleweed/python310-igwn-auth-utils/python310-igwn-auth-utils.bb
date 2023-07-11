SUMMARY = "Auth Utils for International Gravitational-Wave Observatory Network (IGWN)"
DESCRIPTION = "Python library functions to simplify using International Gravitational-Wave \
Observatory Network (IGWN) authorisation credentials. \
 \
This project is primarily aimed at discovering X.509 credentials and \
SciTokens for use with HTTP(S) requests to IGWN-operated services."
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "python310-igwn-auth-utils-0.4.0-1.4.noarch.rpm"
RPM_HASH = "9f5986cd5c5237215f97ed232cb82ad0bd65bf812664e3b832d1405069f5f5f2eb02f395987cf8693defbc94e926453571c37abd8d12dab457b34348e3124de4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-igwn-auth-utils \
python310-igwn-auth-utils \
python310-igwn-auth-utils-requests \
python3dist-igwn-auth-utils"

RDEPENDS:${PN} += "python-abi \
python310-cryptography \
python310-requests \
python310-safe-netrc \
python310-scitokens"

inherit rpm
