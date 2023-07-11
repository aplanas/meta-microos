SUMMARY = "Python OpenID client"
DESCRIPTION = "Python client for OpenID including token caching and management."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python311-openidc-client-0.6.0-1.13.noarch.rpm"
RPM_HASH = "908229e1e99056cf20e8df923c4a1b270f370e13c361185698b7d2234c5cb01bdc7835da73b2010f72b5b083ae209d68fe585439e466a11a9671b86d7632a51a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openidc-client \
python3.11dist-openidc-client \
python311-openidc-client \
python3dist-openidc-client"

RDEPENDS:${PN} += "python-abi \
python311-requests"

inherit rpm
