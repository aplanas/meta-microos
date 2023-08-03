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

RPM_NAME = "python311-execnet-2.0.2-1.1.noarch.rpm"
RPM_HASH = "b07de1c9da0e890042c32fc9f688e7f9e6427d2c3cd71ac0f716425f3adf6f721e1ac1beacc120655c5429c5464fb6ccf9e39295b16c48376db0d8bc7e95572f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-execnet \
python3.11dist-execnet \
python311-execnet \
python3dist-execnet"

RDEPENDS:${PN} += "python-abi"

inherit rpm
