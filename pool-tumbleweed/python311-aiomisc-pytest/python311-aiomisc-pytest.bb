SUMMARY = "pytest integration for aiomisc"
DESCRIPTION = "This package contains a plugin for pytest."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python311-aiomisc-pytest-1.1.1-1.3.noarch.rpm"
RPM_HASH = "95757ae1f54843222d1db3438484f6fc1b90fd6da221dcf52d55803ef75894c2ea9726e9523fff12ff5177462bc0c34425585d30ccec8e57e344ab1f712279f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiomisc-pytest \
python3.11dist-aiomisc-pytest \
python311-aiomisc-pytest \
python3dist-aiomisc-pytest"

RDEPENDS:${PN} += "python-abi"

inherit rpm
