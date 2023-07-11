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

RPM_NAME = "python310-execnet-1.9.0-3.3.noarch.rpm"
RPM_HASH = "dc2fe17ddbc4ddae7c8a4a71abf5f980151673bee9c3936e9b9a6cd45004499e9bd21cdd85da78d55f2d0d3e70a9a4c46b53e97f39e9d0d40c51beb44cd183a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-execnet \
python310-execnet \
python3dist-execnet"

RDEPENDS:${PN} += "python-abi"

inherit rpm
