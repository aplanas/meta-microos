SUMMARY = "Port of node-semver"
DESCRIPTION = "python version of node-semver (https://github.com/isaacs/node-semver)"
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python310-node-semver-0.9.0-1.2.noarch.rpm"
RPM_HASH = "d4b03088fde4368e71113bf912b6ce1eddfa1ccbed142ee6a3b94176155e8d4ac41059cb3ac4b16fad6f1c5e653936620f7c3c99bfcd44356a24d2b17cc6eae0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-node-semver \
python3.10dist-node-semver \
python310-node-semver \
python3dist-node-semver"

RDEPENDS:${PN} += "python-abi"

inherit rpm
