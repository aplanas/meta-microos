SUMMARY = "Library for Hawk HTTP authorization"
DESCRIPTION = "Mohawk is an alternate Python implementation of the Hawk HTTP \
authorization scheme."
LICENSE = "MPL-2.0"

PV = "1.1.0"

RPM_NAME = "python311-mohawk-1.1.0-5.5.noarch.rpm"
RPM_HASH = "dc338b107e54b636f7f3eda227db4d458d934fc6cbc481ebcf9ea79fe7b5a8c04393696ad9a9e18ba0fe9c4bfa7010be06af53553c23d69e1413c0a8790d19be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mohawk \
python3.11dist-mohawk \
python311-mohawk \
python3dist-mohawk"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
