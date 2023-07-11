SUMMARY = "Port of node-semver"
DESCRIPTION = "python version of node-semver (https://github.com/isaacs/node-semver)"
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python311-node-semver-0.9.0-1.4.noarch.rpm"
RPM_HASH = "e4f1f8d748a85fb2df6a17039848104b65dcc3d74e1113fb6550bacbb7ce290f99003580ba83dbfef665063fe825b6188d123a76195b017d8d133a7064958f6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-node-semver \
python3.11dist-node-semver \
python311-node-semver \
python3dist-node-semver"

RDEPENDS:${PN} += "python-abi"

inherit rpm
