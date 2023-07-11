SUMMARY = "Python OpenID client"
DESCRIPTION = "Python client for OpenID including token caching and management."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python39-openidc-client-0.6.0-1.13.noarch.rpm"
RPM_HASH = "51217f5b3271e0ce6a79026d0fdbf37d9531bb19b44eb3a6d9fab1fcd2a729921a8cf79febdb78cd5c98acf187827531721200daa707dc05ac920a0a71fe576b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-openidc-client \
python39-openidc-client \
python3dist-openidc-client"

RDEPENDS:${PN} += "python-abi \
python39-requests"

inherit rpm
