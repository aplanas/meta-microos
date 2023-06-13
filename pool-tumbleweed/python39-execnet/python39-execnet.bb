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

RPM_NAME = "python39-execnet-1.9.0-3.1.noarch.rpm"
RPM_HASH = "83079beb92981683c5b289b592a7be260cdd6a5e6e7bb64d0074a24d4961116dee74c26ec7c5f058c0acc175a087b18777f5bcd73b7c02daaf9ce42ae96206f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(execnet) \
python39-execnet \
python3dist(execnet)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
