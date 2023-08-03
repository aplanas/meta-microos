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

PV = "2.0.2"

RPM_NAME = "python310-execnet-2.0.2-1.1.noarch.rpm"
RPM_HASH = "da69b8ff85b778c2e74d13ce5c649df9b9076a891eb668d0c4eecc24280fa9d668bb5adc024257cf62ee12289bf7d0fbb60008ca6265a8b19762d926400b8e3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-execnet \
python310-execnet \
python3dist-execnet"

RDEPENDS:${PN} += "python-abi"

inherit rpm
