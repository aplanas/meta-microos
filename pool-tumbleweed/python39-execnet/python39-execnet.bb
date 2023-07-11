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

RPM_NAME = "python39-execnet-1.9.0-3.3.noarch.rpm"
RPM_HASH = "021560328a9f5b5014d47a70b46a9d343c1ac3fe1c3af02bd9e767afd9f57de7407910409e1d7ac0fd98dd1429a1199fe51e1c6e944357c2009282f92140f62d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-execnet \
python39-execnet \
python3dist-execnet"

RDEPENDS:${PN} += "python-abi"

inherit rpm
