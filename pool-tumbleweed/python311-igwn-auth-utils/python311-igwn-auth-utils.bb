SUMMARY = "Auth Utils for International Gravitational-Wave Observatory Network (IGWN)"
DESCRIPTION = "Python library functions to simplify using International Gravitational-Wave \
Observatory Network (IGWN) authorisation credentials. \
 \
This project is primarily aimed at discovering X.509 credentials and \
SciTokens for use with HTTP(S) requests to IGWN-operated services."
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "python311-igwn-auth-utils-0.4.0-1.2.noarch.rpm"
RPM_HASH = "f08b1c1372eb97f9f95903ae777ef9747a792e52d31bd4255a648e63d6bd53728b26209ab9f7cbc6f4bedae1b06b811aea4f4a58e8758baa834715f13ad46112"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(igwn-auth-utils) \
python311-igwn-auth-utils \
python311-igwn-auth-utils-requests \
python3dist(igwn-auth-utils)"
RDEPENDS:${PN} += "python(abi) \
python311-cryptography \
python311-requests \
python311-safe-netrc \
python311-scitokens"

inherit rpm
