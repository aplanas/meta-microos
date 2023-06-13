SUMMARY = "A small collection of test tool plugins"
DESCRIPTION = "A small collection of test tool plugins"
LICENSE = "Apache-2.0"

PV = "0.8"

RPM_NAME = "python311-flufl.testing-0.8-1.13.noarch.rpm"
RPM_HASH = "ad5abb6a4707feb0655f1c74d81aecc127eac12bd755c04b7d26df83b0ec463611a92ad203c597fa73bfcedf81ce4b270569fe4b1b460aa6a07983122c711164"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flufl.testing) \
python311-flufl.testing \
python3dist(flufl.testing)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
