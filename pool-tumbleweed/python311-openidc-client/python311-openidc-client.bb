SUMMARY = "Python OpenID client"
DESCRIPTION = "Python client for OpenID including token caching and management."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python311-openidc-client-0.6.0-1.11.noarch.rpm"
RPM_HASH = "6af1e80b881642fa00881f8bc6dd169c0445dc1333cdcae2ab1648821ccb6a796f875978edc2175f9c8332e097c7465d162919e6fc2b156de46ef41f20b0acaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-openidc-client \
python311-openidc-client \
python3dist-openidc-client"

RDEPENDS:${PN} += "python-abi \
python311-requests"

inherit rpm
