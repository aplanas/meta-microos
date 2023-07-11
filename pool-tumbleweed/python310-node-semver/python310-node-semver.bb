SUMMARY = "Port of node-semver"
DESCRIPTION = "python version of node-semver (https://github.com/isaacs/node-semver)"
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python310-node-semver-0.9.0-1.4.noarch.rpm"
RPM_HASH = "b2b8171203db20c943f8a2e81b7d47908ea251d603b04ed88fbbbb5fbd23e6ab500207889d95befbc8c2cb797cee034a1200119a6c38ab6987795e95c0ef7be0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-node-semver \
python310-node-semver \
python3dist-node-semver"

RDEPENDS:${PN} += "python-abi"

inherit rpm
