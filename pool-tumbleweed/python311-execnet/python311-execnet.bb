SUMMARY = "Rapid multi-Python deployment"
DESCRIPTION = "execnet provides a share-nothing model with \
channel-send/receive communication for distributing \
execution across many Python interpreters across version, \
platform and network barriers. It has a minimal and fast \
API targetting the following uses: \
 \
 * distribute tasks to (many) local or remote CPUs \
 * write and deploy hybrid multi-process applications \
 * write scripts to administer multiple environments"
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "python311-execnet-1.9.0-3.3.noarch.rpm"
RPM_HASH = "56eb62af3da43a294fb91086b0db040fb671c3cc939a4de577facfb038f1cc4a0d88947aad4f65f890d74e9276b55f327c17ab3d69f9908cc7a1b4a6d0685e98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-execnet \
python3.11dist-execnet \
python311-execnet \
python3dist-execnet"

RDEPENDS:${PN} += "python-abi"

inherit rpm
