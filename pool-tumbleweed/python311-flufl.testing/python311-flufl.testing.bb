SUMMARY = "A small collection of test tool plugins"
DESCRIPTION = "A small collection of test tool plugins"
LICENSE = "Apache-2.0"

PV = "0.8"

RPM_NAME = "python311-flufl.testing-0.8-2.1.noarch.rpm"
RPM_HASH = "c972fb335480a33b31544d88aeb2bd88a99bdad47a9bcf79dc3770c0f5054ba680eb1b4a1d17053090a73bc3a699f87b4009bc4ba7870f4bdc734309ee2fd4d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flufl.testing \
python3.11dist-flufl.testing \
python311-flufl.testing \
python3dist-flufl.testing"

RDEPENDS:${PN} += "python-abi"

inherit rpm
