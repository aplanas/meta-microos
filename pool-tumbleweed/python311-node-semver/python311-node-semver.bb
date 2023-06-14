SUMMARY = "Port of node-semver"
DESCRIPTION = "python version of node-semver (https://github.com/isaacs/node-semver)"
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python311-node-semver-0.9.0-1.2.noarch.rpm"
RPM_HASH = "c11848138dc11c7166de726c49daae438086191de2ca705aa7ae703eb59aa7d93b7f4f24986e5b6c68b467bd1f09e0012df75c88520eb0ba2b38cadac7f2eb3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-node-semver \
python311-node-semver \
python3dist-node-semver"

RDEPENDS:${PN} += "python-abi"

inherit rpm
