SUMMARY = "Python OpenID client"
DESCRIPTION = "Python client for OpenID including token caching and management."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python39-openidc-client-0.6.0-1.11.noarch.rpm"
RPM_HASH = "bb62d91da13f86b02e2992ed0e38c7f107cc3352c5721faa3d022f4357437fb2c17d3abdf209357b66577007cd4be8e6f1fab757a91344e51f5f21c7428fa0f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(openidc-client) \
python39-openidc-client \
python3dist(openidc-client)"

RDEPENDS:${PN} += "python(abi) \
python39-requests"

inherit rpm
