SUMMARY = "Python Left-Right Parser"
DESCRIPTION = "Python Left-Right Parser."
LICENSE = "MIT"

PV = "1.3.3"

RPM_NAME = "python310-pyleri-1.3.3-1.10.noarch.rpm"
RPM_HASH = "d47e1b24149fa7b3cbcd821d6f5e6ea5b1b16d54141149c1b512fd2080755e568e1f9ff503c4de9f2dce810aafc0ab7d6db80abd57f8fd85f47f5b4a5bffb8ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyleri \
python310-pyleri \
python3dist-pyleri"

RDEPENDS:${PN} += "python-abi"

inherit rpm
