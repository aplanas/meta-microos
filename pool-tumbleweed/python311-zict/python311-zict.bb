SUMMARY = "Mutable mapping tools"
DESCRIPTION = "Mutable Mapping interfaces for python."
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "python311-zict-2.2.0-1.3.noarch.rpm"
RPM_HASH = "d52363c01f13e37b46ec4b2e582f3562dc4735c7151e731ddd0e9aa4d36ff9f9c39c5a9fbec0aab4e14996ef015f4300a7862d2b91e322cbc997bf104edd2067"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-zict \
python311-zict \
python3dist-zict"

RDEPENDS:${PN} += "python-abi \
python311-HeapDict"

inherit rpm
