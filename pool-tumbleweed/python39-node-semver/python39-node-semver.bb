SUMMARY = "Port of node-semver"
DESCRIPTION = "python version of node-semver (https://github.com/isaacs/node-semver)"
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python39-node-semver-0.9.0-1.4.noarch.rpm"
RPM_HASH = "e137c28365dcf715425f17be5412ae8d03ce28e041c6de6ace15e0a15954706771b889d01ca0fe1f990d933450f10109185d981914b5c660c7447ddf05d7bb77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-node-semver \
python39-node-semver \
python3dist-node-semver"

RDEPENDS:${PN} += "python-abi"

inherit rpm
