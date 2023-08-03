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

RPM_NAME = "python39-execnet-2.0.2-1.1.noarch.rpm"
RPM_HASH = "8e24d53fdc109241409b5aa68b3874d6e57be9d4b9dd52628e0f25047b63ce0ae23c33ab4c950a5dd2a3973be4821ec451a70f3ebc0d7e24405916380e141acf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-execnet \
python39-execnet \
python3dist-execnet"

RDEPENDS:${PN} += "python-abi"

inherit rpm
